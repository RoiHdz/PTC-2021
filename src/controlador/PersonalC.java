package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import subPanel.pnlPersonal1;

public class PersonalC {
        private static modelo.Conexion con = new modelo.Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    private static pnlPersonal1 vista;

    public static boolean isRegister(modelo.Personal l) {
        String sql = modelo.Personal.Registar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getPrimerNombre());
            ps.setString(2, l.getSegundoNombre());
            ps.setString(3, l.getPrimerApellido());
            ps.setString(4, l.getSegundoApellido());
            ps.setDate(5, (Date) l.getFechaNacimiento());
            ps.setString(6, l.getDui());
            ps.setString(7, l.getNit());
            ps.setString(8, l.getGenero());
            ps.setString(9, l.getTipoPersonal());
            ps.setString(10, l.getEstado());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex){
            System.out.println(ex);
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static boolean isUpdate(modelo.Personal l) {
        /*Cambiar el modelo Labor*/
        String sql = modelo.Personal.Actualizar;
        try {
            ps.setString(1, l.getPrimerNombre());
            ps.setString(2, l.getSegundoNombre());
            ps.setString(3, l.getPrimerApellido());
            ps.setString(4, l.getSegundoApellido());
            ps.setDate(5, (Date) l.getFechaNacimiento());
            ps.setString(6, l.getDui());
            ps.setString(7, l.getNit());
            ps.setString(8, l.getGenero());
            ps.setString(9, l.getTipoPersonal());
            ps.setString(10, l.getEstado());
            ps.setInt(11, l.getIdPersonal());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }
    
    public static boolean isDelete(modelo.Personal l) {
        String sql = modelo.Personal.Elimidar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, l.getIdPersonal());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void setListar(String buscar) {
        /*Cambiar el panel pnlConfiguracion2 y la tabla*/
        DefaultTableModel model = (DefaultTableModel)pnlPersonal1.tblPersonal.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";

        if (buscar.equals("")) {
            sql = modelo.Personal.Listar;
        } else {
            /*Cambiar la consulta*/
            sql = "SELECT CONCAT(primerNombre, ' ', segundoNombre, ' ', primerApellido, ' ', segundoApellido) AS Nombre, dbo.edad(fechaNacimiento)AS Edad, dui, nit, genero, tipoPersonal, estado FROM Personal WHERE Nombre LIKE '" + buscar + "%'";
        }
        String datos[] = new String[7];

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("Nombre");
                datos[1] = rs.getString("Edad");
                datos[2] = rs.getString("dui");
                datos[3] = rs.getString("nit");
                datos[4] = rs.getString("genero");
                datos[5] = rs.getString("tipoPersonal");
                datos[6] = rs.getString("estado");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
