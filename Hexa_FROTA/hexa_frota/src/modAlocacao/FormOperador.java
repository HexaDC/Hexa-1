package modAlocacao;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import util.TableDAO;

/**
 *
 * @author Jenny
 */
public class FormOperador extends javax.swing.JFrame {

    private int largura = 835;
    private int altura = 630;

    public FormOperador() {
        initComponents();

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
        // setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoPesquisa = new javax.swing.ButtonGroup();
        btnGrupoSituacao = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        rdoHabilitacao = new javax.swing.JRadioButton();
        rdoNome = new javax.swing.JRadioButton();
        rdoMatricula = new javax.swing.JRadioButton();
        txtPesquisa = new javax.swing.JTextField();
        rdoListar = new javax.swing.JRadioButton();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOperador = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator5 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Operador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 799, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Pesquisar por:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 48, -1, -1));

        btnGrupoPesquisa.add(rdoHabilitacao);
        rdoHabilitacao.setText("Nº Habilitação");
        getContentPane().add(rdoHabilitacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 44, -1, -1));

        btnGrupoPesquisa.add(rdoNome);
        rdoNome.setText("Nome (operador)");
        getContentPane().add(rdoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 44, -1, -1));

        btnGrupoPesquisa.add(rdoMatricula);
        rdoMatricula.setText("Nº Matrícula");
        getContentPane().add(rdoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 44, -1, -1));
        getContentPane().add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 69, 712, -1));

        btnGrupoPesquisa.add(rdoListar);
        rdoListar.setText("Listar Todos");
        getContentPane().add(rdoListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 44, -1, -1));

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/procurar2.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 74, -1, -1));

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
        tblOperador.getColumnModel().getColumn(0).setMinWidth(0);
        tblOperador.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblOperador.getColumnModel().getColumn(0).setMaxWidth(0);
        tblOperador.getColumnModel().getColumn(1).setResizable(false);
        tblOperador.getColumnModel().getColumn(1).setPreferredWidth(60);
        tblOperador.getColumnModel().getColumn(2).setResizable(false);
        tblOperador.getColumnModel().getColumn(2).setPreferredWidth(330);
        tblOperador.getColumnModel().getColumn(3).setResizable(false);
        tblOperador.getColumnModel().getColumn(4).setResizable(false);
        tblOperador.getColumnModel().getColumn(4).setPreferredWidth(60);
        tblOperador.getColumnModel().getColumn(5).setResizable(false);
        tblOperador.getColumnModel().getColumn(5).setPreferredWidth(100);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 95, 704, 182));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 114, 69, -1));

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete1.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 143, -1, -1));

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/novo2.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 172, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 283, 799, 10));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nº de Matrícula:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setText("Nome (completo):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 11, 673, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 37, 275, -1));

        jLabel5.setText("Nº Habilitação:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, -1, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 79, 275, -1));

        jLabel6.setText("Categoria:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 82, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 79, 66, -1));

        jLabel7.setText("Data de venc.:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 82, -1, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 79, 84, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 762, 10));

        jLabel8.setText("Situação:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, -1));

        jLabel9.setText("Foto:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 127, 400, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Nova Imagem");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Viualizar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 126, -1, -1));

        btnGrupoSituacao.add(jRadioButton1);
        jRadioButton1.setText("ATIVO");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 101, -1, -1));

        btnGrupoSituacao.add(jRadioButton2);
        jRadioButton2.setText("INATIVO");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 101, -1, -1));

        jTabbedPane1.addTab("Informações Pessoais", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Logradouro:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jTextField6.setText("jTextField6");
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 11, 513, -1));

        jLabel11.setText("/ Nº:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 14, -1, -1));

        jTextField7.setText("jTextField7");
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 11, 147, -1));

        jLabel12.setText("Bairro:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jTextField8.setText("jTextField8");
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 37, 513, -1));

        jLabel13.setText("Complemento:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        jTextField9.setText("jTextField9");
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 63, 691, -1));

        jLabel14.setText("CEP:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        jTextField10.setText("jTextField10");
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 90, 165, -1));

        jButton3.setText("Buscar");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 89, -1, -1));

        jLabel15.setText("Cidade:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, -1, -1));

        jTextField11.setText("jTextField11");
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 118, 317, -1));

        jLabel16.setText("UF:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, -1, -1));

        jTextField12.setText("jTextField12");
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 144, 317, -1));

        jTabbedPane1.addTab("Informações Complementares - I", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Tipo Sanguineo:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jTextField13.setText("jTextField6");
        jPanel3.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 11, 180, -1));

        jLabel19.setText("Telefone Residencial:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jTextField15.setText("jTextField8");
        jPanel3.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 37, 180, -1));

        jLabel20.setText("Telefone Celular:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        jTextField16.setText("jTextField9");
        jPanel3.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 63, 180, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 764, 10));

        jLabel18.setText("Nº RG:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, -1, -1));

        jTextField14.setText("jTextField14");
        jPanel3.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 105, 179, -1));

        jTextField17.setText("jTextField14");
        jPanel3.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 131, 179, -1));

        jLabel21.setText("Nº CPF:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, -1, -1));

        jTabbedPane1.addTab("Informações Complementares - II", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Observação:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 11, 698, 156));

        jTabbedPane1.addTab("Informações Complementares - III", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 299, -1, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 511, 799, 10));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Concluir CADASTRO");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 527, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Concluir EDIÇÃO");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 527, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        try {
            preenche_jtable();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormOperador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGrupoPesquisa;
    private javax.swing.ButtonGroup btnGrupoSituacao;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton rdoHabilitacao;
    private javax.swing.JRadioButton rdoListar;
    private javax.swing.JRadioButton rdoMatricula;
    private javax.swing.JRadioButton rdoNome;
    private javax.swing.JTable tblOperador;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {
        TableDAO dao = new TableDAO();

        DefaultTableModel modelo = (DefaultTableModel) tblOperador.getModel();
        modelo.setNumRows(0);

        String pes = txtPesquisa.getText().toUpperCase();

        if (pes.equals("")) {
            if (rdoListar.isSelected() == true) {
                try {
                    ResultSet resultado = dao.consultaTable("SELECT id, matricula, nome, habilitacao, categoria, status "
                            + "FROM operador ORDER BY nome ASC");
                    while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                    {

                        modelo.addRow(new Object[]{resultado.getInt("id"),
                                    resultado.getString("matricula"),
                                    resultado.getString("nome"),
                                    resultado.getString("habilitacao"),
                                    resultado.getString("categoria"),
                                    resultado.getInt("status")});
                    }
                    resultado.first();
                } catch (SQLException erro) {
                    throw new RuntimeException(erro);
                }
            }
        } else if (pes.equals(pes)) {
            if (rdoNome.isSelected() == true) {
                try {
                    ResultSet resultado = dao.consultaTable("SELECT id, matricula, nome, habilitacao, categoria, status "
                            + "FROM operador WHERE nome LIKE '%" + pes + "%' ORDER BY nome ASC");
                    while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                    {

                        modelo.addRow(new Object[]{resultado.getInt("id"),
                                    resultado.getString("matricula"),
                                    resultado.getString("nome"),
                                    resultado.getString("habilitacao"),
                                    resultado.getString("categoria"),
                                    resultado.getInt("status")});
                    }
                    resultado.first();
                } catch (SQLException erro) {
                    throw new RuntimeException(erro);
                }
            } else {
                if (rdoHabilitacao.isSelected() == true) {
                    try {
                        ResultSet resultado = dao.consultaTable("SELECT id, matricula, nome, habilitacao, categoria, status "
                                + "FROM operador WHERE habilitacao LIKE '%" + pes + "%' ORDER BY nome ASC");
                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                        {

                            modelo.addRow(new Object[]{resultado.getInt("id"),
                                        resultado.getString("matricula"),
                                        resultado.getString("nome"),
                                        resultado.getString("habilitacao"),
                                        resultado.getString("categoria"),
                                        resultado.getInt("status")});
                        }
                        resultado.first();
                    } catch (SQLException erro) {
                        throw new RuntimeException(erro);
                    }
                } else {
                    if (rdoMatricula.isSelected() == true) {
                        try {
                            ResultSet resultado = dao.consultaTable("SELECT id, matricula, nome, habilitacao, categoria, status "
                                    + "FROM operador WHERE matricula LIKE '%" + pes + "%'ORDER BY nome ASC");
                            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                            {

                                modelo.addRow(new Object[]{resultado.getInt("id"),
                                            resultado.getString("matricula"),
                                            resultado.getString("nome"),
                                            resultado.getString("habilitacao"),
                                            resultado.getString("categoria"),
                                            resultado.getInt("status")});
                            }

                            resultado.first();
                        } catch (SQLException erro) {
                            throw new RuntimeException(erro);
                        }
                    }
                }
            }
        }
    }
}
