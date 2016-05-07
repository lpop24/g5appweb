/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.modelo;

/**
 *
 * @author fuynfactory
 */
public class Comentario {
    
    private String idComentario="";
    private Proyecto proyectoIdProyecto=null;
    private Usuario usuario=null;  
    private String titulo=""; 
    private String texto="";

    /**
     * @return the idComentario
     */
    public String getIdComentario() {
        return idComentario;
    }

    /**
     * @param idComentario the idComentario to set
     */
    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
    }

    /**
     * @return the proyectoIdProyecto
     */
    public Proyecto getProyectoIdProyecto() {
        return proyectoIdProyecto;
    }

    /**
     * @param proyectoIdProyecto the proyectoIdProyecto to set
     */
    public void setProyectoIdProyecto(Proyecto proyectoIdProyecto) {
        this.proyectoIdProyecto = proyectoIdProyecto;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
