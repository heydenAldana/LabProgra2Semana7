/*
 * AQUI VAN DE LA MANO LOS ADMINS.
 * lo que es de comprador va heredado de aqui, porque tiene atributos extra
 */
package lab7p2_heydenaldana_22111098;

public class userAdmin 
{
    private String usuario, password;
    private int edad;

    // Recordar: tipo solo puede ser de dos:
    // administrador
    // comprador
    
    public userAdmin(String usuario, String password, int edad) {
        this.usuario = usuario;
        this.password = password;
        this.edad = edad;
    }

    // get y set
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
