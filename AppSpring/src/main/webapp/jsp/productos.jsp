<%-- 
    Document   : productos
    Created on : 05-sep-2020, 21:28:05
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body style="background-color:  #B5D9B9 ">
      
      
      
          <h1> Bienvenido ${nombre} a su Gestor de Productos</h1>
        <hr>
        <br>
        <h1>Cargar productos</h1>
        <hr>
        <br>
        <form:form method="GET" modelAttribute="producto" action="producto" commandName="producto">
        <table border="2" width="70%" cellpadding="2">
            
          
            <tr>
                
                <td align="center" ><input type="submit" value="Cargar" /></td>
            </tr>
           
        </table>      
                
    </form:form>      
        
        <hr>
        <br>
        <h1>Lista de Productos</h1>
        <hr>
        <br>
        
        <table border="2" width="70%" cellpadding="2">
            <tr>
                <th>Id_Producto:</th>
                <th>Modelo:</th>
                <th>Descripcion:</th>
                <th>Talle:</th>
                <th>Precio:</th>
                <th>Edit/Delete</th>
            </tr>
            <c:forEach items="${listaProducto}" var="producto">
                <tr>
                            <td width="60" align="center">${producto.idProducto}</td>
                            <td width="60" align="center">${producto.modelo}</td>
                            <td width="60" align="center">${producto.descripcion}</td>
                            <td width="60" align="center">${producto.talle}</td>
                            <td width="60" align="center">${producto.precio}</td>
                            <td width="60" align="center"><a href="editar/${producto.idProducto}">[Editar]</a>/<a href="eliminar/${producto.idProducto}">[Eliminar]</a></td>
		</tr>
                
            </c:forEach>
            
            
        </table>
                
        <hr>
        <br>
         <a href="index.jsp">[Home]</a>
        
       
      
        
        
    </body>
</html>
