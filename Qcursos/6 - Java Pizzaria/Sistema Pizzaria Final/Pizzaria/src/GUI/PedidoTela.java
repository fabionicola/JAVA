/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Beans.ClienteBeans;
import Beans.PedidoBeans;
import Controller.ClienteController;
import Controller.PedidoController;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author hugov
 */
public class PedidoTela extends javax.swing.JInternalFrame {
    
    ClienteBeans ClienteB;
    PedidoBeans PedidoB;
    ClienteController ClienteC;
    PedidoController PedidoC;
    List<String>Lista;
    List<String>ListadeItens;
    DefaultTableModel Modelo;
    DecimalFormat formatoDecimal;
    int CodigoFuncionario;
    Date DataAtual;
    SimpleDateFormat formatoData, formatoHora;
 
    MaskFormatter FormatoTel;
    
    public PedidoTela(int CodigoFuncionario) {
        initComponents();
        habilitarCampos(false);
        Lista = new ArrayList<>();
        ListadeItens = new ArrayList<>();
        
        ClienteB = new ClienteBeans();
        ClienteC = new ClienteController();
        PedidoB = new PedidoBeans();
        PedidoC = new PedidoController();
        
        PainelCliente.setEnabledAt(1, false);
        Modelo = (DefaultTableModel)tabela.getModel();
        
       formatoDecimal = new DecimalFormat("0.00");
       tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
       this.CodigoFuncionario = CodigoFuncionario;
       
       formatoData = new SimpleDateFormat("yyyy-MM-dd");
       formatoHora = new SimpleDateFormat("HH:mm:ss");
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
        jTable1 = new javax.swing.JTable();
        PainelCliente = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btn_pesquisar = new javax.swing.JButton();
        cb_clientes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_rua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        try {
            FormatoTel = new MaskFormatter("(##) #####-####");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Campo personalizado", "Erro", 0);
        }
        txt_tel = new JFormattedTextField(FormatoTel);
        jLabel6 = new javax.swing.JLabel();
        txt_data = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_nome_cliente = new javax.swing.JTextField();
        txt_item = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cb_itens = new javax.swing.JComboBox<>();
        btn_valor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        txt_quantidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_cod_pedido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_add = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btn_fechar_pedido = new javax.swing.JButton();
        btn_finalizar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setTitle("Pedidos");

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        cb_clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesquise um Cliente ao Lado" }));
        cb_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_clientesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        txt_codigo.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Rua");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Bairro");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Telefone");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Data");

        txt_data.setEditable(false);

        jButton1.setText("Pedido");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Fechar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_pesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pesquisar)
                    .addComponent(cb_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(27, 27, 27))
        );

        PainelCliente.addTab("Clientes", jPanel1);

        jLabel7.setText("Item");

        txt_nome_cliente.setEditable(false);
        txt_nome_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itemActionPerformed(evt);
            }
        });
        txt_item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_itemKeyReleased(evt);
            }
        });

        jLabel8.setText("Selecionar");

        cb_itens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Busque um Item ao Lado" }));
        cb_itens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_itensActionPerformed(evt);
            }
        });

        btn_valor.setText("Valor");
        btn_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_valorActionPerformed(evt);
            }
        });

        jLabel9.setText("Valor");

        txt_valor.setEditable(false);

        txt_quantidade.setText("1");
        txt_quantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_quantidadeFocusLost(evt);
            }
        });

        jLabel10.setText("Quantidade");

        txt_cod_pedido.setEditable(false);

        jLabel11.setText("Código");

        btn_add.setText("+");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_remover.setText("-");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        jLabel12.setText("Total");

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Item", "Descrição", "Valor Unitário", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela);

        btn_fechar_pedido.setText("Fechar");
        btn_fechar_pedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_fechar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fechar_pedidoActionPerformed(evt);
            }
        });

        btn_finalizar.setText("Finalizar");
        btn_finalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nome_cliente)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_valor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_valor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_itens, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_quantidade)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_cod_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_finalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_fechar_pedido)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cb_itens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_valor)
                    .addComponent(jLabel9)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_cod_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_add)
                        .addComponent(btn_remover))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_calcular)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_fechar_pedido)
                    .addComponent(btn_finalizar))
                .addContainerGap())
        );

        PainelCliente.addTab("Pedido", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCliente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setBounds(200, 50, 503, 431);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        cb_clientes.removeAllItems();
        Lista.clear();
        String Pesquisa = JOptionPane.showInputDialog(null, "Digite o Nome do Cliente", "Pesquisar", 3);
        ClienteC.controlePesquisa(Pesquisa, Lista);
        for(String i: Lista){
            cb_clientes.addItem(i);
        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void cb_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_clientesActionPerformed
        if(!(cb_clientes.getSelectedItem() == null)){
            String Cod = cb_clientes.getSelectedItem().toString();
            Cod = Cod.substring(0, Cod.indexOf(" "));
            ClienteB = ClienteC.controlePreencherCampos(Integer.parseInt(Cod));
            txt_codigo.setText(ClienteB.getCodigo() + "");
            txt_nome.setText(ClienteB.getNome());
            txt_rua.setText(ClienteB.getRua());
            txt_bairro.setText(ClienteB.getBairro());
            txt_tel.setText(ClienteB.getTelefone());
            txt_data.setText(ClienteB.getDataCad());
        }
    }//GEN-LAST:event_cb_clientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PainelCliente.setEnabledAt(1, true);
        PainelCliente.setEnabledAt(0, false);
        PainelCliente.setSelectedIndex(1);
        txt_nome_cliente.setText(txt_nome.getText());
         btn_finalizar.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itemActionPerformed
        
    }//GEN-LAST:event_txt_itemActionPerformed

    private void btn_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_valorActionPerformed
        txt_valor.setText(PedidoC.controleDeValor(cb_itens.getSelectedItem().toString()) + "");
        txt_cod_pedido.setText(PedidoC.controleDeCodigo(cb_itens.getSelectedItem().toString()) + "");
    }//GEN-LAST:event_btn_valorActionPerformed

    private void cb_itensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_itensActionPerformed
        txt_valor.setText("");
        txt_quantidade.setText("1");
    }//GEN-LAST:event_cb_itensActionPerformed

    private void txt_itemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_itemKeyReleased
        txt_valor.setText("");
        cb_itens.removeAllItems();
        ListadeItens.clear();
        PedidoC.controledeItens(txt_item.getText(), ListadeItens);
        for(String i: ListadeItens){
            cb_itens.addItem(i);
        }
    }//GEN-LAST:event_txt_itemKeyReleased

    private void txt_quantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_quantidadeFocusLost
        
    }//GEN-LAST:event_txt_quantidadeFocusLost

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if(PedidoC.verificaItens(txt_valor.getText(), txt_quantidade.getText(), txt_cod_pedido.getText(), cb_itens.getSelectedItem().toString())){
            double Total = Double.parseDouble(txt_valor.getText()) * Integer.parseInt(txt_quantidade.getText());
            Modelo.addRow(new Object[]{txt_cod_pedido.getText(), cb_itens.getSelectedItem(), txt_valor.getText(), txt_quantidade.getText(), Total});
            limparItens();
            CalcularTotal();
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_fechar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fechar_pedidoActionPerformed
       dispose();
    }//GEN-LAST:event_btn_fechar_pedidoActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        Modelo.removeRow(tabela.getSelectedRow());
       CalcularTotal();
        
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
         
        CalcularTotal();
        
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        populaBeans();
        PedidoC.controledePedido(txt_codigo.getText(), CodigoFuncionario + "", txt_total.getText(), tabela.getRowCount(), PedidoB);
        limparFinalizar();
    }//GEN-LAST:event_btn_finalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PainelCliente;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_fechar_pedido;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_remover;
    private javax.swing.JButton btn_valor;
    private javax.swing.JComboBox<String> cb_clientes;
    private javax.swing.JComboBox<String> cb_itens;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cod_pedido;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_item;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nome_cliente;
    public static javax.swing.JTextField txt_quantidade;
    private javax.swing.JTextField txt_rua;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

