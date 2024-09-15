<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
    <%@ page import="com.crudjsp.Dao.UserDao" %>
    <jsp:useBean id="u" class="com.crudjsp.user.User"></jsp:useBean>
    <jsp:setProperty property="*" name="u"/>
    <%
    int i = UserDao.update(u);
    if (i > 0) {
        response.sendRedirect("viewusers.jsp");
    } else {
        out.println("Failed to update user.");
    }
    %>
</body>
</html>
