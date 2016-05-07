/* 
 * esta clase encasupla los campos de la web de loggin 
 * 
 * 
 */
package g5appweb.vista.loggin;

/**
 *
 * @author Juan Carrasco Estrada
 */
public class LogginFrontBeans {
     private boolean denegado;  // mensaje de ""acceso Denegado""
     private String usuario=""; // campo de usuario 
     private String password=""; //  campo de contraseña

    /**
     * @return the denegado
     */
    public boolean isDenegado() {
        return denegado;
    }

    /**
     * @param denegado the denegado to set
     */
    public void setDenegado(boolean denegado) {
        this.denegado = denegado;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
