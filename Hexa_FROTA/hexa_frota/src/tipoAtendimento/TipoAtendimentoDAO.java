/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoAtendimento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import procedimento.Procedimento;
import util.ConnectionFactory;

/**
 *
 * @author Jenny
 */
public class TipoAtendimentoDAO {

    private Connection connection;
    //Inserir novo tipo de atendimento
    private static String INSERIR_TIPO_ATENDIMENTO = "INSERT INTO tipo_atendimento (codigo, descricao) "
            + "VALUES (?, ?)";
    //Inserir a Ligação entreo Procedimento e Tipo de Atendimento
     private static String INSERIR_LIGACAO = "insert into atend_proced (tipo_atendimento_id, procedimento_id) "
            + "values (?, ?);";
    //Seleciona o descritivo de determino tipo de acordo com o código
    private static String SELECIONAR_TIPO = "SELECT * FROM tipo_atendimento WHERE codigo = '";
    //Seleciona o descritivo de determinado tipo de atendimento de acordo com o código
    private static String VALIDAR_CODIGO = "SELECT * FROM tipo_atendimento WHERE codigo = '";
    //Edita o tipo de ATENDIMENTO
    private static String EDITAR_TIPO_ATEND = "UPDATE tipo_atedimento SET codigo = ?, descricao = ? WHERE id = '";
    //Eclui Tipo de atendimento
    private static String DELETAR_TIPO_ATEND = "DELETE FROM tipo_atendimento WHERE id = '";

    public TipoAtendimentoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            System.err.println("Erro: " + e.getLocalizedMessage());
        }
    }

    public void inserirTipoAndamento(TipoAtendimento tipoAtend) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_TIPO_ATENDIMENTO);

            //Seta os valores
            stmt.setString(1, tipoAtend.getCodigo());
            stmt.setString(2, tipoAtend.getDescricao());


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
    
    // Inserir a ligação entre as table TipoAtendimento e Procedimento
    public void adicionarLigacao(TipoAtendimento tipoAtend) {
        try {
            // prepared statement para inserção
            PreparedStatement stmt =connection.prepareStatement(INSERIR_LIGACAO);
            //seta os valores
            for (int i = 0; i < tipoAtend.getListProcedimento().size(); i++) {
                Procedimento proc = tipoAtend.getListProcedimento().get(i);
                stmt.setInt(1, tipoAtend.getId());
                stmt.setInt(2, proc.getId());
                stmt.execute();
            }

            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //Seleciona o tipo de atendimento de acordo com o código
    public List<TipoAtendimento> getListaTipoAtendimento(TipoAtendimento tipoAtend) throws SQLException {

        PreparedStatement sql = this.connection.prepareStatement(SELECIONAR_TIPO + tipoAtend.getCodigo() + "';");
        ResultSet rs = sql.executeQuery();

        List<TipoAtendimento> lista = new ArrayList<TipoAtendimento>();
        try {
            while (rs.next()) {
                tipoAtend.setId(rs.getInt("id"));
                tipoAtend.setCodigo(rs.getString("codigo"));
                tipoAtend.setDescricao(rs.getString("descricao"));

                lista.add(tipoAtend);
            }
            
            rs.close();
            sql.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar conteúdo: " + e.getStackTrace());
        } catch (Exception e) {
            throw new RuntimeException("Erro: " + e.getLocalizedMessage());
        }
        return lista;
    }
    
    //Editar Tipo de Atendimento
    public void editarTipoAtendiment(TipoAtendimento tipoAtend) throws SQLException {
        try (PreparedStatement sql = connection.prepareStatement(EDITAR_TIPO_ATEND + tipoAtend.getId() + "';")) {

            sql.setString(1, (tipoAtend.getCodigo()));
            sql.setString(2, (tipoAtend.getDescricao()));

            sql.executeUpdate();
            sql.close();
        }
    }
    
    //Exclui o tipo de atendimento selecionado
    public void deletarTipoAtendimento(TipoAtendimento tipoAtend) throws SQLException {
        PreparedStatement sql = connection.prepareStatement(DELETAR_TIPO_ATEND + tipoAtend.getId() + "';");
        sql.executeUpdate();
    }
    public boolean validarCodigoTipoAtendimento(TipoAtendimento tipoAtend) {
        boolean verifica = false;
        try {

            PreparedStatement sql = this.connection.prepareStatement(VALIDAR_CODIGO + tipoAtend.getCodigo() + "';");
            ResultSet rs = sql.executeQuery();

            if (rs != null && rs.next()) {
                verifica = true;
            } else {
                verifica = false;
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return verifica;
    }
}
