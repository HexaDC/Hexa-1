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
            
            stmt.setString(1, veiculo.getAdicionais());
            stmt.setInt(2, veiculo.getAno());
            stmt.setInt(3, veiculo.getAnoFabricado());
            stmt.setDouble(4, veiculo.getCapacidadeTanque());
            stmt.setString(5, veiculo.getChassi());
            stmt.setInt(6, veiculo.getCilindradas());
            stmt.setInt(7, veiculo.getCodigo());
            stmt.setString(8, veiculo.getCor());
            stmt.setInt(9, veiculo.getId());
            stmt.setDouble(10, veiculo.getMediaConsumo());
            stmt.setInt(11, veiculo.getNumCilindros());
            stmt.setInt(12, veiculo.getNumMotor());
            stmt.setInt(13, veiculo.getNumRenavam());
            stmt.setString(14, veiculo.getObservacao());
            stmt.setString(15, veiculo.getPlaca());
            stmt.setInt(16, veiculo.getPortas());
            stmt.setInt(17, veiculo.getPotencia());
            stmt.setInt(18, veiculo.getStatusVtrId());
            stmt.setString(19, veiculo.getTipoCambio());
            stmt.setString(20, veiculo.getTipoCombustivel());
            stmt.setInt(21, veiculo.getVeiculoId());
            stmt.setObject(22s, veiculo.getModeloVtr());
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
