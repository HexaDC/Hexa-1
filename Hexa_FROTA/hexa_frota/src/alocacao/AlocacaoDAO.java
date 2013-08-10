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
public class AlocacaoDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_ALOCACAO = "INSERT INTO alocacao () "
            + "VALUES (?)";

    public AlocacaoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(Alocacao alocacao) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_ALOCACAO);

            //Seta os valores
            stmt.setString(1, alocacao.getNome());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
