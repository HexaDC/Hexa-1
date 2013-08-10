/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelovtr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class ModeloVtrDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_MODELOVTR = "INSERT INTO modelo_vtr () "
            + "VALUES (?)";

    public ModeloVtrDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(ModeloVtr modelovtr) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_MODELOVTR);

            //Seta os valores
            stmt.setInt(1, modelovtr.getId());
            stmt.setObject(2, modelovtr.getMontadoraVtrId());
            stmt.setString(3, modelovtr.getNome());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
