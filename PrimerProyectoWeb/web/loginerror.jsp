<%-- 
    Document   : loginerror
    Created on : 27-jul-2017, 2:17:23
    Author     : manza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error de login</title>
    </head>
    <body>
        <p>Se ha producido un error al hacer login. Inténtelo de nuevo, por favor.</p>
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
