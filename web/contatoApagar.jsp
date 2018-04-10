<%-- 
    Document   : contatoApagar
    Created on : 05/04/2018, 00:23:04
    Author     : Ramon
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Apagar Contato</title>
    </head>
    <body>
        <h1>Apagar Contato</h1>
        <form action="FrontController?action=ApagarContato" method="post">
            Digite o ID do contato:
            <input type="text" name="textId"/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
