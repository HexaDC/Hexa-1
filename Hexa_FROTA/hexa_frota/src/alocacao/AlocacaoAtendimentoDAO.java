/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alocacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class AlocacaoAtendimentoDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_ALOCACAO_ATENDIMENTO = "INSERT INTO alocacao_atendimento () "
            + "VALUES (?)";

    public AlocacaoAtendimentoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(AlocacaoAtendimento alocacaoatendimento) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_ALOCACAO_ATENDIMENTO);

            //Seta os valores
            stmt.setString(1, alocacaoatendimento.getNome());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
