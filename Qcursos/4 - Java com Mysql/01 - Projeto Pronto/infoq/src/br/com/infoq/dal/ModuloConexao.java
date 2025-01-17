/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infoq.dal;
import java.sql.*;

/**
 *
 * @author Grazi
 */
public class ModuloConexao {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //chamar o driver
        String driver = "com.mysql.jdbc.Driver";
        
        /*informações referente ao BD Local
        String url = "jdbc:mysql://localhost:3306/dbinfoq";
        String user = "root";
        String password = "";  */
        
        
        //informações referente ao BD Local Hospedado
        String url = "jdbc:mysql://br118.hostgator.com.br:3306/makel783_dbinfoq";
        String user = "makel783_hugoadm";
        String password = "hugo123";   
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
