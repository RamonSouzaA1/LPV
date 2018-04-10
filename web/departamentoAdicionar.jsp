<%-- 
    Document   : departamentoAdicionar
    Created on : 09/04/2018, 21:41:49
    Author     : Ramon
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Cadastro de Departamento</title>
    </head>
    <body>
        <h1>Cadastro de Departamento</h1>
        <form action="FrontController?action=GravarDepartamento" method="post">
            Entre com o nome do departamento: 
            <input type="text" name="txtNome"/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
