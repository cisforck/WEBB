/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Erick
 */
public class Conexioon {
    protected Connection conexion;
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/nodo1";
    
    public void conectar(){
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, pass);
            if (conexion != null) {
                System.out.println("Conexion Establecida..");
            }
        } catch ( ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar"+e);
        }
        
        
    }
    
    public void desconectar(){
        conexion = null;
        if (conexion == null) {
            System.out.println("Conexion Terminada..");
        }
        
    }
}
