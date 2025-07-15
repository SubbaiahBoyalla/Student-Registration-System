@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String dob = request.getParameter("dob");
        String department = request.getParameter("department");
        String phone = request.getParameter("phone");

        Student student = new Student(name, email, dob, department, phone);
        StudentDAO.insertStudent(student);

        response.sendRedirect("ListStudents.jsp");
    }
}
