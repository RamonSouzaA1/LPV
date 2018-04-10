<%-- 
    Document   : contatoAdicionar
    Created on : 09/04/2018, 21:28:04
    Author     : Ramon
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Cadastro de Contatos</title>
    </head>
    <body>
        <h1>Cadastro de Contatos</h1>
        <form action="FrontController?action=GravarContato" method="post">
            Entre com seu nome: 
            <input type="text" name="txtNome"/><br/>
            Entre com seu email: 
            <input type="text" name="txtEmail"/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
