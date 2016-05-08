/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.ejb.interfaz;

import g5appweb.ejb.impl.ComentarioDB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marco
 */
@Stateless
public class ComentarioFacade extends AbstractFacade<ComentarioDB> {

    @PersistenceContext(unitName = "TawProject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComentarioFacade() {
        super(ComentarioDB.class);
    }
    
}
