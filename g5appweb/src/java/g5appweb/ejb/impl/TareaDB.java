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
@Table(name = "TAREA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarea.findAll", query = "SELECT t FROM Tarea t"),
    @NamedQuery(name = "Tarea.findByIdTarea", query = "SELECT t FROM Tarea t WHERE t.tareaPK.idTarea = :idTarea"),
    @NamedQuery(name = "Tarea.findByDescriptcion", query = "SELECT t FROM Tarea t WHERE t.descriptcion = :descriptcion"),
    @NamedQuery(name = "Tarea.findByEstado", query = "SELECT t FROM Tarea t WHERE t.estado = :estado"),
    @NamedQuery(name = "Tarea.findByPrioridad", query = "SELECT t FROM Tarea t WHERE t.prioridad = :prioridad"),
    @NamedQuery(name = "Tarea.findByProyectoIdProyecto", query = "SELECT t FROM Tarea t WHERE t.tareaPK.proyectoIdProyecto = :proyectoIdProyecto")})
public class TareaDB implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TareaPK tareaPK;
    @Size(max = 200)
    @Column(name = "DESCRIPTCION")
    private String descriptcion;
    @Size(max = 20)
    @Column(name = "ESTADO")
    private String estado;
    @Size(max = 20)
    @Column(name = "PRIORIDAD")
    private String prioridad;
    @JoinColumn(name = "PROYECTO_ID_PROYECTO", referencedColumnName = "ID_PROYECTO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProyectoDB proyecto;

    public TareaDB() {
    }

    public TareaDB(TareaPK tareaPK) {
        this.tareaPK = tareaPK;
    }

    public TareaDB(String idTarea, String proyectoIdProyecto) {
        this.tareaPK = new TareaPK(idTarea, proyectoIdProyecto);
    }

    public TareaPK getTareaPK() {
        return tareaPK;
    }

    public void setTareaPK(TareaPK tareaPK) {
        this.tareaPK = tareaPK;
    }

    public String getDescriptcion() {
        return descriptcion;
    }

    public void setDescriptcion(String descriptcion) {
        this.descriptcion = descriptcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
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
        hash += (tareaPK != null ? tareaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TareaDB)) {
            return false;
        }
        TareaDB other = (TareaDB) object;
        if ((this.tareaPK == null && other.tareaPK != null) || (this.tareaPK != null && !this.tareaPK.equals(other.tareaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tarea[ tareaPK=" + tareaPK + " ]";
    }
    
}
