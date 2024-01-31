package org.example.mapper;

import org.example.dto.request.AddStudentRequest;
import org.example.entitiy.Student;
import org.example.util.DateUtil;

public class StudentMapper {

    public Student toStudent(AddStudentRequest addStudentRequest){
        Student student = new Student();
        student.setName(addStudentRequest.getName());
        student.setSurname(addStudentRequest.getSurname());
        student.setBirthday(DateUtil.toLocalDate(addStudentRequest.getBirthday() ));
        return student;

    }


}
