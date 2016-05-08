/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g5appweb.vista.loggin;

import g5appweb.controlador.interfaz.logginCTRI;
import g5appweb.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "LogginServlet", urlPatterns = {"/LogginServlet"})
public class LogginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        LogginFrontBeans login = null;
        Usuario usuario = null;
        login = (LogginFrontBeans)session.getAttribute("login");
        usuario = (Usuario)session.getAttribute("usuario");   

         RequestDispatcher dispatcher = null; //getServletContext().getRequestDispatcher("JSP/Login/login.jsp");

        //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/JSP/Login/login.jsp");
        //dispatcher.forward(request, response);

         char chVal1 ='a';
          char chVal2 ='z';
          char chVal3 ='A';
          char chVal4 ='Z';
          char chVal5 ='n';
          char chVal6 ='Ñ';
          char chVal7 ='ç';
          char chVal8 ='Ç';



          if  ((usuario == null)
             &&(login == null)) {

              login= new LogginFrontBeans();
              login.setDenegado(Boolean.FALSE);
              session.setAttribute("login", login);
              dispatcher = getServletContext().getRequestDispatcher("/JSP/Login/login.jsp");



          } else if  ((usuario == null) 
                  && (login != null)){


              if(request.getParameter("email") != null) 
                  login.setEmail(request.getParameter("email"));
              if(request.getParameter("password") != null) 
                  login.setPassword(request.getParameter("password"));





              if ((!login.getEmail().equals(""))                    
                      && (!login.getPassword().equals(""))){


              if  (((login.getEmail().charAt(0)>=chVal1) && (login.getEmail().charAt(0)<=chVal2))
                || ((login.getEmail().charAt(0)>=chVal3) && (login.getEmail().charAt(0)<=chVal4))
                || ((login.getEmail().charAt(0)>=chVal3) && (login.getEmail().charAt(0)<=chVal4))
                || (login.getEmail().charAt(0)==chVal5)
                || (login.getEmail().charAt(0)==chVal6)
                || (login.getEmail().charAt(0)==chVal7)
                || (login.getEmail().charAt(0)==chVal8)){
                       System.out.println(login.getPassword().charAt(0)); 
                       //logginCTRI d= null;
                       //usuario= d.loggin(login);
                      //////////////////////////////////////////////////////////////////////////////
                      //TODO: preguntar en la permanencia si esta el usuario que login ha traido  //
                      //////////////////////////////////////////////////////////////////////////////                    
                      if ((login.getEmail().equals("root")) && (login.getPassword().equals("root"))){
                         dispatcher = getServletContext().getRequestDispatcher("/JSP/Listas/listaProyectos.jsp");
                         dispatcher.forward(request, response);                
                      } 
                 }
              }
         login.setDenegado(Boolean.TRUE);     
         }


         login.setEmail("");
         login.setPassword("");
         session.setAttribute("login", login);
         dispatcher = getServletContext().getRequestDispatcher("/JSP/Login/login.jsp");
         dispatcher.forward(request, response);
       
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
