/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.ejb.impl;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marco
 */
@Entity
@Table(name = "COMENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentario.findAll", query = "SELECT c FROM Comentario c"),
    @NamedQuery(name = "Comentario.findByIdComentario", query = "SELECT c FROM Comentario c WHERE c.comentarioPK.idComentario = :idComentario"),
    @NamedQuery(name = "Comentario.findByProyectoIdProyecto", query = "SELECT c FROM Comentario c WHERE c.comentarioPK.proyectoIdProyecto = :proyectoIdProyecto"),
    @NamedQuery(name = "Comentario.findByUsuario", query = "SELECT c FROM Comentario c WHERE c.usuario = :usuario"),
    @NamedQuery(name = "Comentario.findByTitulo", query = "SELECT c FROM Comentario c WHERE c.titulo = :titulo"),
    @NamedQuery(name = "Comentario.findByTexto", query = "SELECT c FROM Comentario c WHERE c.texto = :texto")})
public class ComentarioDB implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComentarioPK comentarioPK;
    @Size(max = 20)
    @Column(name = "USUARIO")
    private String usuario;
    @Size(max = 200)
    @Column(name = "TITULO")
    private String titulo;
    @Size(max = 1000)
    @Column(name = "TEXTO")
    private String texto;
    @JoinColumn(name = "PROYECTO_ID_PROYECTO", referencedColumnName = "ID_PROYECTO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProyectoDB proyecto;

    public ComentarioDB() {
    }

    public ComentarioDB(ComentarioPK comentarioPK) {
        this.comentarioPK = comentarioPK;
    }

    public ComentarioDB(String idComentario, String proyectoIdProyecto) {
        this.comentarioPK = new ComentarioPK(idComentario, proyectoIdProyecto);
    }

    public ComentarioPK getComentarioPK() {
        return comentarioPK;
    }

    public void setComentarioPK(ComentarioPK comentarioPK) {
        this.comentarioPK = comentarioPK;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ProyectoDB getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoDB proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comentarioPK != null ? comentarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComentarioDB)) {
            return false;
        }
        ComentarioDB other = (ComentarioDB) object;
        if ((this.comentarioPK == null && other.comentarioPK != null) || (this.comentarioPK != null && !this.comentarioPK.equals(other.comentarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Comentario[ comentarioPK=" + comentarioPK + " ]";
    }
    
}
