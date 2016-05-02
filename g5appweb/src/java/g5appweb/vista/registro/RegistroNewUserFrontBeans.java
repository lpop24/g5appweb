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
    
    private String usuario;
    private boolean usuarioNoVacio;
    private boolean usuarioEmpiezaLetra;
    private boolean usuarioYaExistente;
    
    private String password;
    private boolean passwordNoVacio;
    private boolean passwordMin6;
    
    private String repPassword;
    private boolean repPasswordCoincide;
    
    private String pregunta;
    private boolean preguntaNoVacio;
    
    private String respuesta;
    private boolean respuestaNoVacio;
    
    private String correo;
    private boolean correoNoVacio;
    private boolean correoNoValido;
    
    private String nombre;
    private boolean nombreEmpiezaLetra;
    
    private String apellidos;
    private boolean apellidosEmpiezaLetra;

    private String telefono;
    private boolean telefonoEmpiezaLetra;

    public RegistroNewUserFrontBeans() {
    
        usuarioNoVacio=Boolean.FALSE;
        usuarioEmpiezaLetra=Boolean.FALSE;
        usuarioYaExistente=Boolean.FALSE;
        passwordNoVacio=Boolean.FALSE;
        passwordMin6=Boolean.FALSE;
        repPasswordCoincide=Boolean.FALSE;
        preguntaNoVacio=Boolean.FALSE;
        respuestaNoVacio=Boolean.FALSE;
        correoNoVacio=Boolean.FALSE;
        correoNoValido=Boolean.FALSE;
        nombreEmpiezaLetra=Boolean.FALSE;
        apellidosEmpiezaLetra=Boolean.FALSE;
        telefonoEmpiezaLetra=Boolean.FALSE;
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
     * @return the usuarioNoVacio
     */
    public boolean isUsuarioNoVacio() {
        return usuarioNoVacio;
    }

    /**
     * @param usuarioNoVacio the usuarioNoVacio to set
     */
    public void setUsuarioNoVacio(boolean usuarioNoVacio) {
        this.usuarioNoVacio = usuarioNoVacio;
    }

    /**
     * @return the usuarioEmpiezaLetra
     */
    public boolean isUsuarioEmpiezaLetra() {
        return usuarioEmpiezaLetra;
    }

    /**
     * @param usuarioEmpiezaLetra the usuarioEmpiezaLetra to set
     */
    public void setUsuarioEmpiezaLetra(boolean usuarioEmpiezaLetra) {
        this.usuarioEmpiezaLetra = usuarioEmpiezaLetra;
    }

    /**
     * @return the usuarioYaExistente
     */
    public boolean isUsuarioYaExistente() {
        return usuarioYaExistente;
    }

    /**
     * @param usuarioYaExistente the usuarioYaExistente to set
     */
    public void setUsuarioYaExistente(boolean usuarioYaExistente) {
        this.usuarioYaExistente = usuarioYaExistente;
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
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the preguntaNoVacio
     */
    public boolean isPreguntaNoVacio() {
        return preguntaNoVacio;
    }

    /**
     * @param preguntaNoVacio the preguntaNoVacio to set
     */
    public void setPreguntaNoVacio(boolean preguntaNoVacio) {
        this.preguntaNoVacio = preguntaNoVacio;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the respuestaNoVacio
     */
    public boolean isRespuestaNoVacio() {
        return respuestaNoVacio;
    }

    /**
     * @param respuestaNoVacio the respuestaNoVacio to set
     */
    public void setRespuestaNoVacio(boolean respuestaNoVacio) {
        this.respuestaNoVacio = respuestaNoVacio;
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
