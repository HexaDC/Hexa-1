/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package montadora;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class MontadoraDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_MONTADORA = "INSERT INTO montadora_vtr () "
            + "VALUES (?)";

    public MontadoraDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(MontadoraVtr montadora) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_MONTADORA);

            //Seta os valores
            stmt.setInt(1, montadora.getId());
            stmt.setObject(2, montadora.getModeloVtrCollection());
            stmt.setString(3, montadora.getNome());
            stmt.setObject(4, montadora.getVeiculoCollection());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
