package StudentManagementSystem.src.main.java.com.studentmanagement.dao.impl;

import StudentManagementSystem.src.main.java.com.studentmanagement.dao.StudentDao;
import StudentManagementSystem.src.main.java.com.studentmanagement.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private List<Student> studentList;

    public StudentDaoImpl() {
        studentList = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public void updateStudent(String id, Student newStudent){
        int index = findIndex(id);
        studentList.set(index,newStudent);
    }

    @Override
    public void deleteStudent(String id){
        int index = findIndex(id);
        studentList.remove(index);
    }

    @Override
    public Student getStudent(String id){
        int index = findIndex(id);
        return studentList.get(index);
    }

    private int findIndex(String id){
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public boolean existStudent(String id){
        return findIndex(id) != -1;
    }

    @Override
    public List<Student> getStudentList(){
        return studentList;
    }
}
