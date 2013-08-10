/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statusvtr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class StatusVtrDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_STATUSVTR = "INSERT INTO status_vtr () "
            + "VALUES (?)";

    public StatusVtrDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(StatusVtr statusvtr) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_STATUSVTR);

            //Seta os valores
            stmt.setInt(1, statusvtr.getId());
            stmt.setObject(2, statusvtr.getManutencaoCollection());
            stmt.setString(3, statusvtr.getTipo());
            stmt.setObject(4, statusvtr.getVeiculoCollection());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
