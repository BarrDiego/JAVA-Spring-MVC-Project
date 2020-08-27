<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <form:form id="regForm" modelAttribute="user" action="bienvenido" method="post">
                <table align="center">
                   
                   
                    <tr>
                        <td>
                            <form:label path="nombre">Nombre</form:label>
                        </td>
                        <td>
                            <form:input path="nombre" name="nombre" id="nombre" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="apellido">Apellido</form:label>
                        </td>
                        <td>
                            <form:input path="apellido" name="apellido" id="apellido" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="mail">Email</form:label>
                        </td>
                        <td>
                            <form:input path="mail" name="mail" id="mail" />
                        </td>
                    </tr>
                     <tr>
                        <td>
                            <form:label path="pass">Password</form:label>
                        </td>
                        <td>
                            <form:password path="pass" name="pass" id="pass" />
                        </td>
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="registrar" name="registrar">Registrar</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="index.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
        </body>
        </html>