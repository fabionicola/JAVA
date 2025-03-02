/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import produtos.FrmProdutos;
import usuarios.FrmUsuarios;
import vendas.FrmCaixa;
import vendas.FrmVendas;

/**
 *
 * @author hugov
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    
    
   
    
    public boolean estaFechado(Object obj){
        JInternalFrame[] ativo = carregador.getAllFrames();
        boolean fechado = true;
        int i = 0;
        while(i < ativo.length && fechado){
            if(ativo[i] == obj){
                fechado = false;
                
            }
            
            i++;
        }
        
        return fechado;
    }
    
    
    
    class horas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date sistemaHora = new Date();
            String pmAm = "HH:mm:ss";
            SimpleDateFormat formato = new SimpleDateFormat(pmAm);
            Calendar now = Calendar.getInstance();
            hora.setText(String.format(formato.format(sistemaHora), now));
        }
    }
    
    

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        painelPrincipal = new javax.swing.JPanel();
        painelCabecalho = new javax.swing.JPanel();
        hora = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        userConect = new javax.swing.JLabel();
        logouser = new javax.swing.JLabel();
        logodesconect = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProduto = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        carregador = new principal.Carregador();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto de Vendas - Administrador");
        setPreferredSize(new java.awt.Dimension(1140, 750));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        painelPrincipal.setPreferredSize(new java.awt.Dimension(1280, 640));
        painelPrincipal.setLayout(new java.awt.BorderLayout());

        painelCabecalho.setBackground(new java.awt.Color(0, 0, 51));
        painelCabecalho.setPreferredSize(new java.awt.Dimension(1280, 125));
        painelCabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setText("HORA");
        hora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelCabecalho.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 225, -1));

        data.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));
        data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        data.setText("DIA - MES - ANO");
        data.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelCabecalho.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 34, 225, -1));

        desc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desc.setForeground(new java.awt.Color(255, 255, 255));
        desc.setText("DESCONECTAR...");
        desc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descMouseClicked(evt);
            }
        });
        painelCabecalho.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        userConect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userConect.setForeground(new java.awt.Color(255, 255, 255));
        userConect.setText("USUARIO");
        painelCabecalho.add(userConect, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 101, -1));

        logouser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logouser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/conectado.png"))); // NOI18N
        painelCabecalho.add(logouser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        logodesconect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logodesconect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/desconec.png"))); // NOI18N
        logodesconect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logodesconectMouseClicked(evt);
            }
        });
        painelCabecalho.add(logodesconect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/info.png"))); // NOI18N
        jButton1.setText("INFORMAÇÕES");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(100, 120));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/info2.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelCabecalho.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, 120));

        btnUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/usuario1.png"))); // NOI18N
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setName("btnUsuarios"); // NOI18N
        btnUsuarios.setPreferredSize(new java.awt.Dimension(100, 120));
        btnUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/usuario2.png"))); // NOI18N
        btnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        painelCabecalho.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 120));

        btnProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/produtos.png"))); // NOI18N
        btnProduto.setText("PRODUTOS");
        btnProduto.setBorder(null);
        btnProduto.setContentAreaFilled(false);
        btnProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProduto.setName("btnProduto"); // NOI18N
        btnProduto.setPreferredSize(new java.awt.Dimension(100, 120));
        btnProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/produtos2.png"))); // NOI18N
        btnProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });
        painelCabecalho.add(btnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 120));

        btnVendas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/vendas1.png"))); // NOI18N
        btnVendas.setText("VENDAS");
        btnVendas.setBorder(null);
        btnVendas.setContentAreaFilled(false);
        btnVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVendas.setName("btnVendas"); // NOI18N
        btnVendas.setPreferredSize(new java.awt.Dimension(100, 120));
        btnVendas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/vendas2.png"))); // NOI18N
        btnVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });
        painelCabecalho.add(btnVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, 120));

        btnCaixa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCaixa.setForeground(new java.awt.Color(255, 255, 255));
        btnCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/caixa.png"))); // NOI18N
        btnCaixa.setText("CAIXA");
        btnCaixa.setBorder(null);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaixa.setName("btnCaixa"); // NOI18N
        btnCaixa.setPreferredSize(new java.awt.Dimension(100, 120));
        btnCaixa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/caixa2.png"))); // NOI18N
        btnCaixa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });
        painelCabecalho.add(btnCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 120));

        painelPrincipal.add(painelCabecalho, java.awt.BorderLayout.PAGE_START);

        carregador.setName("carregador"); // NOI18N
        painelPrincipal.add(carregador, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descMouseClicked
         if (JOptionPane.showConfirmDialog(this, "Deseja fechar a sessão do usuário?", "Fechar Sessão", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/imagens/principal/info.png"))) == JOptionPane.YES_OPTION) {
            this.dispose(); 
            Login login = new Login();
            login.setLocationRelativeTo(null);
            login.setVisible(true);  
            
         }
    }//GEN-LAST:event_descMouseClicked

    produtos.FrmProdutos tela;
    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
         
        if(estaFechado(tela)){
            tela = new FrmProdutos();
            carregador.add(tela).setLocation(150,3);
            tela.show();
        }else{
            
             tela.toFront();
             tela.show();
        }
        
        
    }//GEN-LAST:event_btnProdutoActionPerformed

    
    usuarios.FrmUsuarios tela1;
    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
         if(estaFechado(tela1)){
            tela1 = new FrmUsuarios();
            carregador.add(tela1).setLocation(150,3);
            tela1.show();
        }else{
            
             tela1.toFront();
             tela1.show();
        }
    }//GEN-LAST:event_btnUsuariosActionPerformed

    vendas.FrmCaixa tela2;
    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        if(estaFechado(tela2)){
            tela2 = new FrmCaixa();
            carregador.add(tela2).setLocation(20,3);
            tela2.show();
        }else{
            
             tela2.toFront();
             tela2.show();
        }
    }//GEN-LAST:event_btnCaixaActionPerformed

    vendas.FrmVendas tela3;
    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        if(estaFechado(tela3)){
            tela3 = new FrmVendas();
            carregador.add(tela3).setLocation(150,3);
            tela3.show();
        }else{
            
             tela3.toFront();
             tela3.show();
        }
    }//GEN-LAST:event_btnVendasActionPerformed

    private void logodesconectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logodesconectMouseClicked
        if (JOptionPane.showConfirmDialog(this, "Deseja fechar a sessão do usuário?", "Fechar Sessão", JOptionPane.YES_NO_OPTION, 0,
                new ImageIcon(getClass().getResource("/imagens/principal/info.png"))) == JOptionPane.YES_OPTION) {
            this.dispose(); 
            Login login = new Login();
            login.setLocationRelativeTo(null);
            login.setVisible(true);  
            
         }
    }//GEN-LAST:event_logodesconectMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Date sistemaData = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMM yyyy");
        data.setText(formato.format(sistemaData));
        
        //HORA DO SISTEMA
        Timer hr = new Timer(100, new MenuPrincipal.horas());
        hr.start();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal tela = new MenuPrincipal();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVendas;
    public static principal.Carregador carregador;
    private javax.swing.JLabel data;
    private javax.swing.JLabel desc;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel logodesconect;
    private javax.swing.JLabel logouser;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelPrincipal;
    public static javax.swing.JLabel userConect;
    // End of variables declaration//GEN-END:variables
}
