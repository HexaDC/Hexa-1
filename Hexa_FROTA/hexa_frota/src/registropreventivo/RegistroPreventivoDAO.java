/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package registropreventivo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class RegistroPreventivoDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_REGISTRO_PREVENTIVO = "INSERT INTO registro_preventivo () "
            + "VALUES (?)";

    public RegistroPreventivoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(RegistroPreventivo registropreventivo) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_REGISTRO_PREVENTIVO);

            //Seta os valores
            stmt.setInt(1, registropreventivo.getId());
            stmt.setDouble(2, registropreventivo.getKmPrevencao());
            stmt.setObject(3, registropreventivo.getManutencaoCollection());
            stmt.setString(4, registropreventivo.getPeriodo());
            stmt.setString(5, registropreventivo.getTipoPreventivo());
            stmt.setObject(6, registropreventivo.getVeiculoId());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
