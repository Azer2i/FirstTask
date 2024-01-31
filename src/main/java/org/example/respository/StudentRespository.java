package org.example.respository;

import org.example.entitiy.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRespository {

    private static final Map<Long, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);

    }

    public Student getStudentById(Long id) {
        return students.get(id);
    }



}
