/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.ejb.impl;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author marco
 */
@Embeddable
public class ComentarioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_COMENTARIO")
    private String idComentario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PROYECTO_ID_PROYECTO")
    private String proyectoIdProyecto;

    public ComentarioPK() {
    }

    public ComentarioPK(String idComentario, String proyectoIdProyecto) {
        this.idComentario = idComentario;
        this.proyectoIdProyecto = proyectoIdProyecto;
    }

    public String getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
    }

    public String getProyectoIdProyecto() {
        return proyectoIdProyecto;
    }

    public void setProyectoIdProyecto(String proyectoIdProyecto) {
        this.proyectoIdProyecto = proyectoIdProyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComentario != null ? idComentario.hashCode() : 0);
        hash += (proyectoIdProyecto != null ? proyectoIdProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComentarioPK)) {
            return false;
        }
        ComentarioPK other = (ComentarioPK) object;
        if ((this.idComentario == null && other.idComentario != null) || (this.idComentario != null && !this.idComentario.equals(other.idComentario))) {
            return false;
        }
        if ((this.proyectoIdProyecto == null && other.proyectoIdProyecto != null) || (this.proyectoIdProyecto != null && !this.proyectoIdProyecto.equals(other.proyectoIdProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ComentarioPK[ idComentario=" + idComentario + ", proyectoIdProyecto=" + proyectoIdProyecto + " ]";
    }
    
}