final void habilitarCampos(boolean valor){
    txt_bairro.setEnabled(valor);
    txt_rua.setEnabled(valor);
    txt_nome.setEnabled(valor);
    txt_tel.setEnabled(valor);
    txt_data.setEnabled(valor);
    
}


final void limparItens(){
    txt_item.setText("");
    txt_quantidade.setText("1");
    txt_valor.setText("");
    cb_itens.removeAllItems();
    
}

final void CalcularTotal(){
     double TotalPedido = 0;
         for(int i = 0; i < tabela.getRowCount(); i++){
             TotalPedido += Double.parseDouble(Modelo.getValueAt(i, 4).toString());
            
         }
         if(TotalPedido > 0){
             btn_finalizar.setEnabled(true);
         }
          txt_total.setText(formatoDecimal.format(TotalPedido).replace('.', ','));
}

final void populaBeans(){
    DataAtual = new Date();
    PedidoB.setCodigoCliente(Integer.parseInt(txt_codigo.getText()));
    PedidoB.setCodigoFuncionario(CodigoFuncionario);
    PedidoB.setCodigoEntregador(1);
    PedidoB.setData(formatoData.format(DataAtual));
    PedidoB.setData(formatoHora.format(DataAtual));
    PedidoB.setStatus("Pedido Aberto");
    PedidoB.setValor(Double.parseDouble(txt_total.getText().replace(',', '.')));
    for(int i = 0; i < tabela.getRowCount(); i++){
    PedidoB.setCodCardapio(Integer.parseInt(Modelo.getValueAt(i, 0).toString()));
    PedidoB.setQuantidade(Integer.parseInt(Modelo.getValueAt(i, 3).toString()));
}
    
}

final void limparFinalizar(){
    txt_total.setText("");
    txt_cod_pedido.setText("");
    btn_finalizar.setEnabled(false);
    Modelo.setNumRows(0);
}

}
