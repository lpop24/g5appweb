<%-- 
    Document   : layaoutLogin
    Created on : 14-abr-2016, 21:44:46
    Author     : Juan Antobio Carrasco Estrada
    Descripción: un pequeño formulario que se usa para identificarse y carga en el session el usuario
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
            <%@ include file="../meta/metaExtranet.jsp"%>
		
	</head>
	<body>
            <div id="cabecera">
                <div id="herramientas">
		</div>
                <div id="barra">
		</div>
            </div>
             <center>
                <div id="cuerpo">
                    <div id="contenido_pagina_login">
                        <h2>
                            Proyectos sociales
                        </h2>

                        <c:if test="${login.denegado}" >                        
                            <p class="informacion"> acceso denegado </p>
                        </c:if>
                        <form action="LogginServlet" method="post" style="formulario_inscripcionII">                                                              
                            <div class="formulario_home">
                                  
                                    
                                <%--campo Email --%>
                            <p>
                                <label>Email:</label>
                                <input type="text" name="email" maxlength="20" value="${login.email}" />
                            </p>


                            <%--campo password --%>
                            <p>
                                <label>Password</label>
                                    <input type="password" name="password" maxlength="15" value="${login.password}" />
                            </p>


                            <%--Boton de entrar --%>
                            <div class="botones_formulario">
                                <input type="submit" value="Entrar">
                            </div>
                            <br />


                            <%--enlaces e informacion --%>
                            <p class="texto_1">
                                si no estas <a href="./registroNewUserServlet"> registrate </a>
                            </p>
                            <p class="texto_1">
                                si no puedes entrar puedes recuperar <a href="../RecuperarCuenta/recuperacion1.jsp"> tu contraseña</a>
                            </p>

                            </div>
                            
                        </form>
                    </div>
                </div>
             </center>
       	
	<div id="pie"></div>                 
	</body>
</html>