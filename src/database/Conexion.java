
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private final String DRIVER ="com.mysql.cj.jdbc.Driver";
    private final String URL="jdbc:mysql://localhost:3306/";
    private final String DB ="dbsistema";
    private final String USER="root";
    private final String PASSWORD="123";
    
    public Connection cadena;
    
    public static Conexion instancia;
    
    private Conexion(){
    
        this.cadena=null;
        
    }

    public Connection conectar (){
        try {
            Class.forName(DRIVER);
            this.cadena=DriverManager.getConnection(URL+DB,USER,PASSWORD);
            
            
        } catch (ClassNotFoundException | SQLException e) {
        
        JOptionPane.showMessageDialog(null, e.getMessage());
        System.exit(0);
         }
       return this.cadena;
    
    }
    
    public void desconectar(){
    
        try {
            this.cadena.close();
        } catch (SQLException e) {
        
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        
    }
    
    
    public static Conexion getInstancia(){
        if(instancia==null){
        
            instancia=new Conexion();
        }
        return instancia;
    }
}
//gfgfgfgfgsdsdsdsdsdsdsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss

//pririririririririririririrneongvoenvoervnekvneovnekovneokvnekovnerkvonerokvnerkovnekovneokvneokvnervokenvoknevkoenrvoenv

//fvdfvdfvdfvfdvfvdfvdfvdfvdf

//35435345345345345345345345345

//esto si es una prueva de verdad

//aber si este esssss

//hola estoy haciendo una prueba

//blue voy 

//hola a mi me gustan las canciones de mac de marco

// yo sigo aqui

//esto solamente

//o eso quiero creer
//on the level
// si po esta gooood

//los astros se alinearon

//kokokokok