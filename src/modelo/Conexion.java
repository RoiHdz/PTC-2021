package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
//    Connection con;
//    public Connection getConexion(){
//        String url="jdbc:sqlserver://DESKTOP-B2CFUCL\\SQLEXPRESS;";
//        String user = "admin;";
//        String pass = "123;";
//        try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            con = DriverManager.getConnection(url,user,pass);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        return con;
//    }
    public Connection getConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection cn = DriverManager.getConnection(
                "jdbc:sqlserver://DESKTOP-B2CFUCL\\SQLEXPRESS; "
              + "databaseName=YumSystem; "
              + "IntegratedSecurity=true;");
            return cn;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se pudoconectar a la base");
            return null;
        }
    }
}
