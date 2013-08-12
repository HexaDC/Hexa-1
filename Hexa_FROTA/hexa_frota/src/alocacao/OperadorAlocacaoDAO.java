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
public class OperadorAlocacaoDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_OPERADOR_ALOCACAO = "INSERT INTO operador_alocacao () "
            + "VALUES (?)";

    public OperadorAlocacaoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(OperadorAlocacao operadoralocacao) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_OPERADOR_ALOCACAO);

            //Seta os valores
            stmt.setObject(1, operadoralocacao.getAlocacaoId());
            stmt.setObject(2, operadoralocacao.getId());
            stmt.setObject(3, operadoralocacao.getOperadorId());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
