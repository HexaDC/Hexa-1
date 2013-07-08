/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import tipoAtendimento.TipoAtendimento;
import util.ConnectionFactory;

/**
 *
 * @author Jenny
 */
public class ProcedimentoDAO {

    private Connection connection;

    public ProcedimentoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            System.err.println("Erro: " + e.getLocalizedMessage());
        }
    }
    //Query de Inserção de registros
    private static String INSERIR_PROCEDIMENTO = "INSERT INTO procedimento (descricao, codigo)"
            + "VALUES (?,?);";
    //Seleciona determinado procedimento
    private static String SELECIONA_DADOS_PROCEDIMENTO = "SELECT * FROM procedimento WHERE id = '";
    //Seleciona os códigos existentes no sistema
    private static String SELECIONA_CODIGO_PROCEDIMENTO = "SELECT * FROM procedimento WHERE codigo = '";
    //Atualização de registros
    private static String EDITAR_DADOS_PROCEDIMENTO = "UPDATE procedimento SET codigo = ?, descricao = ? WHERE id = '";
    //Deleção de registro
    private static String DELETAR_DADOS_PROCEDIMENTO = "DELETE FROM procedimento WHERE id = '";
    //Gera uma lista com todos os procedimentos cadastrados
    private static String LISTAR_POCEDIMENTO = "SELECT * FROM procedimento";
    //Seleciona o ID do procedimento de acordo com o código 
    private static String SELECIONA_ID_PROCEDIMENTO = "SELECT id FROM procedimento WHERE codigo = '";
    //Seleciona os itens de ligação
    private static String SELECIONA_LIGACAO_ATEND_PROCED = "SELECT p.descricao FROM procedimento AS p "
            + "INNER JOIN tipoAtend_proced AS tp ON p.id = tp.procedimento_id "
            + "WHERE tp.tipo_atendimento_id = '";

    //Métodos da Classe ProcedimentoDAO
    //--- Inserir Procedimento 
    public void inserirProcedimento(Procedimento proc) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_PROCEDIMENTO);

            stmt.setString(1, proc.getDescricao());
            stmt.setString(2, proc.getCodigo());

            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }
    }

    //--- Pesquisa de determinado tipo de procedimento E exibe todos o seu conteúdo
    public List<Procedimento> getListaDadosProcedimento(Procedimento proc) throws SQLException {

        PreparedStatement sql = this.connection.prepareStatement(SELECIONA_DADOS_PROCEDIMENTO + proc.getId() + "';");
        ResultSet rs = sql.executeQuery();

        List<Procedimento> lista = new ArrayList<Procedimento>();
        try {

            while (rs.next()) {
                proc.setId(rs.getInt("id"));
                proc.setCodigo(rs.getString("codigo"));
                proc.setDescricao(rs.getString("descricao"));

                lista.add(proc);
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

    //Gera uma lista com todos com procedimentos cadastrados
    public DefaultListModel listaProcedimento() {
        String procedimento;
        DefaultListModel model = new DefaultListModel();
        try {
            PreparedStatement sql = this.connection.prepareStatement(LISTAR_POCEDIMENTO);
            ResultSet rs = sql.executeQuery();

            if (rs != null && rs.next()) {
                do {
                    procedimento = (rs.getString("descricao"));

                    model.addElement(procedimento);
                } while (rs.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("erro de SQL:" + e.getMessage());
        }
        return model;
    }

    //Seleciona ID de determinado Procedimento
    public int selecionarIdProcedimento(Procedimento proc) throws SQLException {
        int id;
        PreparedStatement sql = this.connection.prepareStatement(SELECIONA_ID_PROCEDIMENTO + proc.getDescricao() + "';");
        ResultSet rs = sql.executeQuery();
        if (rs.next()) {
            id = rs.getInt("id");
        } else {
            id = 0;
        }
        //fecha recordset
        rs.close();
        //fecha statement
        sql.close();
        return id;
    }
    
    //Seleciona os procedimentos ligados  a um determinado tipo de apoio
    public DefaultListModel listaProcedimentoTipoAtendimento(TipoAtendimento tipoAtend) {
        String procedimento;
        DefaultListModel model = new DefaultListModel();
        try {
            PreparedStatement sql = this.connection.prepareStatement(SELECIONA_LIGACAO_ATEND_PROCED+ tipoAtend.getId() + "';");
            ResultSet rs = sql.executeQuery();

            if (rs != null && rs.next()) {
                do {
                    procedimento = (rs.getString("descricao"));

                    model.addElement(procedimento);
                } while (rs.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("erro de SQL:" + e.getMessage());
        }

        return model;

    }

    //Edita determinado registro
    public void editarProcedimento(Procedimento procedimento) throws SQLException {
        try {

            PreparedStatement stmt = connection.prepareStatement(EDITAR_DADOS_PROCEDIMENTO + procedimento.getId() + "';");

            stmt.setString(1, procedimento.getCodigo());
            stmt.setString(2, procedimento.getDescricao());

            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //Exclui determinado registro
    public void deletarDadosProcedimento(Procedimento procedimento) throws SQLException {
        PreparedStatement sql = (PreparedStatement) this.connection.prepareStatement(DELETAR_DADOS_PROCEDIMENTO + procedimento.getId() + "';");
        sql.executeUpdate();
    }

    public boolean validarCodigoProcedimento(Procedimento procedimento) {
        boolean verifica = false;

        try {

            PreparedStatement sql = this.connection.prepareStatement(SELECIONA_CODIGO_PROCEDIMENTO + procedimento.getCodigo() + "';");
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
