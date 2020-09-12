<%-- 
    Document   : edit
    Created on : 06-sep-2020, 22:08:07
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
        <h2>Ingrese su producto</h2>
        <hr>
        <br>
        <form:form  method="POST" action="actualizar" commandName="producto" modelAttribute="producto">
        <table border="2" width="70%" cellpadding="2">
            
            <tr>
                <form:hidden path="idProducto" />
                <td><label>Modelo: </label></td>
                <td><form:input type="text" path="modelo" /></td>  
            </tr>
            <tr>
                <td><label>Descripcion: </label></td>
                <td><form:input type="text" path="descripcion" /></td>  
            </tr>
            <tr>
                <td><label>Talle: </label></td>
                <td><form:input type="text" path="talle" /></td>  
            </tr>
            <tr>
                <td><label>Precio: </label></td>
                <td><form:input type="text" path="precio" /></td>  
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Actualizar" /></td>
            </tr>
          
        </table>      
                
    </form:form>
    </body>
</html>
