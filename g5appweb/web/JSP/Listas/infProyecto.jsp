<%-- 
    Document   : registro
    Created on : 14-abr-2016, 21:44:46
    Author     : Juan Antobio Carrasco Estrada
    Descripción: informacion del proyecto para los colaboradores
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
                        
                        <p> Nombre del proyecto:
                        <div class="contenido_formulario">
                            <h2>
                                <%--texto de crear --%>
                                Crear nuevo proyecto
                                
                                <%--texto de editar --%>
                                Editar proyecto

                            </h2>
                            
                            <form action="" method="post" style="formulario_inscripcionII" id="formproyecto">                                                              
                                <div class="formulario_home">

                                    <%--Campo  nombre del proyecto --%>                                    
                                    <p>                                    
                                        <label>Nombre:</label> 
                                        ||nombre||                                        
                                    </p>
                                    
                                    <%--Campo  fecha de creacion solo en editar--%>
                                    <p>
                                         <label>Fecha de creacion:</label>
                                         ||fecha||
                                    </p>                                    
                                    
                                    
                                    <%--Campo Activo --%>
                                    <p>
                                      proyecto Visible: ||activo|| Si / No                                      
                                    </p>
                                    
                                    
                                    <%--Campo  descripcion --%>
                                    <p>
                                    <label>Descripcion:</label>
                                    ||descripcion||
                                    </p>
                                    
                                    
                                    
                                    <%--enlaces e informacion --%>
                                    <p class="texto_1">
                                        Volver a  <a href="../Listas/listaProyectos.jsp"> listas de proyectos </a>
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