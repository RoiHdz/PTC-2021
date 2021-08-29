package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    public Connection getConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection cn = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433; "
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
