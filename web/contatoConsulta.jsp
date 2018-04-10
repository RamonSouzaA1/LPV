<%-- 
    Document   : contatoConsulta
    Created on : 04/04/2018, 22:54:50
    Author     : Ramon
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Consultar Contatos</title>
    </head>
    <body>
        <h1>Consultar Contatos</h1>
        <table>
            <tr>
                <td>id</td>
                <td>Nome</td>
                <td>email</td>
            </tr>
            <c:forEach items="${contatos}" var="contato">
            <tr>
                <td><c:out value="${contato.id}"></c:out></td>
                <td><c:out value="${contato.nome}"></c:out></td>
                <td><c:out value="${contato.email}"></c:out></td>
            </tr>
            </c:forEach>
        </table>

        <a href="contatoAdicionar.jsp">Adicionar contato</a>
        <a href="contatoApagar.jsp">Apagar contato</a>
    </body>
</html>
