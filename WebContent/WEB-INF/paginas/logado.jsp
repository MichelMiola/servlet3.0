<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>logado</title>
</head>
<body>

<c:if test="">
	
</c:if>

<c:choose>
    <c:when test="${empty usuarioLogado}">
    	Usu�rio ou senha inv�lida
    </c:when>
    <c:otherwise>
     	Usu�rio logado: ${usuarioLogado.email}
    </c:otherwise>
</c:choose>

</body>
</html>