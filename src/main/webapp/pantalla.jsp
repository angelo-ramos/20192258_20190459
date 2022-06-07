<%--
  Created by IntelliJ IDEA.
  User: Luis
  Date: 06/06/2022
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Beans.Actores" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    ArrayList<Actores> listaActores =  (ArrayList<Actores>) request.getAttribute("listaActores");
%>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<table class="table table-striped table-bordered">
    <thead>
    <tr class ="table-primary">
        <th scope="col"><center>Id</center></th>
        <th scope="col"><center>Nombre</center></th>
        <th scope="col"><center>NºCategorías</center></th>
        <th scope="col"><center>NºPelículas</center></th>
    </tr>
    </thead>
    <tbody>
    <%for(Actores actor: listaActores){%>
    <tr>
        <th scope="row" style="text-align:right"><%=actor.getIdActor()%></th>
        <td><%=actor.getNombreActor()%>></td>
        <td><center><%=actor.getNumCategorias()%></center></td>
        <td><center><%=actor.getNumPeliculas()%></center></td>
    </tr>
    <%}%>

    </tbody>
</table>
</body>
</html>