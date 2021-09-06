/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Agustin
 */
public class Insert extends conexion {
    
    
    public static void insertar(String consulta) throws SQLException {
        Connection Conexion =  conexion.getConexion();                
        Statement s = Conexion.createStatement();
        s.executeUpdate(consulta);
        Conexion.close();
    }
  }


