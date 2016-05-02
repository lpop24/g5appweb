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
                
            <div id="pagina">                
                 
                <div id="herramientas_contenido">
                    <%--enlace de mis proyectos --%>
                    <a href="" ><b>[[Mis proyectos]]</b></a>  
                    
                    <%--enlace de mis colaboraciones --%>
                    <a href="" >Mis colaboraciones</a> 
                    
                    <%--enlace nuevo proyecto (solo aparece en mis proyectos) --%>
                    <a href="" ><b>[[Nuevo proyecto]]</b></a>
                    
                </div>
                    <div class="table">
                        <table>
                            <%--cabecera --%>
                        <tr>
                          <th>Mombre de la tarea </th>
                          <th>fecha de inicio</th>
                          <th>Usuario </th>                         
                          
                          
                          
                        </tr>
                        <tr>
                          <td><a href=""> redactando el CCS</a></td>
                          <td>2016.05.05</td>
                          <td><a href=""> asignartelo </a></td>                          
                                                    
                          
                        </tr>
                        <tr>
                          <td><a href="">recojida de tapones</a></td>
                          <td>2016.05.05</td>
                          <td><a href=""> asignartelo </a></td>
                          

                          
                          
                        </tr>

                        </table>
                    </div>
                </div>
       	
	<div id="pie"></div>                 
	</body>
</html>
        
        
