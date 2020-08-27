
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
        </head>
        <body>
            <form:form id="loginForm" modelAttribute="userLogin" action="inicio" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="mail">Usuario: Su correo electronico </form:label>
                        </td>
                        <td>
                            <form:input type="text" path="mail" name="mail" id="mail" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="pass">Password:</form:label>
                        </td>
                        <td>
                            <form:input type="password" path="pass" name="pass" id="pass" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="login" name="login">Login</form:button>>
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
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>
        </body>
        </html>