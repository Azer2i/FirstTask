package org.example.controller;

import org.example.dto.request.AddTeacherRequest;
import org.example.entitiy.Student;
import org.example.entitiy.Teacher;
import org.example.service.StudentService;
import org.example.service.TeacherService;

public class TeacherController {
    private final TeacherService teacherService = new TeacherService();

    public void addTeacher(AddTeacherRequest request){

        teacherService.addTeacher(request);
    }
    public Teacher getTeacher(){
        return teacherService.getTeacher0();
    }



}
