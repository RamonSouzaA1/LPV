<%-- 
    Document   : departamentoConsulta
    Created on : 09/04/2018, 21:42:18
    Author     : Ramon
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Consultar Departamentos</title>
    </head>
    <body>
        <h1>Consultar Departamentos</h1>
        <table>
            <tr>
                <td>id</td>
                <td>Nome</td>
            </tr>
            <c:forEach items="${departamentos}" var="departamento">
            <tr>
                <td><c:out value="${departamento.id}"></c:out></td>
                <td><c:out value="${departamento.nome}"></c:out></td>
            </tr>
            </c:forEach>
        </table>

        <a href="departamentoAdicionar.jsp">Adicionar departamento</a>
        <a href="departamentoApagar.jsp">Apagar departamento</a>
    </body>
</html>
