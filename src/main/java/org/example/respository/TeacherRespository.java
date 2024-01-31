package org.example.respository;

import org.example.entitiy.Student;
import org.example.entitiy.Teacher;

import java.util.HashMap;
import java.util.Map;

public class TeacherRespository {
    private static final Map<Integer, Teacher> teachers = new HashMap<>();

    public void addTeacher(Teacher teacher){
        teachers.put(teacher.getSalary(),teacher);


    }
    public Teacher getSalary(Integer salary){
        return teachers.get(salary);

    }

}
