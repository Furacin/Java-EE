<%-- 
    Document   : login
    Created on : 27-jul-2017, 1:48:28
    Author     : manza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <p>Por favor escribe tu nombre de usuario y contraseña para acceder a la aplicación</p>
        <form action="j_security_check" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td><b>Nombre de usuario</b>:&nbsp</td>
                        <td><input type="text" name="j_username"/></td>
                    </tr>
                    <tr>
                        <td><b>Contraseña</b>: &nbsp</td>
                        <td><input type="password" name="j_password"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
