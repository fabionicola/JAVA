
package Controller;

import Beans.PedidoBeans;
import DAO.PedidoDAO;
import GUI.PedidoTela;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PedidoController {
    
    PedidoDAO PedidoD;
    
    public PedidoController(){
        PedidoD = new PedidoDAO();
    }
    
    public void controledeItens(String Pesquisa, List<String>ListadeItens){
        PedidoD.pesquisadeItens(Pesquisa, ListadeItens);
    }
    
    public double controleDeValor(String Pesquisa){
        return PedidoD.valorDoItem(Pesquisa);
    }
    
     public int controleDeCodigo(String Pesquisa){
        return PedidoD.valorDoCodigo(Pesquisa);
    }
     
     public boolean verificaItens(String Valor, String Quantidade, String Codigo, String Item){
         
          try{
            int x = Integer.parseInt(Quantidade);
            if(x == 0){
                 JOptionPane.showMessageDialog(null, "A quantidade não pode ser 0", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                 PedidoTela.txt_quantidade.setText("1");
                 PedidoTela.txt_quantidade.grabFocus();
            }
        }catch(NumberFormatException Ex){
             JOptionPane.showMessageDialog(null, "Insira um número inteiro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
             PedidoTela.txt_quantidade.setText("1");
             PedidoTela.txt_quantidade.grabFocus();
        }
         
        if(Quantidade.equals("")){
            // JOptionPane.showMessageDialog(null, "Preencha o campo Quantidade", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
         
         if(Valor.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Valor", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
         if(Codigo.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Código", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
         if(Item.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Item", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
         return true;
     }
     
     public void controledePedido(String CodigoCliente, String CodigoFuncionario, String Total, int TamanhoTabela, PedidoBeans PedidoB){
         PedidoD.CadastrarPedido(CodigoCliente, CodigoFuncionario, Total, TamanhoTabela, PedidoB);
     }
}
