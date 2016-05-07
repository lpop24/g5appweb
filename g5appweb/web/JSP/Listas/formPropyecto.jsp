<%-- 
    Document   : registro
    Created on : 14-abr-2016, 21:44:46
    Author     : Juan Antobio Carrasco Estrada
    Descripción: formulario de crear y editar nuevo proyecto
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
                                <%--texto de crear --%>
                                Crear nuevo proyecto
                                
                                <%--texto de editar --%>
                                Editar proyecto

                            </h2>
                            
                            <form action="" method="post" style="formulario_inscripcionII" id="formproyecto">                                                              
                                <div class="formulario_home">

                                    <%--Campo  nombre del proyqcto --%>
                                    <p class="informacion">
                                        El proyecto deve tener un nombre
                                        deve empezar por letra                                        
                                    </p>                                    
                                    <p>                                    
                                        <label>Nombre*:</label>
                                        <input type="text" name="nombre" maxlength="15" />
                                    </p>
                                    
                                    <%--Campo  fecha de creacion solo en editar--%>
                                    <p>
                                         <label>Fecha de creacion:</label>
                                         ||fecha||
                                    </p>                                    
                                    
                                    
                                    <%--Campo Activo --%>
                                    <p>
                                      proyecto Visible:
                                      <input type="checkbox" name="activo" value="enabled"><br>
                                    </p>
                                    
                                    
                                    <%--Campo  descripcion --%>
                                    <p>
                                        <label>Descripcion:</label>
                                        <textarea rows="4" cols="50" name="descripcion" form="formproyecto"></textarea>
                                    </p>
                                  
                                    
                                    <%--Boton --%>
                                    <div class="botones_formulario">
                                        
                                                    <%--Creacion --%>
                                        <input type="submit" value="Nuevo">
                                        
                                                    <%--Edicion --%>
                                        <input type="submit" value="Editar">
                                        <input type="reset" value="Restaurar">


                                    </div>
                                    <br />
                                    
                                    <%--enlaces e informacion --%>
                                    <p class="texto_1">
                                        Volver a  <a href="../Listas/listaProyectos.jsp"> listas de proyectos </a>
                                    </p>
                                    

                            </div>
                            <br>
                        </form>
                    </div>
                </div>
       	
	<div id="pie"></div>                 
	</body>
</html>