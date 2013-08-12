/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modAtendimento;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import procedimento.Procedimento;
import procedimento.ProcedimentoDAO;
import util.TableDAO;

/**
 *
 * @author Jenny
 */
public class FormProcedimento extends javax.swing.JFrame {

    private int largura = 705;
    private int altura = 430;

    public FormProcedimento() {
        initComponents();
        txtId.setVisible(false);
        txtCodigo.setFocusable(false);
        txtDescritivo.setFocusable(false);

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        this.setSize(largura, altura);
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        // Move the window
        this.setLocation(x, y);
        this.setBounds(x, y, w, h);
        //  setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcedimento = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnLimpar = new javax.swing.JButton();
        btnConcluirEdicao = new javax.swing.JButton();
        btnConcluirCadastro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDescritivo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Atendimento e Controle de Frota");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Procedimentos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 658, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Pesquisar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 51, -1, -1));
        getContentPane().add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 49, 513, -1));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 48, -1, 22));

        tblProcedimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Código", "Descritivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProcedimento.getTableHeader().setReorderingAllowed(false);
        tblProcedimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProcedimentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProcedimento);
        tblProcedimento.getColumnModel().getColumn(0).setMinWidth(0);
        tblProcedimento.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblProcedimento.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProcedimento.getColumnModel().getColumn(1).setResizable(false);
        tblProcedimento.getColumnModel().getColumn(1).setPreferredWidth(60);
        tblProcedimento.getColumnModel().getColumn(2).setResizable(false);
        tblProcedimento.getColumnModel().getColumn(2).setPreferredWidth(400);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 76, 571, 219));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 301, 658, 10));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 95, 69, -1));

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete1.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 124, -1, -1));

        jLabel3.setText("Código:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 317, 141, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 369, 658, 5));

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/novo2.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 153, -1, -1));

        btnConcluirEdicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConcluirEdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/arrow_refresh.png"))); // NOI18N
        btnConcluirEdicao.setText(" EDIÇÃO Concluir");
        btnConcluirEdicao.setEnabled(false);
        btnConcluirEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirEdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluirEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 380, -1, -1));

        btnConcluirCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConcluirCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/concluir.png"))); // NOI18N
        btnConcluirCadastro.setText("CADASTRO Concluir");
        btnConcluirCadastro.setEnabled(false);
        btnConcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluirCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 380, -1, -1));

        jLabel4.setText("Descritivo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 346, -1, -1));
        getContentPane().add(txtDescritivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 343, 513, -1));

        txtId.setEnabled(false);
        txtId.setFocusable(false);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 317, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {

            Procedimento proc = new Procedimento();
            ProcedimentoDAO dao = new ProcedimentoDAO();

            proc.setCodigo(txtPesquisa.getText().toString());

            boolean validar = dao.validarCodigoProcedimento(proc);

            if (validar == true) {
                preenche_jtable();
                JOptionPane.showMessageDialog(null, "O CÓDIGO de PROCEDIMENTO inserido já existe !");
                txtCodigo.requestFocus();
            } else {
                if (validar == false) {
                    Object[] options = {"Sim", "Não"};
                    Object opc = JOptionPane.showOptionDialog(null, "CÓDIGO de PROCEDIMENTO não cadastrado, deseja salvar ?", "Atendimento e Frota",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            options, options[0]);

                    if (opc.toString().equals("0")) {

                        String codigo = txtPesquisa.getText().toString();
                        txtCodigo.setText(codigo);
                        proc.setDescricao(txtDescritivo.getText().toUpperCase());
                        proc.setCodigo(txtCodigo.getText());

                        //desbloqueia os botões e campos
                        txtCodigo.setFocusable(true);
                        txtDescritivo.setFocusable(true);
                        btnConcluirCadastro.setEnabled(true);

                        //Limpa os campos
                        txtPesquisa.setText("");
                        DefaultTableModel tableModel = (DefaultTableModel) tblProcedimento.getModel();
                        tableModel.setNumRows(0);
                    }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro: " + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnConcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirCadastroActionPerformed
        try {

            Procedimento proc = new Procedimento();
            ProcedimentoDAO dao = new ProcedimentoDAO();

            proc.setDescricao(txtDescritivo.getText().toUpperCase());
            proc.setCodigo(txtCodigo.getText());

            dao.inserirProcedimento(proc);
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
            
            btnConcluirCadastro.setEnabled(false);
            limparCamposGeral();

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }//GEN-LAST:event_btnConcluirCadastroActionPerformed

    private void tblProcedimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcedimentoMouseClicked
        Procedimento procedimento = new Procedimento();
        ProcedimentoDAO dao = new ProcedimentoDAO();

        try {

            procedimento.setId(Integer.valueOf(tblProcedimento.getValueAt(tblProcedimento.getSelectedRow(), 0).toString()));
            java.util.List<Procedimento> lista = dao.getListaDadosProcedimento(procedimento);

            for (Procedimento cursor : lista) {
                txtId.setText(String.valueOf(cursor.getId()));
                txtCodigo.setText(cursor.getCodigo());
                txtDescritivo.setText(cursor.getDescricao());
            }

            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_tblProcedimentoMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCamposGeral();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnConcluirEdicao.setEnabled(true);
        txtCodigo.setFocusable(true);
        txtDescritivo.setFocusable(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnConcluirEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirEdicaoActionPerformed
        try {

            Procedimento procedimento = new Procedimento();
            ProcedimentoDAO dao = new ProcedimentoDAO();

            procedimento.setId(Integer.valueOf(txtId.getText()));
            procedimento.setCodigo(txtCodigo.getText().toString());
            procedimento.setDescricao(txtDescritivo.getText().toUpperCase());

            dao.editarProcedimento(procedimento);

            JOptionPane.showMessageDialog(null, "Edição do registro efetuada com sucesso!");

            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnConcluirEdicao.setEnabled(false);
            txtCodigo.setFocusable(false);
            txtDescritivo.setFocusable(false);
            limparCamposGeral();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnConcluirEdicaoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {

            Procedimento procedimento = new Procedimento();
            ProcedimentoDAO dao = new ProcedimentoDAO();

            procedimento.setId(Integer.valueOf(txtId.getText()));

            Object[] options = {"Sim", "Não"};
            Object opc = JOptionPane.showOptionDialog(null, "Deseja excluir o registro do sistema ?", "Atendimento e Frota",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);

            if (opc.toString().equals("0")) {
                dao.deletarDadosProcedimento(procedimento);
                JOptionPane.showMessageDialog(null, "Registro ecluído com sucesso !");
            }

            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnConcluirEdicao.setEnabled(false);
            txtCodigo.setFocusable(false);
            txtDescritivo.setFocusable(false);
            limparCamposGeral();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProcedimento().setVisible(true);
            }
        });
    }

    void limparCamposGeral() {
        txtPesquisa.setText("");
        DefaultTableModel tableModel = (DefaultTableModel) tblProcedimento.getModel();
        tableModel.setNumRows(0);
        txtCodigo.setText("");
        txtDescritivo.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluirCadastro;
    private javax.swing.JButton btnConcluirEdicao;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblProcedimento;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescritivo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {
        TableDAO dao = new TableDAO();

        DefaultTableModel modelo = (DefaultTableModel) tblProcedimento.getModel();
        modelo.setNumRows(0);

        String pes = txtPesquisa.getText().toUpperCase();

        if (pes.equals("")) {
            try {
                ResultSet resultado = dao.consultaTable("SELECT * FROM procedimento ORDER BY descricao ASC");
                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getInt("id"),
                                resultado.getString("codigo"),
                                resultado.getString("descricao")});
                }
                resultado.first();
            } catch (SQLException erro) {
                throw new RuntimeException(erro);
            }

        } else if (pes.equals(pes)) {
            try {
                ResultSet resultado = dao.consultaTable("SELECT * FROM procedimento WHERE descricao LIKE '%" + pes + "%' "
                        + "OR codigo LIKE '%" + pes + "%' ORDER BY descricao ASC");
                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getInt("id"),
                                resultado.getString("codigo"),
                                resultado.getString("descricao")});
                }
                resultado.first();
            } catch (SQLException erro) {
                throw new RuntimeException(erro);
            }
        }

    }
}
