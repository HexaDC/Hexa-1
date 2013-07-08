/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modAtendimento;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import procedimento.Procedimento;
import procedimento.ProcedimentoDAO;
import tipoAtendimento.TipoAtendimento;
import tipoAtendimento.TipoAtendimentoDAO;
import util.TableDAO;

public class FormCadastrarApoioProcedimento extends javax.swing.JFrame {
    
    private int largura = 790;
    private int altura = 600;
    DefaultListModel dlm = new DefaultListModel();
    
    public FormCadastrarApoioProcedimento() {
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

        txtId.setVisible(false);
        
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
        tblTipoAtendimento = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescritivo = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAddProcedimetoLista02 = new javax.swing.JButton();
        btnRemoveProcedimentoLista02 = new javax.swing.JButton();
        btnAddAllProcedimento = new javax.swing.JButton();
        btnRemoveAllProcedimentoLista02 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProcedimento_01 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstProcedimento_02 = new javax.swing.JList();
        btnAddNovoProcedimento = new javax.swing.JButton();
        btnConcluirCadastro = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnLimpar = new javax.swing.JButton();
        btnConcluirEdicao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Registro de Atendimento e Controle de Frota");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText(" Tipos de Atedimento");

        jLabel2.setText("Pesquisa:");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/procurar2.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblTipoAtendimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Apoio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTipoAtendimento.getTableHeader().setReorderingAllowed(false);
        tblTipoAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTipoAtendimentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTipoAtendimento);
        tblTipoAtendimento.getColumnModel().getColumn(0).setResizable(false);
        tblTipoAtendimento.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblTipoAtendimento.getColumnModel().getColumn(1).setResizable(false);
        tblTipoAtendimento.getColumnModel().getColumn(1).setPreferredWidth(600);

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete1.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel3.setText("Código:");

        txtCodigo.setFocusable(false);

        jLabel4.setText("Descritivo:");

