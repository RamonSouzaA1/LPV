<%-- 
    Document   : departamentoMenu
    Created on : 09/04/2018, 21:41:27
    Author     : Ramon
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Departamento Menu</title>
    </head>
    <body>
        <a href="departamentoAdicionar.jsp">Adicionar Departamento</a>
        <form action="FrontController?action=LerDepartamento" method="post">
            <button>Consultar Departamentos </button>
        </form>
        <a href="departamentoApagar.jsp">Apagar Departamento</a>
    </body>
</html>
