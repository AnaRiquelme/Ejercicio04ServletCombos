<%-- 
    Document   : index
    Created on : 03-dic-2013, 11:58:47
    Author     : ana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejercicio 4</h1>
        <form name="coches" action="combo">
            <p>Elige una marca</p>
            <select name="marca">
                <option value ="1">BMW</option>
                <option value ="2">Mercedes-Benz</option>
                <option value ="3">Audi</option>
                <option value ="4">Volkswagen</option>
                <option value ="5">Ford</option>
            </select>
            <input type='submit' value='Enviar'/>
        </form>
    </body>
</html>
