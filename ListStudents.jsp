<%@ page import="java.util.*, model.Student, dao.StudentDAO" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
    <h2>Registered Students</h2>
    <table border="1">
        <tr>
            <th>ID</th><th>Name</th><th>Email</th><th>DOB</th><th>Department</th><th>Phone</th>
        </tr>
        <%
            List<Student> students = StudentDAO.getAllStudents();
            for(Student s : students) {
        %>
        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getName() %></td>
            <td><%= s.getEmail() %></td>
            <td><%= s.getDob() %></td>
            <td><%= s.getDepartment() %></td>
            <td><%= s.getPhone() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
