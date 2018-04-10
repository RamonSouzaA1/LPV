<%-- 
    Document   : contatoMenu
    Created on : 09/04/2018, 21:32:43
    Author     : Ramon
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Contatos Menu</title>
    </head>
    <body>
        <a href="contatoAdicionar.jsp">Adicionar contato</a>
        <form action="FrontController?action=LerContato" method="post">
            <button>Consultar Contatos </button>
        </form>
        <a href="contatoApagar.jsp">Apagar contato</a>
    </body>
</html>
