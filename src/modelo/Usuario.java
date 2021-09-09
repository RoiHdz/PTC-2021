package modelo;

public class Usuario {
    private int idUsuario;
    private String username;
    private String nombre;
    private String apellido;
    private String email;
    private String password;    
    private String pass;
    private int idRol;
    
    public static String Listar = "SELECT CONCAT(nombre, ' ' , apellido) AS 'Nombre', username, email, idRol FROM Usuarios";
    public static String Registar = "INSERT INTO Usuarios VALUES (?,?,?,?,?,?)";
    public static String Actualizar = "UPDATE Usuarios SET username = ?, nombre=?, apellido = ?, email = ?, contrasenia = ?, idRol=? WHERE idUsuario= ?";
    public static String Eliminar = "DELETE FROM Usuarios WHERE idUsuario=?";
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
