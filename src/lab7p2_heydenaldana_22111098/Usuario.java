/*
 * AQUI VAN DE LA MANO LOS ADMINS Y LOS COMPRADORES
 * HAY UN ATRIBUTO LLAMADO "TIPO" QUE PUEDE SER
 * "administrador" o "comprador" (asi como esta escrito alli)
 */
package lab7p2_heydenaldana_22111098;

public class Usuario 
{
    private String usuario, tipo, password;
    private int edad;

    // Recordar: tipo solo puede ser de dos:
    // administrador
    // comprador
    
    public Usuario(String usuario, String tipo, String password, int edad) {
        this.usuario = usuario;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
