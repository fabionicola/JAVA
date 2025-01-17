
package DAO;

import Beans.PedidoBeans;
import Utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PedidoDAO {
    public void pesquisadeItens(String Pesquisa, List<String>ListadeItens){
        
         
        
        try {
            String SQLPesquisa = "select * from cardapio where car_descricao like '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLPesquisa);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ListadeItens.add(rs.getString("car_descricao"));
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    
    public double valorDoItem(String Pesquisa){
         try {
            String SQLPesquisa = "select * from cardapio where car_descricao = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLPesquisa);
            st.setString(1, Pesquisa);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
               return rs.getDouble("car_valor");
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
         
         return 0;
    }
    
    
     public int valorDoCodigo(String Pesquisa){
         try {
            String SQLPesquisa = "select * from cardapio where car_descricao = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLPesquisa);
            st.setString(1, Pesquisa);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
               return rs.getInt("car_cod");
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
         
         return 0;
    }
     
     public void CadastrarPedido(String CodigoCliente, String CodigoFuncionario, String Total, int TamanhoTabela, PedidoBeans PedidoB){
         Date Data = new Date();
         SimpleDateFormat FormatoData = new SimpleDateFormat("yyyy-MM-dd");
         SimpleDateFormat FormatoHora = new SimpleDateFormat("HH:mm:ss");
        try {
            String SQLInsert = "insert into pedidos(ped_cli_cod, ped_fun_cod, ped_ent_cod, ped_data, ped_hora, ped_total, ped_status) values (?,?,?,?,?,?,?)";
            PreparedStatement st;
            st = Conexao.getConnection().prepareStatement(SQLInsert);
            
            st.setString(1, CodigoCliente);
            st.setString(2, CodigoFuncionario);
            st.setString(3, "1");
            st.setString(4, FormatoData.format(Data));
            st.setString(5, FormatoHora.format(Data));
            st.setString(6, Total.replace(',', '.'));
            st.setString(7, "Pedido Aberto");
            
            st.execute();
            CadastrarItens(CodigoCliente, CodigoFuncionario, CodigoDoPedido() , TamanhoTabela, PedidoB);
            CodigoDoPedido();
            Conexao.getConnection().commit();
             JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
          // JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
          
     }
     
     public String CodigoDoPedido(){
         String Cod = "0";
         
        try {
            String SQLSelection = "select ped_cod from pedidos order by ped_cod desc limit 1";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Cod = rs.getString("ped_cod");
               
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
          // JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        return Cod;
     }
     
     public void CadastrarItens(String CodigoCliente, String CodigoFuncionario, String CodigoPedido, int TamanhoTabela, PedidoBeans PedidoB){
         for (int i = 0; i < TamanhoTabela; i++){
             String SQLInserir = "insert into item(item_ent_cod, item_fun_cod, item_cli_cod, item_ped_cod, item_car_cod, item_quantidade) values (?,?,?,?,?,?)";
             try {
                 PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInserir);
                 st.setString(1, "1");
                 st.setString(2, CodigoFuncionario);
                 st.setString(3, CodigoCliente);
                 st.setString(4, CodigoPedido);
                 st.setInt(5, PedidoB.getCodCardapio(i));
                 st.setInt(6, PedidoB.getQuantidade(i));
                 
                 st.execute();
             } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
          // JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
             }
              
         }
     }
}

