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
public class CombustivelContratadoDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_COMBUSTIVEL_CONTRATADO = "INSERT INTO combustivel_contratado () "
            + "VALUES (?)";

    public CombustivelContratadoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirCombustivelContratado(CombustivelContratado combustivelcontratado) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_COMBUSTIVEL_CONTRATADO);

            //Seta os valores
            stmt.setString(1, combustivelcontratado.getNome());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
