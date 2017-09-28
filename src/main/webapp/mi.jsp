<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="utf-8">
	<title>Mi primer aplicación Servlet/JSP</title>
</head>
<body>
	 <h2>Datos recibidos:</h2>
	 <p>${pers.nombre}</p>
	 <p>${pers.apellido}</p>
	 <p>${pers.pais}</p>
	 <p>${pers.correo}</p>
<%-- <c:forEach var="h" items="${lista}" varStatus="loop">
        <p> <i>${loop.index}: </i> <b>${h.nombre}</b>  ... ${h.apellido} ... ${h.email}</p>
</c:forEach>
--%>
</body>
</html>
