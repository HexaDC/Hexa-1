/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Guilherme Valarelli
 */
public class AtendimentoDAO {

    private Connection connection;
    //Query de cadastro
    private static String INSERIR_ATENDIMENTO = "INSERT INTO atendimento () "
            + "VALUES (?)";

    public AtendimentoDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirMudar(Atendimento atendimento) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR_ATENDIMENTO);

            //Seta os valores
            stmt.setObject(1, atendimento.getAlocacaoAtendimentoCollection());
            stmt.setString(2, atendimento.getBairro());
            stmt.setString(3, atendimento.getCidade());
            stmt.setString(4, atendimento.getComplemento());
            stmt.setDate(5, (Date) atendimento.getDataFinalAtendimento());
            stmt.setDate(6, (Date) atendimento.getDataInicialAtendimento());
            stmt.setString(7, atendimento.getDescricao());
            stmt.setString(8, atendimento.getEstado());
            stmt.setString(9, atendimento.getHoraFinalAtendimento());
            stmt.setString(10, atendimento.getHoraInicialAtendimento());
            stmt.setInt(11, atendimento.getId());
            stmt.setString(12, atendimento.getLogradouro());
            stmt.setInt(13, atendimento.getNumeroAtendimento());
            stmt.setInt(14, atendimento.getStatus());
            stmt.setObject(15, atendimento.getTipoAtendimentoId());
           
            


            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }

    }
}
