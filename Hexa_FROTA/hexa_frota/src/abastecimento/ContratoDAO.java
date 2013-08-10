/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abastecimento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class ContratoDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_CONTRATO = "INSERT INTO contrato () "
            + "VALUES (?)";

    public ContratoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(Contrato contrato) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_CONTRATO);

            //Seta os valores
            stmt.setString(1, contrato.getNome());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
