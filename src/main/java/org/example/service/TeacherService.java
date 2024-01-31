package org.example.service;

import org.example.dto.request.AddTeacherRequest;
import org.example.entitiy.Student;
import org.example.entitiy.Teacher;
import org.example.mapper.StudentMapper;
import org.example.mapper.TeacherMapper;
import org.example.respository.TeacherRespository;

public class TeacherService {
    public  final TeacherRespository teacherRespository = new TeacherRespository();
    private final TeacherMapper teacherMapper = new TeacherMapper();


    public void addTeacher(AddTeacherRequest request){
        Teacher teacher = teacherMapper.toTeacher(request);
        teacherRespository.addTeacher(teacher);


    }
    public Teacher getTeacher0(){
        return teacherRespository.getSalary(0);

    }
}
