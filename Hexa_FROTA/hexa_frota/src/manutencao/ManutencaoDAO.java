/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manutencao;

import java.sql.Connection;
import java.sql.Date;
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
            stmt.setDate(1, (Date) manutencao.getDataFinal());
            stmt.setDate(2, (Date) manutencao.getDataInicial());
            stmt.setDate(3, (Date) manutencao.getHoraFinal());
            stmt.setDate(4, (Date) manutencao.getHoraInicial());
            stmt.setInt(5, manutencao.getId());
            stmt.setString(6, manutencao.getObservacao());
            stmt.setObject(7, manutencao.getRegistroPreventivoId());
            stmt.setObject(8, manutencao.getStatusVtrId());
            stmt.setObject(9, manutencao.getVeiculoId());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
