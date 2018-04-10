<%-- 
    Document   : departamentoApagar
    Created on : 09/04/2018, 21:42:01
    Author     : Ramon
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Apagar Departament</title>
    </head>
    <body>
        <h1>Apagar Departamento</h1>
        <form action="FrontController?action=ApagarDepartamento" method="post">
            Digite o ID do Departamento:
            <input type="text" name="textId"/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
