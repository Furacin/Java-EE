<%-- 
    Document   : salida
    Created on : 26-jul-2017, 2:09:34
    Author     : manza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gracias</title>
    </head>
    <body>
        <h2>Gracias por cubrir nuestra encuesta</h2>
        <p>
            <!--
                Las expresiones JSP siempre van entre los delimitadores
                que se ven justo después.
            -->
            <%= request.getParameter("nombreCompleto") %>,
            Nos has indicado que estás familiarizado con los siguientes 
            lenguajes de programación:
        </p>
        <ul>
           <!--
                Scriptlest. Pueden contener cualquier código Java y a los 
                objetos implícitos (los que se reciben de otros jsp).
           --> 
            <%
                String [] lenguajesSeleccionados = request.getParameterValues("progLeng");
                if (lenguajesSeleccionados != null) {
                    for (int i=0; i<lenguajesSeleccionados.length; i++) {
            %>        
            <li>
                <!-- Usamos el "=" ya que sólo vamos a mostrar datos-->
                        <%= lenguajesSeleccionados[i] %>
            </li>
            <%
                   }
                }
            %>
        </ul>
    </body>
</html>
