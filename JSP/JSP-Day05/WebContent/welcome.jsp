<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--Page Context --%>

<%
String name=request.getParameter("uname");
//, PageContext.SESSION_SCOPE
pageContext.setAttribute("user", name, PageContext.SESSION_SCOPE);

%>

welcome  <%=name%>

<h1>${param.uname}</h1>

<a href="welcome2.jsp">go to welcome2</a>

</body>
</html>