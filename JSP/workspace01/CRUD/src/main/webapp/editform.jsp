<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
    <%@ page import="com.crudjsp.Dao.UserDao, com.crudjsp.user.User" %>
    <%
    String id = request.getParameter("id");
    User u = UserDao.getRecordById(Integer.parseInt(id));
    %>
    <h1>Edit Form</h1>
    <form action="edituser.jsp" method="post">
        <input type="hidden" name="id" value="<%= u.getId() %>" />
        <table>
            <tr><td>Id:</td><td><input type="text" name="id" value="<%= u.getId() %>" readonly /></td></tr>
            <tr><td>Name:</td><td><input type="text" name="name" value="<%= u.getName() %>" /></td></tr>
            <tr><td>Password:</td><td><input type="password" name="password" value="<%= u.getPassword() %>" /></td></tr>
            <tr><td>Email:</td><td><input type="email" name="email" value="<%= u.getEmail() %>" /></td></tr>
            <tr><td>City:</td><td>
                <select name="city">
                    <option value="Thanjavur" <%= "Thanjavur".equals(u.getCity()) ? "selected" : "" %>>Thanjavur</option>
                    <option value="Chennai" <%= "Chennai".equals(u.getCity()) ? "selected" : "" %>>Chennai</option>
                    <option value="Trichy" <%= "Trichy".equals(u.getCity()) ? "selected" : "" %>>Trichy</option>
                    <option value="Coimbatore" <%= "Coimbatore".equals(u.getCity()) ? "selected" : "" %>>Coimbatore</option>
                    <option value="Other" <%= "Other".equals(u.getCity()) ? "selected" : "" %>>Other</option>
                </select>
            </td></tr>
            <tr><td colspan="2"><input type="submit" value="Edit User" /></td></tr>
        </table>
    </form>
</body>
</html>
