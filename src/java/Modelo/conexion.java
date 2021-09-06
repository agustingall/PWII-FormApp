
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
public class conexion {
    public static final String user     = "root";
    public static final String password = "";
    public static final String host     = "localhost";
    public static final String db       = "PWII";
    public static final String tabla    = "user";
    public static final String port     = "3306";
    
    public static final String uri      = "jdbc:mysql://localhost:3306/pwiii";
    
    public static Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = (Connection) DriverManager.getConnection(uri, user, password);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
    
    
}