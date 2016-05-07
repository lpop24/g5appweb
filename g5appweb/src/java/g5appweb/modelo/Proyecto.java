/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.modelo;

import java.util.List;

/**
 *
 * @author fuynfactory
 */
public class Proyecto {
    private String idProyecto="";
    private String nombre="";
    private String descripcion="";
    private Usuario usuarioIdUsuario=null;
    private List<Usuario> acociados=null;

    /**
     * @return the idProyecto
     */
    public String getIdProyecto() {
        return idProyecto;
    }

    /**
     * @param idProyecto the idProyecto to set
     */
    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the usuarioIdUsuario
     */
    public Usuario getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    /**
     * @param usuarioIdUsuario the usuarioIdUsuario to set
     */
    public void setUsuarioIdUsuario(Usuario usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    /**
     * @return the acociados
     */
    public List<Usuario> getAcociados() {
        return acociados;
    }

    /**
     * @param acociados the acociados to set
     */
    public void setAcociados(List<Usuario> acociados) {
        this.acociados = acociados;
    }
    
}
