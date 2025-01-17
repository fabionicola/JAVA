
package Controller;

import DAO.TelaPedidosDAO;
import javax.swing.table.DefaultTableModel;


public class TelaPedidosController {
    
    TelaPedidosDAO TelaPedidosD;
    
    public TelaPedidosController(){
        TelaPedidosD = new TelaPedidosDAO();
    }
    
     public void controlePesquisa(DefaultTableModel Modelo){
        TelaPedidosD.MostrarPedidos(Modelo);
    }
}
