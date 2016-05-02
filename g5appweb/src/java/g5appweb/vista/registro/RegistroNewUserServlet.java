/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.vista.registro;

import g5appweb.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fuynfactory
 */
@WebServlet(name = "RegistroNewUserServlet", urlPatterns = {"/RegistroNewUserServlet"})
public class RegistroNewUserServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     * RegistroNewUserFrontBeans
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();      
        Usuario usuario = null;
        RegistroNewUserFrontBeans  newUser =null; 
        usuario = (Usuario)session.getAttribute("usuario");   
        newUser = (RegistroNewUserFrontBeans)session.getAttribute("newUser");   
        if  ((usuario == null)&& (newUser==null)){
            
            newUser.setApellidosEmpiezaLetra(Boolean.FALSE);
            newUser.setCorreoNoVacio(Boolean.FALSE);
            newUser.setCorreoNoValido(Boolean.FALSE);
            newUser.setNombreEmpiezaLetra(Boolean.FALSE);
            newUser.setPasswordMin6(Boolean.FALSE);
            newUser.setPasswordNoVacio(Boolean.FALSE);
            newUser.setPreguntaNoVacio(Boolean.FALSE);
            newUser.setRepPasswordCoincide(Boolean.FALSE);
            newUser.setRespuestaNoVacio(Boolean.FALSE);
            newUser.setTelefonoEmpiezaLetra(Boolean.FALSE);
            newUser.setUsuarioNoVacio(Boolean.FALSE);
            newUser.setUsuarioYaExistente(Boolean.FALSE);
            
            
        } else {
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
