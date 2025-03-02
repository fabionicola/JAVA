/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

/**
 *
 * @author Hugo
 */
public class frm_menu extends javax.swing.JFrame {

    /**
     * Creates new form frm_menu
     */
    public frm_menu() {
        initComponents();
        this.setExtendedState(frm_menu.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Reservas para Hotéis - Pousada Freitas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JDesktopPane();
        LB_id = new javax.swing.JLabel();
        LB_nome = new javax.swing.JLabel();
        LB_acesso = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu_sistema = new javax.swing.JMenu();
        menu_arquivo = new javax.swing.JMenu();
        s_menu_quartos = new javax.swing.JMenuItem();
        s_menu_produtos = new javax.swing.JMenuItem();
        menu_reservas = new javax.swing.JMenu();
        s_menu_reservas = new javax.swing.JMenuItem();
        s_menu_clientes = new javax.swing.JMenuItem();
        s_menu_pagamentos = new javax.swing.JMenuItem();
        menu_consultas = new javax.swing.JMenu();
        menu_config = new javax.swing.JMenu();
        s_menu_usuarios = new javax.swing.JMenuItem();
        menu_ferramentas = new javax.swing.JMenu();
        menu_ajuda = new javax.swing.JMenu();
        menu_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(255, 255, 255));

        LB_id.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LB_id.setForeground(new java.awt.Color(255, 255, 255));
        LB_id.setText("jLabel1");
        menu.add(LB_id);
        LB_id.setBounds(1210, 10, 31, 13);

        LB_nome.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LB_nome.setForeground(new java.awt.Color(255, 255, 255));
        LB_nome.setText("jLabel1");
        menu.add(LB_nome);
        LB_nome.setBounds(1240, 10, 31, 13);

        LB_acesso.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LB_acesso.setForeground(new java.awt.Color(255, 255, 255));
        LB_acesso.setText("jLabel1");
        menu.add(LB_acesso);
        LB_acesso.setBounds(1270, 10, 80, 13);

        menu_sistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/Inicio.png"))); // NOI18N
        menu_sistema.setMnemonic('f');
        menu_sistema.setText("Sistema");
        menu_sistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBar.add(menu_sistema);

        menu_arquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/arquivo.png"))); // NOI18N
        menu_arquivo.setMnemonic('e');
        menu_arquivo.setText("Arquivo");
        menu_arquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        s_menu_quartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/quartos.png"))); // NOI18N
        s_menu_quartos.setMnemonic('t');
        s_menu_quartos.setText("Quartos");
        s_menu_quartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_menu_quartosActionPerformed(evt);
            }
        });
        menu_arquivo.add(s_menu_quartos);

        s_menu_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/produtos.png"))); // NOI18N
        s_menu_produtos.setMnemonic('y');
        s_menu_produtos.setText("Produtos");
        s_menu_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_menu_produtosActionPerformed(evt);
            }
        });
        menu_arquivo.add(s_menu_produtos);

        menuBar.add(menu_arquivo);

        menu_reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/Reservas.png"))); // NOI18N
        menu_reservas.setMnemonic('h');
        menu_reservas.setText("Reservas");
        menu_reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        s_menu_reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/reservas-consumos.png"))); // NOI18N
        s_menu_reservas.setMnemonic('c');
        s_menu_reservas.setText("Reservas e Consumos");
        menu_reservas.add(s_menu_reservas);

        s_menu_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/clientes.png"))); // NOI18N
        s_menu_clientes.setMnemonic('a');
        s_menu_clientes.setText("Clientes");
        s_menu_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_menu_clientesActionPerformed(evt);
            }
        });
        menu_reservas.add(s_menu_clientes);

        s_menu_pagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/pagamentos.png"))); // NOI18N
        s_menu_pagamentos.setText("Pagamentos");
        menu_reservas.add(s_menu_pagamentos);

        menuBar.add(menu_reservas);

        menu_consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/buscar.png"))); // NOI18N
        menu_consultas.setText("Consultas");
        menu_consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBar.add(menu_consultas);

        menu_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/configurações.png"))); // NOI18N
        menu_config.setText("Configurações");
        menu_config.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        s_menu_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/usuario 32x32.png"))); // NOI18N
        s_menu_usuarios.setText("Usuários e Acessos");
        s_menu_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_menu_usuariosActionPerformed(evt);
            }
        });
        menu_config.add(s_menu_usuarios);

        menuBar.add(menu_config);

        menu_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/ferramentas.png"))); // NOI18N
        menu_ferramentas.setText("Ferramentas");
        menu_ferramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBar.add(menu_ferramentas);

        menu_ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/ajuda.png"))); // NOI18N
        menu_ajuda.setText("Ajuda");
        menu_ajuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBar.add(menu_ajuda);

        menu_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/sair.png"))); // NOI18N
        menu_sair.setText("Sair");
        menu_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_sairMouseClicked(evt);
            }
        });
        menuBar.add(menu_sair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s_menu_quartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_menu_quartosActionPerformed
        frm_quartos form = new frm_quartos();
        menu.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_s_menu_quartosActionPerformed

    private void s_menu_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_menu_produtosActionPerformed
        frm_produtos form = new frm_produtos();
        menu.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_s_menu_produtosActionPerformed

    private void s_menu_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_menu_clientesActionPerformed
      frm_clientes form = new frm_clientes();
        menu.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_s_menu_clientesActionPerformed

    private void s_menu_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_menu_usuariosActionPerformed
        frm_funcionario form = new frm_funcionario();
        menu.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_s_menu_usuariosActionPerformed

    private void menu_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sairMouseClicked
       this.dispose();
    }//GEN-LAST:event_menu_sairMouseClicked

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
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LB_acesso;
    public static javax.swing.JLabel LB_id;
    public static javax.swing.JLabel LB_nome;
    private javax.swing.JDesktopPane menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menu_ajuda;
    public static javax.swing.JMenu menu_arquivo;
    public static javax.swing.JMenu menu_config;
    private javax.swing.JMenu menu_consultas;
    private javax.swing.JMenu menu_ferramentas;
    private javax.swing.JMenu menu_reservas;
    private javax.swing.JMenu menu_sair;
    private javax.swing.JMenu menu_sistema;
    private javax.swing.JMenuItem s_menu_clientes;
    private javax.swing.JMenuItem s_menu_pagamentos;
    private javax.swing.JMenuItem s_menu_produtos;
    private javax.swing.JMenuItem s_menu_quartos;
    private javax.swing.JMenuItem s_menu_reservas;
    private javax.swing.JMenuItem s_menu_usuarios;
    // End of variables declaration//GEN-END:variables

}
