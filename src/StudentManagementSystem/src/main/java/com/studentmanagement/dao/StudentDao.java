package StudentManagementSystem.src.main.java.com.studentmanagement.dao;

import StudentManagementSystem.src.main.java.com.studentmanagement.model.Student;

import java.util.List;

public interface StudentDao {
    void addStudent(Student student);
    void updateStudent(String id, Student newStudent);
    void deleteStudent(String id);
    Student getStudent(String id);
    boolean existStudent(String id);

    List<Student> getStudentList();
}
