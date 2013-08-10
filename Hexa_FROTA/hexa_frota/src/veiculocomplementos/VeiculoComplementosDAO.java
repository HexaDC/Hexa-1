/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculocomplementos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class VeiculoComplementosDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_VEICULO_COMPLEMENTOS = "INSERT INTO veiculo_complementos () "
            + "VALUES (?)";

    public VeiculoComplementosDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(VeiculoComplementos veiculocomplementos) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_VEICULO_COMPLEMENTOS);

            //Seta os valores            
            stmt.setInt(1, veiculocomplementos.getAno());
            stmt.setInt(2, veiculocomplementos.getAnoFabricado());
            stmt.setDouble(3, veiculocomplementos.getCapacidadeTanque());
            stmt.setInt(4, veiculocomplementos.getCilindradas());
            stmt.setString(5, veiculocomplementos.getCor());
            stmt.setInt(6, veiculocomplementos.getId());
            stmt.setDouble(7, veiculocomplementos.getMediaConsumo());
            stmt.setInt(8, veiculocomplementos.getNumCilindros());
            stmt.setInt(9, veiculocomplementos.getNumMotor());
            stmt.setInt(10, veiculocomplementos.getNumRenavam());
            stmt.setString(11, veiculocomplementos.getObservacao());
            stmt.setInt(12, veiculocomplementos.getPortas());
            stmt.setInt(13, veiculocomplementos.getPotencia());
            stmt.setString(14, veiculocomplementos.getTipoCambio());
            stmt.setString(15, veiculocomplementos.getTipoCombustivel());
            stmt.setObject(16, veiculocomplementos.getVeiculoId());
            stmt.setString(17, veiculocomplementos.getAdicionais());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
