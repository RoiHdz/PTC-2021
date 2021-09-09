package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import subPanel.pnlConfiguracion3;

public class UsuarioC {

    private static modelo.Conexion con = new modelo.Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    private static pnlConfiguracion3 vista;
    private static ResultSet rs = null;
    
    public static boolean isRegister(modelo.Usuario l) {
        String sql = modelo.Usuario.Registar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getUsername());
            ps.setString(2, l.getNombre());
            ps.setString(3, l.getApellido());
            ps.setString(4, l.getEmail());
            ps.setString(5, l.getPassword());
            ps.setInt(6, l.getIdRol());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

    }

    public static boolean isUpdate(modelo.Usuario l) {
        String sql = modelo.Usuario.Actualizar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getUsername());
            ps.setString(2, l.getNombre());
            ps.setString(3, l.getApellido());
            ps.setString(4, l.getEmail());
            ps.setString(5, l.getPassword());
            ps.setInt(6, l.getIdRol());
            ps.setInt(7, l.getIdUsuario());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public static boolean isDelete(modelo.Usuario l) {
        String sql = modelo.Usuario.Eliminar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, l.getIdUsuario());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void setListar(String buscar) {
        DefaultTableModel model = (DefaultTableModel) pnlConfiguracion3.tblUsuario.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";

        if (buscar.equals("")) {
            sql = modelo.Usuario.Listar;
        } else {
            /*Cambiar la consulta*/
            sql = "SELECT *FROM Parcela WHERE ( "
                    + "nombre LIKE '" + buscar + "%' OR"
                    + "username LIKE '" + buscar + "%' )";
        }
        String datos[] = new String[4];

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("Nombre");
                datos[1] = rs.getString("username");
                datos[2] = rs.getString("email");
                datos[3] = rs.getString("idRol");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int existe(String usuario){
               
        String sql = "SELECT COUNT(idUsuario) FROM Usuarios WHERE username = ?";
        try{
            ps = conexion.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        }catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(UsuarioC.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    
    public static boolean login(modelo.Usuario user){
               
        String sql = "SELECT idUsuario, username, contrasenia, CONCAT(nombre, ' ' , apellido) AS 'Nombre', idRol FROM Usuarios WHERE username = ?";
        try{
            ps = conexion.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            rs = ps.executeQuery();
            if (rs.next()) {
                if (user.getPassword().equals(rs.getString(3))) {
                    user.setIdUsuario(rs.getInt(1));
                    user.setNombre(rs.getString(4));
                    user.setIdRol(rs.getInt(5));
                    return true;
                }
                else{
                    return false;
                }
            }
            return false;
        }catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(UsuarioC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
