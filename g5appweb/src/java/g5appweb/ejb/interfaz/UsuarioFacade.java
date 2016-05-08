/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.ejb.interfaz;



import g5appweb.ejb.impl.UsuarioDB;
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
public class UsuarioFacade extends AbstractFacade<UsuarioDB> {

    @PersistenceContext(unitName = "TawProject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(UsuarioDB.class);
    }
    public List<String> proyectosinscritos(String idusuario){
        
        return em.createQuery("SELECT PROYECTO_ID_PROYECTO FROM USUARIO_PORYECTO WHERE USUARIO_ID_USUARIO LIKE :idusuario")
        .setParameter("idusuario", idusuario)
        .getResultList();

    }
    
    public boolean usuariologin (String user,String pass){
        Query q;
        boolean state=false;
        q=em.createQuery("SELECT NOMBRE FROM USUARIO WHERE ID_USUARIO= :user,PASSWORD= :pass")
        .setParameter("user", user)
        .setParameter("pass", pass);
        String nombre=(String)q.getSingleResult();
        if(nombre!=null){
            //usuario registrado
            state =true;
            
        }else{
            //usuario no registrado
        }
        return state;
    }
}
