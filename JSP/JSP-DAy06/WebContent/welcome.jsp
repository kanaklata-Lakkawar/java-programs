<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--Page Directive --%>

<%--1. import --%>
<%@ page import="java.util.Date" %>

Today is <%= new Date()%>
<%--2. contentType 
<%@ page contentType="application/msword" %>
Today is <%= new Date()%>
--%>

<%--3. extends --%>
<%--4. info --%>

<%@ page info="composed by Sonoo jaiswal" %>

<%--5. Buffer --%>
<%@ page buffer="16kb" %>

<%--6. language=java --%>

<%--7. isELignored --%>
<%@ page isELignored="true" %>

<%--8. isThreadSafe --%>
<%@ page isThreadSafe="true" %>

<%--9. Error page --%>

<%--10. isErrorPage --%>
</body>
</html>