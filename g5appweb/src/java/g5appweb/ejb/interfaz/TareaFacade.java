/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.ejb.interfaz;

import g5appweb.ejb.impl.TareaDB;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author marco
 */
@Stateless
public class TareaFacade extends AbstractFacade<TareaDB> {

    @PersistenceContext(unitName = "TawProject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TareaFacade() {
        super(TareaDB.class);
    }
    
    public List<TareaDB> mistareasasociadas(String idproyecto){
        Query q;
        q=em.createNamedQuery("Tarea.findByProyectoIdProyecto")
        .setParameter("proyectoIdProyecto",idproyecto );
        List<TareaDB> milista= q.getResultList();
        return milista;
    }
}
