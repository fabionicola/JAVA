package Controller;

import Beans.CardapioBeans;


import DAO.CardapioDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CardapioContoller {
    
    CardapioDAO CardapioD;
    
    public CardapioContoller(){
       CardapioD = new CardapioDAO();
       
    }
    
    public boolean verificarDados(CardapioBeans Cardapio){
        if(Cardapio.getDescricao().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
           if(Cardapio.getTipo().equals("Selecione um Item")){
            JOptionPane.showMessageDialog(null, "Selecione um Item", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
           
              if(Cardapio.getValor() == 0){
            JOptionPane.showMessageDialog(null, "Digite o Valor", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        CardapioD.cadastrar(Cardapio);
        return true;
    }
    
    public String controleDeCodigo(){
        return CardapioD.proximo();
    }
    
    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo){
        CardapioD.buscar(Pesquisa, Modelo);
    }
    
    public CardapioBeans controlePreencherCampos(int Codigo){
        return CardapioD.PreencherCampos(Codigo);
    }
    
    
     public boolean verificarDadosEditar(CardapioBeans Cardapio){
         if(Cardapio.getDescricao().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
           if(Cardapio.getTipo().equals("Selecione um Item")){
            JOptionPane.showMessageDialog(null, "Selecione um Item", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
           
              if(Cardapio.getValor() == 0){
            JOptionPane.showMessageDialog(null, "Digite o Valor", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        CardapioD.editar(Cardapio);
        return true;
    }
    
}
