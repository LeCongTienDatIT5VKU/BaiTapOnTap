package JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import DAO.StudentDAO;
import Universitym.Student;

public class Main {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:sqlserver://localhost:1433;databaseName=universityms;encrypt=false";
        String jdbcUsername = "sa";
        String jdbcPassword = "200326";

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)) {
            StudentDAO studentDAO = new StudentDAO(connection);

            Student newStudent = new Student("Nguyen Van A", 20, "annv@vku.udn.vn", 3.5f);
            studentDAO.insertStudent(newStudent);
            System.out.println("Đã thêm sinh viên mới!");

            System.out.println("Danh sách sinh viên:");
            for (Student student : studentDAO.selectAllStudents()) {
                System.out.println(student.getId() + " - " + student.getName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
