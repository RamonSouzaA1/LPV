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
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    </head>
    <body>
        <h1>Consultar Departamentos</h1>
        <table>
            <tr>
                <td>id</td>
                <td>Nome</td>
                <td>Id Contato</td>
            </tr>
            <c:forEach items="${departamentos}" var="departamento">
            <tr>
                <td><c:out value="${departamento.id}"></c:out></td>
                <td><c:out value="${departamento.nome}"></c:out></td>
                <td><c:out value="${departamento.idContato}"></c:out></td>
            </tr>
            </c:forEach>
        </table>

        <button onclick="window.location.href='departamentoAdicionar.jsp'">Adicionar Departamento</button>
        <button onclick="window.location.href='departamentoApagar.jsp'">Apagar Departamento</button>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    </body>
</html>
