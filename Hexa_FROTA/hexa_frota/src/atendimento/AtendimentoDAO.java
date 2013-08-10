/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class AtendimentoDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_ATENDIMENTO = "INSERT INTO atendimento () "
            + "VALUES (?)";

    public AtendimentoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(Atendimento atendimento) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_ATENDIMENTO);

            //Seta os valores
            stmt.setString(1, atendimento.getNome());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
