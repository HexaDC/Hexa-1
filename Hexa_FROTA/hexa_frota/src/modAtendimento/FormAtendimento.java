/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modAtendimento;

/**
 *
 * @author Jenny
 */
public class FormAtendimento extends javax.swing.JFrame {

    /**
     * Creates new form FormAtendimento
     */
    public FormAtendimento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOperador = new javax.swing.JTable();
        txtPesquisa1 = new javax.swing.JTextField();
        btnPesquisa1 = new javax.swing.JButton();
        txtPesquisa2 = new javax.swing.JTextField();
        btnPesquisa2 = new javax.swing.JButton();
        txtPesquisa3 = new javax.swing.JTextField();
        btnPesquisa3 = new javax.swing.JButton();
        txtPesquisa4 = new javax.swing.JTextField();
        btnPesquisa4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOperador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nº Matrícula", "Nome", "Nº Habilitação", "Categoria", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOperador.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblOperador);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 100));

        txtPesquisa1.setText("Número da Viatúra");
        txtPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisa1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 139, -1));

        btnPesquisa1.setText("Pesquisar");
        btnPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, -1));

        txtPesquisa2.setText("Nome do Agente");
        txtPesquisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisa2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 139, -1));

        btnPesquisa2.setText("Pesquisar");
        btnPesquisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisa2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 140, -1));

        txtPesquisa3.setText("Código da Ocorrência");
        getContentPane().add(txtPesquisa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 139, -1));

        btnPesquisa3.setText("Pesquisar");
        btnPesquisa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisa3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 140, -1));

        txtPesquisa4.setText("Código da Ocorrência");
        getContentPane().add(txtPesquisa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 139, -1));

        btnPesquisa4.setText("Pesquisar");
        btnPesquisa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisa4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 140, -1));

        jTextField1.setText("Data Inicial");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, -1));

        jTextField2.setText("hora inicial");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, -1));

        jTextField3.setText("Data final");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 70, -1));

        jTextField4.setText("hora final");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 60, -1));

        jTextField5.setText("Status");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 60, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Descrição\n");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 550, -1));

        jTextField6.setText("logradouro");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 320, -1));

        jTextField7.setText("complemento");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jTextField8.setText("bairro");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, -1));

        jTextField9.setText("cidade");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 70, -1));

        jTextField10.setText("estado");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 60, -1));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 100, 110));

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 90, 110));

        jButton1.setText("<");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        jButton2.setText(">");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        jLabel1.setText("Alocadas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        jLabel2.setText("Disponíveis");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisa1ActionPerformed

    private void btnPesquisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisa2ActionPerformed

    private void txtPesquisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisa2ActionPerformed

    private void btnPesquisa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisa3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisa3ActionPerformed

    private void txtPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisa1ActionPerformed

    private void btnPesquisa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisa4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAtendimento().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisa1;
    private javax.swing.JButton btnPesquisa2;
    private javax.swing.JButton btnPesquisa3;
    private javax.swing.JButton btnPesquisa4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tblOperador;
    private javax.swing.JTextField txtPesquisa1;
    private javax.swing.JTextField txtPesquisa2;
    private javax.swing.JTextField txtPesquisa3;
    private javax.swing.JTextField txtPesquisa4;
    // End of variables declaration//GEN-END:variables
}
