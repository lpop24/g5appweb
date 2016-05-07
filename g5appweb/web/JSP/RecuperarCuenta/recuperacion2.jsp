<%-- 
    Document   : registro
    Created on : 14-abr-2016, 21:44:46
    Author     : Juan Antobio Carrasco Estrada
    Descripción: formulario de recuperacion de acceso 2nd parte
--%>

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
                                Recuperacion de tu cuenta
                            </h2>
                            
                            <form action="" method="post" style="formulario_inscripcionII">                                                              
                                <div class="formulario_home">

                                    <%--pregunta del usuario --%>
                                    <p class="texto_1">
                                          ... pregunta del usuario??? ...
                                    </p>

                                    
                                    <%--Campo  respuesta --%>
                                    <p class="informacion">                                        
                                        la respuesta no puede ser vacio
                                    </p>
                                    <p>                                    
                                        <label>Respuesta:</label>
                                        <input type="text" name="respuesta" maxlength="15" />
                                    </p>


                                    <%--Campo  Password --%>
                                    <p class="informacion">
                                        Password no puede estar vacio
                                        Minimo password de 6 caracteres 
                                    </p>                                    
                                    <p>
                                        <label>Password*:</label>
                                            <input type="password" name="password" maxlength="15" />
                                    </p>

                                    
                                    <%--Campo  Repite Password --%>
                                    <p class="informacion">
                                        No coincide con el password                                        
                                    </p>                                    
                                    <p>
                                        <label>Repite Password*:</label>
                                            <input type="password" name="repitePassword" maxlength="15" />
                                    </p>

                                    
                                    <%--Boton --%>
                                    <div class="botones_formulario">

                                        <input type="submit" value="Enviar">


                                    </div>
                                    <br />
                                    
                                    <%--enlaces e informacion --%>
                                    <p class="texto_1">
                                        <a href="../Login/login.jsp"> Volver </a>
                                    </p>

                            </div>
                            <br>
                        </form>
                    </div>
                </div>
       	
	<div id="pie"></div>                 
	</body>
</html>