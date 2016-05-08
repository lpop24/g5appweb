/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.vista.registro;

import g5appweb.modelo.Usuario;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
 
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
 
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
            
            newUser=new RegistroNewUserFrontBeans();            
            newUser.setApellidosEmpiezaLetra(Boolean.FALSE);
            newUser.setCorreoNoVacio(Boolean.FALSE);
            newUser.setCorreoNoValido(Boolean.FALSE);
            newUser.setNombreEmpiezaLetra(Boolean.FALSE);
            newUser.setPasswordMin6(Boolean.FALSE);
            newUser.setPasswordNoVacio(Boolean.FALSE);
            newUser.setPunkNoVacio(Boolean.FALSE);
            newUser.setRepPasswordCoincide(Boolean.FALSE);
            newUser.setRepitePunkNoCoincide(Boolean.FALSE);
            newUser.setTelefonoEmpiezaLetra(Boolean.FALSE);
            
            
        } else if (newUser!=null){
            // capturacion 
            if(request.getParameter("email") != null) 
                  newUser.setCorreo(request.getParameter("email"));
            
            if(request.getParameter("password") != null) 
                  newUser.setPassword(request.getParameter("password"));
            
            if(request.getParameter("repitePassword") != null) 
                  newUser.setRepPassword(request.getParameter("repitePassword"));
            
            if(request.getParameter("punk") != null) 
                  newUser.setPunk(request.getParameter("punk"));
                        
            if(request.getParameter("repitePunk") != null) 
                  newUser.setRepitePunk(request.getParameter("repitePunk"));
            
            if(request.getParameter("nombre") != null) 
                  newUser.setNombre(request.getParameter("nombre"));
            
            if(request.getParameter("apellidos") != null) 
                  newUser.setApellidos(request.getParameter("apellidos"));
                        
            if(request.getParameter("telefono") != null) 
                  newUser.setTelefono(request.getParameter("telefono"));
                   
            
            /// validacion email
            if (newUser.getCorreo().equals(""))
                newUser.setCorreoNoVacio(Boolean.TRUE);
            
            if (!validateEmail (newUser.getCorreo()))
                newUser.setCorreoNoValido(Boolean.TRUE);
            
            
            // validacion password
            if (newUser.getPassword().equals(""))
                newUser.setPasswordNoVacio(Boolean.TRUE);
            
            if (newUser.getPassword().length()<6)
                newUser.setPasswordMin6(Boolean.TRUE);
            
            if (!newUser.getRepPassword().equals(newUser.getPassword()))
                newUser.setRepPasswordCoincide(Boolean.TRUE);
            
            if (newUser.getPunk().equals(""))
                newUser.setPunkNoVacio(Boolean.TRUE);
            
        }
    }
    
     /**
     * Validate given email with regular expression.
     * 
     * @param email
     *            email for validation
     * @return true valid email, otherwise false
     */
    public static boolean validateEmail(String email) {
 
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
 
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
