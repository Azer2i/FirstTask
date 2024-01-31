package org.example.controller;

import org.example.dto.request.AddStudentRequest;
import org.example.entitiy.Student;
import org.example.service.StudentService;

public class StudentController {

    private final StudentService studentService = new StudentService();



    public void addStudent(AddStudentRequest request){
        studentService.addStudent(request);

    }
    public Student getStudent(){
         return studentService.getStudent0();
    }
}
