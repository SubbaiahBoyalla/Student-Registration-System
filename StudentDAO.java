public class StudentDAO {
    public static void insertStudent(Student student) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO students(name, email, dob, department, phone) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getDob());
            ps.setString(4, student.getDepartment());
            ps.setString(5, student.getPhone());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
