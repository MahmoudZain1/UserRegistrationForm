<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
  <h2>Registration Information</h2>
    <table border="1">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>First Name</td>
            <td><%= request.getAttribute("fname") %></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><%= request.getAttribute("lname") %></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><%= request.getAttribute("email") %></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><%= request.getAttribute("password") %></td>
        </tr>
        <tr>
            <td>City</td>
            <td><%= request.getAttribute("city") %></td>
        </tr>
        <tr>
            <td>CV File</td>
            <td><%= request.getAttribute("fileName") %></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><%= request.getAttribute("age") %></td>
        </tr>
        <tr>
            <td>Hear About Us</td>
            <td><%= request.getAttribute("hearAboutUs") %></td>
        </tr>
    </table>
       
</body>
</html>