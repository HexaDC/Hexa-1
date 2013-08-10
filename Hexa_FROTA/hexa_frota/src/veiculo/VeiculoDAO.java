/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class VeiculoDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_VEICULO = "INSERT INTO veiculo () "
            + "VALUES ()";

    public VeiculoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirVeiculo(Veiculo veiculo) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_VEICULO);

            //Seta os valores
            stmt.setString(1, veiculo.getChassi());
            stmt.setInt(2, veiculo.getCodigo());
            stmt.setInt(3, veiculo.getId());
            stmt.setString(4, veiculo.getPlaca());
            stmt.setObject(5, veiculo.getStatusVtrId());
            stmt.setObject(6, veiculo.getMontadoraVtrId());
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
