/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;

/**
 *
 * @author M. Washington
 */
public class ModuloConexao {
    
//    TUDO É PADRÂO
    
    public static Connection conectar(){
        Connection conexao;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/cadastro";
        String user = "root";
        String password = "";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
            } catch(ClassNotFoundException | SQLException e){
                System.out.println(e);
                return null;
            }
        
    }
    
}
