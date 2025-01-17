package DAO;

import Beans.CardapioBeans;
import Beans.FuncionarioBeans;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CardapioDAO {
    
    
    
    public CardapioDAO(){
        
    }
    
    public void cadastrar(CardapioBeans Func){
        try {
           
            String SQLInsertion = "insert into cardapio(car_descricao, car_tipo, car_valor) values (?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Func.getDescricao());
            st.setString(2, Func.getTipo());
          
            st.setDouble(3, Func.getValor());
                
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
           JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    
    public String proximo(){
        String SQLSelection = "select * from cardapio order by car_cod desc limit 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return (Integer.parseInt(rs.getString("car_cod")) + 1) + "";
            }else{
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
        
    }
    
    public void buscar(String Pesquisa, DefaultTableModel Modelo){
        
        try {
            String SQLSelection = "select * from cardapio where car_descricao like '%" + Pesquisa + "%' ";  
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[] {rs.getString("car_cod"), rs.getString("car_descricao"),  rs.getString("car_tipo"), rs.getString("car_valor") } );
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Buscar", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
       
      
    }
    
    public CardapioBeans PreencherCampos(int Codigo){
        CardapioBeans Func = new CardapioBeans();
         try {
            String SQLSelection = "select * from cardapio where car_cod = ?";  
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, Codigo);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
               Func.setCodigo(rs.getInt("car_cod")); 
               Func.setDescricao(rs.getString("car_descricao")); 
               Func.setTipo(rs.getString("car_tipo"));
               Func.setValor(rs.getDouble("car_valor")); 
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Buscar", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        } 
         
         return Func;
    }
    
    
    public void editar(CardapioBeans Func){
        try {
           
            String SQLInsertion = "update cardapio set car_descricao = ?,  car_tipo = ?,  car_valor = ? where car_cod = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Func.getDescricao());
            st.setString(2, Func.getTipo());
            st.setDouble(3, Func.getValor());
            st.setInt(4, Func.getCodigo());
                    
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro editado com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
           JOptionPane.showMessageDialog(null, "Erro ao Editar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
}
