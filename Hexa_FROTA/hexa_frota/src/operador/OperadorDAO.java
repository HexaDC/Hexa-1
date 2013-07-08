/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import tipoAtendimento.TipoAtendimento;
import util.ConnectionFactory;

/**
 *
 * @author Jenny
 */
public class OperadorDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_OPERADOR = "INSERT INTO operador (nome, matricula, habilitacao, categoria, "
            + "dt_vencimento_hab, tipo_sanguineo, logradouro, bairro, numero, complemento, cidade, estado, tel_celular, "
            + "tel_residencia, status, data_cadastro, observacao, foto, numero_rg, numero_cpf) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?)";

    public OperadorDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirOperador(Operador operador) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_OPERADOR);

            //Seta os valores
            stmt.setString(1, operador.getNome());
            stmt.setString(2, operador.getMatricula());
            stmt.setString(3, operador.getHabilitacao());
            stmt.setString(4, operador.getCategoria());
            //stmt.setDate(5, operador.getDtVencimentoHab());
            stmt.setString(6, operador.getTipoSanguineo());
            stmt.setString(7, operador.getLogradouro());
            stmt.setString(8, operador.getBairro());
            stmt.setString(9, operador.getNumero());
            stmt.setString(10, operador.getComplemento());
            stmt.setString(11, operador.getCidade());
            stmt.setString(12, operador.getEstado());
            stmt.setString(13, operador.getTelCelular());
            stmt.setString(14, operador.getTelResidencia());
            stmt.setInt(15, operador.getStatus());
            //stmt.setString(16, operador.getDataCadastro());
            stmt.setString(17, operador.getObservacao());
            stmt.setString(18, operador.getFoto());
            stmt.setString(19, operador.getNumeroRg());
            stmt.setString(20, operador.getNumeroCpf());
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
