<%-- 
    Document   : registro
    Created on : 14-abr-2016, 21:44:46
    Author     : Juan Antobio Carrasco Estrada
    Descripción: formulario de recuperacion de acceso
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
                            
                            
                            <p class="informacion">                                        
                                Acceso denegado
                            </p>
                            
                            <form action="" method="post" style="formulario_inscripcionII">                                                              
                                <div class="formulario_home">

                                    
                                    
                                    <%--Campo  Usuario --%>
                                    
                                    <p>                                    
                                        <label>Usuario:</label>
                                        <input type="text" name="usuario" maxlength="15" />
                                    </p>


                                    <%--Campo  Email --%>
                                    
                                    <p>                                    
                                        <label>Correo Electronico (Email):</label>
                                        <input type="text" name="email" maxlength="15" />
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