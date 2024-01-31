package org.example.mapper;

import org.example.dto.request.AddStudentRequest;
import org.example.dto.request.AddTeacherRequest;
import org.example.entitiy.Student;
import org.example.entitiy.Teacher;

public class TeacherMapper {
    public Teacher toTeacher(AddTeacherRequest addTeacherRequest){
        Teacher teacher = new Teacher();
        teacher.setName(addTeacherRequest.getName());
        teacher.setSurname(addTeacherRequest.getSurname());
        teacher.setSalary(addTeacherRequest.getSalary());
        return  teacher;


    }
}
