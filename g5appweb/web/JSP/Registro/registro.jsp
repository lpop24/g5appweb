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

    
                                    
                                    <%--Campo punk --%>
                                    <c:if test="${newUser.punkNoVacio}" > 
                                        <p class="informacion">el campo codigo punk no puede quedar vacio</p>
                                    </c:if>
                                    <p>                                    
                                        <label>Codigo Punk*:</label>
                                        <input type="text" name="punk" maxlength="15" value="${newUser.punk}"/>
                                    </p>

                                
                                    <%--Repite punk --%>
                                    <c:if test="${newUser.repitePunkNoCoincide}" > 
                                        <p class="informacion">no coincide con el punk</p>
                                    </c:if>
                                    <p>                                    
                                        <label>repite Codigo Punk*:</label>
                                        <input type="text" name="repitePunk" maxlength="15" value="${newUser.repitePunk}"/>
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
                                        <input type="text" name="telefono" maxlength="15" value="${newUser.telefono}"/>
                                    </p>
                                    
                                    <%--Campo id --%>                                    
                                    <imput type="hidden" name="id" value="${newUser.id}"/>
                                    
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