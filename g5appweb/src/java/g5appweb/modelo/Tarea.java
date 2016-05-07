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
public class Tarea {
    private String idTarea="";
    private String descriptcion="";
    private String estado="";
    private String prioridad="";
    private Proyecto proyectoIdProyecto=null;

    /**
     * @return the idTarea
     */
    public String getIdTarea() {
        return idTarea;
    }

    /**
     * @param idTarea the idTarea to set
     */
    public void setIdTarea(String idTarea) {
        this.idTarea = idTarea;
    }

    /**
     * @return the descriptcion
     */
    public String getDescriptcion() {
        return descriptcion;
    }

    /**
     * @param descriptcion the descriptcion to set
     */
    public void setDescriptcion(String descriptcion) {
        this.descriptcion = descriptcion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
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

    
}
