<%-- 
    Document   : registro
    Created on : 14-abr-2016, 21:44:46
    Author     : Juan Antobio Carrasco Estrada
    Descripción: formulario de inscripcion a la plataforma

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
                <div id="fondo">
		</div>
            </div>
                
            <div id="pagina">
                
                        <div class="contenido_formulario">
                            <h2>
                                Registro de Usuario
                            </h2>
                            
                            <form action="" method="post" style="formulario_inscripcionII">                                                              
                                <div class="formulario_home">

                                    <%--Campo  Usuario --%>                                      
                                    <c:if test="${newUser.usuarioNoVacio}" > 
                                        <p class="informacion"> Usuario no puede estar vacio  </p>
                                    </c:if>
                                    <c:if test="${newUser.usuarioEmpiezaLetra}" > 
                                        <p class="informacion"> Usuario deve empezar por letra </p>
                                    </c:if>
                                    <c:if test="${newUser.usuarioYaExistente}" > 
                                        <p class="informacion"> Usuario ya existente, usa otro usuario</p>
                                    </c:if>
                                    
                                    <p>                                    
                                        <label>Usuario*:</label>
                                        <input type="text" name="usuario" maxlength="15"  value="${newUser.usuario}"/>
                                    </p>

    
                                    <%--Campo  Password --%>
                                    <c:if test="${newUser.passwordNoVacio}" > 
                                        <p class="informacion"> Password no puede estar vacio </p>
                                    </c:if>
                                    
                                    <c:if test="${newUser.passwordMin6}" > 
                                        <p class="informacion"> Minimo password de 6 caracteres </p>
                                    </c:if>
                                    
                                    <p>
                                        <label>Password*:</label>
                                            <input type="password" name="password" maxlength="15" value="${newUser.password}" />
                                    </p>

                                        
                                    <%--Campo  Repite Password --%>
                                    <c:if test="${newUser.repPasswordCoincide}" > 
                                        <p class="informacion"> No coincide con el password </p>
                                    </c:if>
                                    <p>
                                        <label>Repite Password*:</label>
                                            <input type="password" name="repitePassword" maxlength="15" value="${newUser.repPassword}"/>
                                    </p>

    
                                    
                                    <%--Campo  pregunta --%>
                                    <c:if test="${newUser.preguntaNoVacio}" > 
                                        <p class="informacion">la pregunta para recordad no puede quedar vacio</p>
                                    </c:if>
                                    <p>                                    
                                        <label>Pregunta para recordar*:</label>
                                        <input type="text" name="pregunta" maxlength="15" value="${newUser.pregunta}"/>
                                    </p>



                                    <%--Campo  repuesta --%>
                                    <c:if test="${newUser.respuestaNoVacio}" > 
                                        <p class="informacion"> no puede quedar vacio la respuesta </p>
                                    </c:if>
                                    <p>                                    
                                        <label>Respuesta*:</label>
                                        <input type="text" name="respuesta" maxlength="15" value="${newUser.respuesta}"/>
                                    </p>
                                    
    
                                    
                                    <%--Campo  Email --%>
                                    <c:if test="${newUser.correoNoVacio}" > 
                                        <p class="informacion"> No puede quedar vacio Email </p>
                                    </c:if>
                                    <c:if test="${newUser.correoNoValido}" > 
                                        <p class="informacion">Email no valido </p>
                                    </c:if>
                                    <p>                                    
                                        <label>Correo Electronico (Email)*:</label>
                                        <input type="text" name="email" maxlength="15" value="${newUser.correo}"/>
                                    </p>
                                    
    
                                    
                                    <%--Campo  nombre --%>
                                    <c:if test="${newUser.nombreEmpiezaLetra}" > 
                                        <p class="informacion"> el nombre deve empezar por letra </p>
                                    </c:if>
                                    
                                    <p>                                    
                                        <label>Nombre: </label>
                                        <input type="text" name="nombre" maxlength="15" value="${newUser.nombre}"/>
                                    </p>
                                    
    
                                    
                                    <%--Campo  apellidos --%>
                                    <c:if test="${newUser.apellidosEmpiezaLetra}" >
                                        <p class="informacion">  el apellido deve empezar por letra </p>
                                    </c:if>
                                    <p>                                    
                                        <label>apellidos: </label>
                                        <input type="text" name="apellidos" maxlength="15" value="${newUser.apellidos}"/>
                                    </p>
                                    
                                    
                                    <%--Campo  Telefono --%>
                                    <c:if test="${newUser.telefonoEmpiezaLetra}" > 
                                        <p class="informacion"> Telefono no valido </p>
                                    </c:if>
                                    <p>                                    
                                        <label>Telefono: </label>
                                        <input type="text" name="Telefono" maxlength="15" value="${newUser.telefono}"/>
                                    </p>
                                    
                                    
                                    <%--Boton --%>
                                    <div class="botones_formulario">

                                        <input type="submit" value="Registrarse">


                                    </div>
                                    <br />
                                    
                                    <%--enlaces e informacion --%>
                                    <p class="texto_1">
                                        Volver a  <a href="/LogeoServlet"> login </a>
                                    </p>
                                    <p class="texto_1">
                                        los campos (*) son obligatorios
                                    </p>

                            </div>
                            <br>
                        </form>
                    </div>
                </div>
       	
	<div id="pie"></div>                 
	</body>
</html>