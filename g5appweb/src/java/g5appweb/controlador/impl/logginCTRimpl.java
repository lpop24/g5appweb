/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.controlador.impl;

import g5appweb.controlador.interfaz.logginCTRI;
import g5appweb.modelo.Usuario;
import g5appweb.vista.loggin.LogginFrontBeans;

/**
 *
 * @author fuynfactory
 */
public class logginCTRimpl implements logginCTRI{
    
    public Usuario loggin(LogginFrontBeans formu){
        Usuario usuario =new Usuario();
        usuario.setEmail(formu.getEmail());
        usuario.setPassword(formu.getPassword());        
        /////usuario = logginEJB.loggin(usuario) --> 
        ///  si concide devuelve un usuario con sus datos 
        // si no coincide devuelve un null;
        return usuario;
    }
    
}
