/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.ejb.impl;

import java.io.Serializable;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
 * @author 
 */

@Entity
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
@NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
@NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
@NamedQuery(name = "Usuario.findByApellido", query = "SELECT u FROM Usuario u WHERE u.apellido = :apellido"),
@NamedQuery(name = "Usuario.findByTelefono", query = "SELECT u FROM Usuario u WHERE u.telefono = :telefono"),
@NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email"),
@NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password"),
@NamedQuery(name = "Usuario.findByRecuperaPassword", query = "SELECT u FROM Usuario u WHERE u.recuperaPassword = :recuperaPassword")})

public class UsuarioDB implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    
    @Column(name = "ID_USUARIO")
    private String idUsuario;
    @Size(max = 50)
    
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Size(max = 50)
    @Column(name = "APELLIDO")
    private String apellido;
    
    @Column(name = "TELEFONO")
    private BigInteger telefono;
    
    @Size(max = 50)
    @Column(name = "EMAIL")
    private String email;
    
    @Size(max = 20)
    @Column(name = "PASSWORD")
    private String password;
    
    @Size(max = 30)
    @Column(name = "RECUPERA_PASSWORD")
    private String recuperaPassword;
    
    @ManyToMany(mappedBy = "usuarioCollection")
    private Collection<ProyectoDB> proyectoCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdUsuario")
    private Collection<ProyectoDB> proyectoCollection1;
    
    public UsuarioDB() {
    }

    public UsuarioDB(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRecuperaPassword() {
        return recuperaPassword;
    }

    public void setRecuperaPassword(String recuperaPassword) {
        this.recuperaPassword = recuperaPassword;
    }

    @XmlTransient
    public Collection<ProyectoDB> getProyectoCollection() {
        return proyectoCollection;
    }

    public void setProyectoCollection(Collection<ProyectoDB> proyectoCollection) {
        this.proyectoCollection = proyectoCollection;
    }

    @XmlTransient
    public Collection<ProyectoDB> getProyectoCollection1() {
        return proyectoCollection1;
    }

    public void setProyectoCollection1(Collection<ProyectoDB> proyectoCollection1) {
        this.proyectoCollection1 = proyectoCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioDB)) {
            return false;
        }
        UsuarioDB other = (UsuarioDB) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
