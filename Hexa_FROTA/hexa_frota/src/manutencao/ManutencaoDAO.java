/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manutencao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class ManutencaoDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_MANUTENCAO = "INSERT INTO manutencao () "
            + "VALUES (?)";

    public ManutencaoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(Manutencao manutencao) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_MANUTENCAO);

            //Seta os valores
            stmt.setString(1, manutencao.getNome());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
