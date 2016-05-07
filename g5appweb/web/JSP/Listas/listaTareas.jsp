<%-- 
    Document   : registro
    Created on : 14-abr-2016, 21:44:46
    Author     : Juan Antobio Carrasco Estrada
    Descripción: listado de proyectos propios y colavoracion 
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
                     <%--Nombre del usuario --%>
                    Usuario
		</div>
                <div id="fondo">
		</div>
            </div>
                    
                    
            <div id="cuerpo">
                
            	<div id="menu">
                    <div class="opcion_menu">
                            <h2>
                                    Filtros de Tareas
                            </h2>
                            <ul>
                                <li>
                                        <a href="">Añadir Nueva Tarea</a>
                                </li>
                                <li>
                                        <a href="">Tareas Sin Asignar</a>
                                </li>
                                <li>
                                        <a href="">Tareas asignadas</a>
                                </li>
                                <li>
                                        <a href="">Tus Tareas</a>
                                </li>
                                <li>
                                        <a href="">Tareas A revisar</a>
                                </li>
                                <li>
                                        <a href="">Terminadas</a>
                                </li>

                            </ul>
                    </div>
                </div>
                <div id="contenido_pagina">
                    <div id="noticia"> 
                        <h1> 
				Tareas sin asignar
			</h1>
                        <dd>
                                                    <table>
                            <%--cabecera --%>
                        <tr>
                          <th>Mombre del proyecto</th>
                          <th>fecha de inicio</th>
                          <th>estado</th>
                          
                          <%-- no estara activo en mis colaboraciones--%>
                          <th>_</th>
                          
                        </tr>
                        <tr>
                          <td><a href=""> pagina web social</a></td>
                          <td>2016.05.05</td>
                          <td>En activo</td>
                          
                          <%-- se mostrara en mis proyectos--%>
                          <td><a href=""> [Editar]</a></td>
                          
                        </tr>
                        <tr>
                          <td><a href=""> tratamientos de tapones</a></td>
                          <td>2016.05.05</td>
                          <td>En activo</td>
                          
                          <%-- se mostrara en mis colaboraciones--%>
                          <td><a href=""> [Detalles]</a></td>
                          
                        </tr>

                        </table>

                        </dd>
                    </div>
                </div>
                <div id="menu2">
                    <div class="opcion_menu">
                            <h2>
                                    Usuarios
                            </h2>
                            <ul>
                                <li>
                                    <a href="">ahoraConMasCabra</a>                                   
                                </li>
                                <li>
                                    <a href="">ción</a>                               
                                </li>
                                <li>
                                    <a href="">dona</a>
                                </li>                                    
                            </ul>
                    </div>
             
                </div>

	</div>
	</div>

                 
               
                </div>
       	
	<div id="pie"></div>                 
	</body>
</html>
        
        
