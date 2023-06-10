/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author s1290
 */
public class BaseDeDatosConector {
    
    
    private static  String HOST = "proyecto-sistema-boletos.postgres.database.azure.com";
    private static  int PUERTO = 5432;
    private static  String DB = "postgres";
    private static  String USER = "otto123";
    private static  String PASSWORD = "K6@LA94NdSz4f1D@3zd49f@KfAz";

    public static Connection obtenerConexion() {
        String url = "jdbc:postgresql://" + HOST + ":" + PUERTO + "/" + DB;

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("Conexión exitosa");
            return conexion;
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador de la base de datos: " + e.getMessage());
            
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión: " + e.getMessage());
        }
        
        return null;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    /*
    public Connection getConexion(){
        Connection conexion = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            String url ="jdbc:postgresql://"+HOST+":"+PUERTO+"/"+DB;
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return conexion;
    }
*/
    

