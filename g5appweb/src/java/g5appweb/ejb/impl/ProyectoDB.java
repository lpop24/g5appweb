/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.ejb.impl;

import g5appweb.ejb.impl.UsuarioDB;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author marco
 */
@Entity
@Table(name = "PROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyecto.findAll", query = "SELECT p FROM Proyecto p"),
    @NamedQuery(name = "Proyecto.findByIdProyecto", query = "SELECT p FROM Proyecto p WHERE p.idProyecto = :idProyecto"),
    @NamedQuery(name = "Proyecto.findByNombre", query = "SELECT p FROM Proyecto p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Proyecto.findByDescripcion", query = "SELECT p FROM Proyecto p WHERE p.descripcion = :descripcion")})
public class ProyectoDB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_PROYECTO")
    private String idProyecto;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinTable(name = "USUARIO_PORYECTO", joinColumns = {
        @JoinColumn(name = "PROYECTO_ID_PROYECTO", referencedColumnName = "ID_PROYECTO")}, inverseJoinColumns = {
        @JoinColumn(name = "USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO")})
    @ManyToMany
    private Collection<UsuarioDB> usuarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proyecto")
    private Collection<ComentarioDB> comentarioCollection;
    @JoinColumn(name = "USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private UsuarioDB usuarioIdUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proyecto")
    private Collection<TareaDB> tareaCollection;

    public ProyectoDB() {
    }

    public ProyectoDB(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<UsuarioDB> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<UsuarioDB> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @XmlTransient
    public Collection<ComentarioDB> getComentarioCollection() {
        return comentarioCollection;
    }

    public void setComentarioCollection(Collection<ComentarioDB> comentarioCollection) {
        this.comentarioCollection = comentarioCollection;
    }

    public UsuarioDB getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(UsuarioDB usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    @XmlTransient
    public Collection<TareaDB> getTareaCollection() {
        return tareaCollection;
    }

    public void setTareaCollection(Collection<TareaDB> tareaCollection) {
        this.tareaCollection = tareaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProyecto != null ? idProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProyectoDB)) {
            return false;
        }
        ProyectoDB other = (ProyectoDB) object;
        if ((this.idProyecto == null && other.idProyecto != null) || (this.idProyecto != null && !this.idProyecto.equals(other.idProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Proyecto[ idProyecto=" + idProyecto + " ]";
    }
    
}