        txtDescritivo.setColumns(20);
        txtDescritivo.setRows(5);
        txtDescritivo.setFocusable(false);
        jScrollPane2.setViewportView(txtDescritivo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tipo de Atendimento", jPanel1);

        jLabel5.setText("Lista:");

        btnAddProcedimetoLista02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddProcedimetoLista02.setText(">");
        btnAddProcedimetoLista02.setEnabled(false);
        btnAddProcedimetoLista02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProcedimetoLista02ActionPerformed(evt);
            }
        });

        btnRemoveProcedimentoLista02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemoveProcedimentoLista02.setText("<");
        btnRemoveProcedimentoLista02.setEnabled(false);
        btnRemoveProcedimentoLista02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveProcedimentoLista02ActionPerformed(evt);
            }
        });

        btnAddAllProcedimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddAllProcedimento.setText(">>");
        btnAddAllProcedimento.setEnabled(false);
        btnAddAllProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAllProcedimentoActionPerformed(evt);
            }
        });

        btnRemoveAllProcedimentoLista02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemoveAllProcedimentoLista02.setText("<<");
        btnRemoveAllProcedimentoLista02.setEnabled(false);

        jScrollPane3.setViewportView(lstProcedimento_01);

        jScrollPane4.setViewportView(lstProcedimento_02);

        btnAddNovoProcedimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddNovoProcedimento.setText("Adicionar Novo Procedimento");
        btnAddNovoProcedimento.setEnabled(false);
        btnAddNovoProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNovoProcedimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddNovoProcedimento)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddAllProcedimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveAllProcedimentoLista02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveProcedimentoLista02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddProcedimetoLista02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAddProcedimetoLista02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveProcedimentoLista02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddAllProcedimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveAllProcedimentoLista02))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddNovoProcedimento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Procedimentos", jPanel2);

        btnConcluirCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConcluirCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/concluir.png"))); // NOI18N
        btnConcluirCadastro.setText("CADASTRO Concluir ");
        btnConcluirCadastro.setEnabled(false);
        btnConcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirCadastroActionPerformed(evt);
            }
        });

        txtId.setEnabled(false);
        txtId.setFocusable(false);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/novo2.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnConcluirEdicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConcluirEdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/arrow_refresh.png"))); // NOI18N
        btnConcluirEdicao.setText("EDIÇÃO Concluir ");
        btnConcluirEdicao.setEnabled(false);
        btnConcluirEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirEdicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConcluirEdicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConcluirCadastro)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar)
                                .addGap(111, 111, 111)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jTabbedPane1)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jSeparator4)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConcluirCadastro)
                    .addComponent(btnConcluirEdicao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirCadastroActionPerformed
        try {
            TipoAtendimento tipoAtend = new TipoAtendimento();
            TipoAtendimentoDAO dao = new TipoAtendimentoDAO();
            
            tipoAtend.setCodigo(txtCodigo.getText());
            tipoAtend.setDescricao(txtDescritivo.getText().toUpperCase());
            
            if (tipoAtend.getCodigo().equals("")) {
                JOptionPane.showMessageDialog(null, "O campo CÓDIGO é obigatório!");
                txtCodigo.requestFocus();
                
            } else {
                if (tipoAtend.getDescricao().equals("")) {
                    JOptionPane.showMessageDialog(null, "O campo DESCRITIVO é obrigatório!");
                    txtDescritivo.requestFocus();
                }
            }
            
            ProcedimentoDAO dao2 = new ProcedimentoDAO();
            Procedimento proc = new Procedimento();

            //SELECIONA OS PROCEDIMENTOS DA JLIST
            List<Procedimento> listaProcedimento = new ArrayList<>();
            for (int i = 0; i < lstProcedimento_02.getModel().getSize(); i++) {
                Procedimento procedimento = new Procedimento();
                
                procedimento.setDescricao(lstProcedimento_02.getModel().getElementAt(i).toString());
                procedimento.setId(dao2.selecionarIdProcedimento(procedimento));
                listaProcedimento.add(procedimento);
                
                System.err.println(listaProcedimento);
            }
            
            tipoAtend.setListProcedimento(listaProcedimento);

            //SALVA AS INFORMAÇÕES NO BANCO DE DADOS
            dao.inserirTipoAndamento(tipoAtend);
            tipoAtend.setCodigo(txtCodigo.getText());
            
            java.util.List<TipoAtendimento> lista = dao.getListaTipoAtendimento(tipoAtend);
            
            for (TipoAtendimento cursor : lista) {
                txtId.setText(String.valueOf(cursor.getId()));
            }
            
            int id_cod = Integer.valueOf(txtId.getText());
            System.err.println(id_cod);
            dao.adicionarLigacao(tipoAtend);
            clearCamposParcial();
            
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
            
        } catch (Exception e) {
            throw new RuntimeException("Erro: " + e);
        }
    }//GEN-LAST:event_btnConcluirCadastroActionPerformed
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            
            TipoAtendimento tipoAtend = new TipoAtendimento();
            TipoAtendimentoDAO dao = new TipoAtendimentoDAO();
            
            tipoAtend.setCodigo(txtPesquisa.getText().toUpperCase());
            boolean validar = dao.validarCodigoTipoAtendimento(tipoAtend);
            
            if (validar == true) {
                preenche_jtable();
                JOptionPane.showMessageDialog(null, "O CÓDIGO de TIPO de ATENDIMENTO inserido já existe !");
                txtCodigo.requestFocus();
                
            } else {
                if (validar == false) {
                    Object[] options = {"Sim", "Não"};
                    Object opc = JOptionPane.showOptionDialog(null, "CÓDIGO de APOIO não cadastrado, deseja salvar ?", "Atendimento e Frota",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            options, options[0]);
                    
                    if (opc.toString().equals("0")) {
                        
                        ProcedimentoDAO dao2 = new ProcedimentoDAO();
                        
                        String codigo = txtPesquisa.getText();
                        txtCodigo.setText(codigo);
                        clearCamposParcial();
                        
                        DefaultListModel proc = dao2.listaProcedimento();
                        lstProcedimento_01.setModel(proc);
                        
                        desbloquearCamposCadastro();
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
    private void tblTipoAtendimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTipoAtendimentoMouseClicked
        try {
           
             TipoAtendimentoDAO dao = new TipoAtendimentoDAO();
             TipoAtendimento tipoAtend = new TipoAtendimento();
             Procedimento procedimento = new Procedimento();
             ProcedimentoDAO dao2 = new ProcedimentoDAO();

             tipoAtend.setCodigo(String.valueOf(tblTipoAtendimento.getValueAt(tblTipoAtendimento.getSelectedRow(), 0).toString()));
             java.util.List<TipoAtendimento> lista = dao.getListaTipoAtendimento(tipoAtend);

             for (TipoAtendimento cursor : lista) {

             txtId.setText(String.valueOf(cursor.getId()));
             txtCodigo.setText(cursor.getCodigo());
             txtDescritivo.setText(cursor.getDescricao());
             }
           
             int id = Integer.valueOf(txtId.getText());
             tipoAtend.setId(id);

             DefaultListModel proc = dao2.listaProcedimentoTipoAtendimento(tipoAtend);
             lstProcedimento_02.setModel(proc);

             btnEditar.setEnabled(true);
             btnExcluir.setEnabled(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela! " + e.getLocalizedMessage());
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_tblTipoAtendimentoMouseClicked
    
    private void btnAddProcedimetoLista02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProcedimetoLista02ActionPerformed
        if (lstProcedimento_01.getSelectedIndex() != 0) {
            if (lstProcedimento_02.getLastVisibleIndex() > 0) {
                boolean existe = false;
                for (short i = 0; i < lstProcedimento_02.getModel().getSize(); i++) {
                    String conteudo1 = lstProcedimento_01.getModel().getElementAt(i).toString();
                    String conteudo2 = lstProcedimento_02.getModel().getElementAt(i).toString();
                    if (conteudo1.equals(conteudo2)) {
                        existe = true;
                    }
                }
                if (!existe) {
                    dlm.addElement(lstProcedimento_01.getSelectedValue().toString());
                    lstProcedimento_02.setModel(dlm);
                }
            } else {
                dlm.addElement(lstProcedimento_01.getSelectedValue().toString());
                lstProcedimento_02.setModel(dlm);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um procedimento para ser adicionado!", "Alerta", 2);
        }
    }//GEN-LAST:event_btnAddProcedimetoLista02ActionPerformed
    
    private void btnRemoveProcedimentoLista02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveProcedimentoLista02ActionPerformed
        if (!dlm.isEmpty()) {
            if (lstProcedimento_02.getSelectedIndex() >= 0) {
                int pos = lstProcedimento_02.getSelectedIndex();
                dlm.remove(pos);
                lstProcedimento_02.setModel(dlm);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um procedimento para ser removido!", "Alerta", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não existe procedimento para ser removido da lista!", "Alerta", 2);
        }
    }//GEN-LAST:event_btnRemoveProcedimentoLista02ActionPerformed
    
    private void btnAddNovoProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNovoProcedimentoActionPerformed
        FormCadastrarProcedimento P = new FormCadastrarProcedimento();
        P.setVisible(true);
    }//GEN-LAST:event_btnAddNovoProcedimentoActionPerformed
    
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        clearCamposGeral();
    }//GEN-LAST:event_btnLimparActionPerformed
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        desbloquearCamposEditar();
    }//GEN-LAST:event_btnEditarActionPerformed
    
    private void btnAddAllProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAllProcedimentoActionPerformed
    }//GEN-LAST:event_btnAddAllProcedimentoActionPerformed
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConcluirEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirEdicaoActionPerformed
        
    }//GEN-LAST:event_btnConcluirEdicaoActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastrarApoioProcedimento().setVisible(true);
            }
        });
    }
    
    public void clearCamposParcial() {
        txtDescritivo.setText("");
        txtId.setText("");
        txtPesquisa.setText("");
        DefaultTableModel tableModel = (DefaultTableModel) tblTipoAtendimento.getModel();
        tableModel.setNumRows(0);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnConcluirCadastro.setEnabled(false);
    }
    
    void clearCamposGeral() {
        txtCodigo.setText("");
        txtDescritivo.setText("");
        txtId.setText("");
        txtPesquisa.setText("");
        DefaultTableModel tableModel = (DefaultTableModel) tblTipoAtendimento.getModel();
        tableModel.setNumRows(0);
        lstProcedimento_01.setModel(new DefaultListModel());
        lstProcedimento_02.setModel(new DefaultListModel());
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnConcluirCadastro.setEnabled(false);
        btnConcluirEdicao.setEnabled(false);
        btnAddAllProcedimento.setEnabled(false);
        btnAddProcedimetoLista02.setEnabled(false);
        btnRemoveAllProcedimentoLista02.setEnabled(false);
        btnRemoveProcedimentoLista02.setEnabled(false);
        btnAddNovoProcedimento.setEnabled(false);
        
    }
    
    void desbloquearCamposEditar() {
        txtCodigo.setFocusable(true);
        txtDescritivo.setFocusable(true);
        btnConcluirEdicao.setEnabled(true);
        btnAddAllProcedimento.setEnabled(true);
        btnAddProcedimetoLista02.setEnabled(true);
        btnRemoveAllProcedimentoLista02.setEnabled(true);
        btnRemoveProcedimentoLista02.setEnabled(true);
        btnAddNovoProcedimento.setEnabled(true);
    }
    
    void desbloquearCamposCadastro() {
        txtCodigo.setFocusable(true);
        txtDescritivo.setFocusable(true);
        btnConcluirCadastro.setEnabled(true);
        btnAddAllProcedimento.setEnabled(true);
        btnAddProcedimetoLista02.setEnabled(true);
        btnRemoveAllProcedimentoLista02.setEnabled(true);
        btnRemoveProcedimentoLista02.setEnabled(true);
        btnAddNovoProcedimento.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAllProcedimento;
    private javax.swing.JButton btnAddNovoProcedimento;
    private javax.swing.JButton btnAddProcedimetoLista02;
    private javax.swing.JButton btnConcluirCadastro;
    private javax.swing.JButton btnConcluirEdicao;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemoveAllProcedimentoLista02;
    private javax.swing.JButton btnRemoveProcedimentoLista02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList lstProcedimento_01;
    private javax.swing.JList lstProcedimento_02;
    private javax.swing.JTable tblTipoAtendimento;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescritivo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {
        TableDAO dao = new TableDAO();
        
        DefaultTableModel modelo = (DefaultTableModel) tblTipoAtendimento.getModel();
        modelo.setNumRows(0);
        
        String pes = txtPesquisa.getText().toUpperCase();
        
        if (pes.equals("")) {
            try {
                ResultSet resultado = dao.consultaTable("SELECT * FROM tipo_atendimento ORDER BY descricao ASC");
                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getString("codigo"),
                                resultado.getString("descricao")});
                }
                resultado.first();
            } catch (SQLException erro) {
                throw new RuntimeException(erro);
            }
            
        } else if (pes.equals(pes)) {
            try {
                ResultSet resultado = dao.consultaTable("SELECT * FROM tipo_atendimento WHERE descricao LIKE '%" + pes + "%' "
                        + "OR codigo LIKE '%" + pes + "%' ORDER BY descricao ASC");
                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getString("codigo"),
                                resultado.getString("descricao")});
                }
                resultado.first();
            } catch (SQLException erro) {
                throw new RuntimeException(erro);
            }
        }
        
    }
}
