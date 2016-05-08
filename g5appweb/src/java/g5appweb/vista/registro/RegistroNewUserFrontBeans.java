/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.vista.registro;

/**
 *
 * @author Juan Antonio Carrasco Estrada
 */
public class RegistroNewUserFrontBeans {
    

    
     private String correo="";
    private boolean correoNoVacio;
    private boolean correoNoValido;
    
    private String password="";
    private boolean passwordNoVacio;
    private boolean passwordMin6;
    
    private String repPassword="";
    private boolean repPasswordCoincide;
    
    private String punk="";
    private boolean punkNoVacio;
    
    private String repitePunk="";
    private boolean repitePunkNoCoincide;
   
    private String nombre="";
    private boolean nombreEmpiezaLetra;
    
    private String apellidos="";
    private boolean apellidosEmpiezaLetra;

    private String telefono="";
    private boolean telefonoEmpiezaLetra;

    public RegistroNewUserFrontBeans() {
    
        passwordNoVacio=Boolean.FALSE;
        passwordMin6=Boolean.FALSE;
        punkNoVacio=Boolean.FALSE;
        repPasswordCoincide=Boolean.FALSE;
        repitePunkNoCoincide=Boolean.FALSE;
        correoNoVacio=Boolean.FALSE;
        correoNoValido=Boolean.FALSE;
        nombreEmpiezaLetra=Boolean.FALSE;
        apellidosEmpiezaLetra=Boolean.FALSE;
        telefonoEmpiezaLetra=Boolean.FALSE;
        
        
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the correoNoVacio
     */
    public boolean isCorreoNoVacio() {
        return correoNoVacio;
    }

    /**
     * @param correoNoVacio the correoNoVacio to set
     */
    public void setCorreoNoVacio(boolean correoNoVacio) {
        this.correoNoVacio = correoNoVacio;
    }

    /**
     * @return the correoNoValido
     */
    public boolean isCorreoNoValido() {
        return correoNoValido;
    }

    /**
     * @param correoNoValido the correoNoValido to set
     */
    public void setCorreoNoValido(boolean correoNoValido) {
        this.correoNoValido = correoNoValido;
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

    /**
     * @return the passwordNoVacio
     */
    public boolean isPasswordNoVacio() {
        return passwordNoVacio;
    }

    /**
     * @param passwordNoVacio the passwordNoVacio to set
     */
    public void setPasswordNoVacio(boolean passwordNoVacio) {
        this.passwordNoVacio = passwordNoVacio;
    }

    /**
     * @return the passwordMin6
     */
    public boolean isPasswordMin6() {
        return passwordMin6;
    }

    /**
     * @param passwordMin6 the passwordMin6 to set
     */
    public void setPasswordMin6(boolean passwordMin6) {
        this.passwordMin6 = passwordMin6;
    }

    /**
     * @return the repPassword
     */
    public String getRepPassword() {
        return repPassword;
    }

    /**
     * @param repPassword the repPassword to set
     */
    public void setRepPassword(String repPassword) {
        this.repPassword = repPassword;
    }

    /**
     * @return the repPasswordCoincide
     */
    public boolean isRepPasswordCoincide() {
        return repPasswordCoincide;
    }

    /**
     * @param repPasswordCoincide the repPasswordCoincide to set
     */
    public void setRepPasswordCoincide(boolean repPasswordCoincide) {
        this.repPasswordCoincide = repPasswordCoincide;
    }

    /**
     * @return the punk
     */
    public String getPunk() {
        return punk;
    }

    /**
     * @param punk the punk to set
     */
    public void setPunk(String punk) {
        this.punk = punk;
    }

    /**
     * @return the punkNoVacio
     */
    public boolean isPunkNoVacio() {
        return punkNoVacio;
    }

    /**
     * @param punkNoVacio the punkNoVacio to set
     */
    public void setPunkNoVacio(boolean punkNoVacio) {
        this.punkNoVacio = punkNoVacio;
    }

    /**
     * @return the repitePunk
     */
    public String getRepitePunk() {
        return repitePunk;
    }

    /**
     * @param repitePunk the repitePunk to set
     */
    public void setRepitePunk(String repitePunk) {
        this.repitePunk = repitePunk;
    }

    /**
     * @return the repitePunkNoCoincide
     */
    public boolean isRepitePunkNoCoincide() {
        return repitePunkNoCoincide;
    }

    /**
     * @param repitePunkNoCoincide the repitePunkNoCoincide to set
     */
    public void setRepitePunkNoCoincide(boolean repitePunkNoCoincide) {
        this.repitePunkNoCoincide = repitePunkNoCoincide;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombreEmpiezaLetra
     */
    public boolean isNombreEmpiezaLetra() {
        return nombreEmpiezaLetra;
    }

    /**
     * @param nombreEmpiezaLetra the nombreEmpiezaLetra to set
     */
    public void setNombreEmpiezaLetra(boolean nombreEmpiezaLetra) {
        this.nombreEmpiezaLetra = nombreEmpiezaLetra;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the apellidosEmpiezaLetra
     */
    public boolean isApellidosEmpiezaLetra() {
        return apellidosEmpiezaLetra;
    }

    /**
     * @param apellidosEmpiezaLetra the apellidosEmpiezaLetra to set
     */
    public void setApellidosEmpiezaLetra(boolean apellidosEmpiezaLetra) {
        this.apellidosEmpiezaLetra = apellidosEmpiezaLetra;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the telefonoEmpiezaLetra
     */
    public boolean isTelefonoEmpiezaLetra() {
        return telefonoEmpiezaLetra;
    }

    /**
     * @param telefonoEmpiezaLetra the telefonoEmpiezaLetra to set
     */
    public void setTelefonoEmpiezaLetra(boolean telefonoEmpiezaLetra) {
        this.telefonoEmpiezaLetra = telefonoEmpiezaLetra;
    }

    
      
}
