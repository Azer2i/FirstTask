package org.example.service;

import org.example.dto.request.AddStudentRequest;
import org.example.entitiy.Student;
import org.example.mapper.StudentMapper;
import org.example.respository.StudentRespository;
import org.example.util.IdGeneratorUtil;

public class StudentService {
    private final StudentRespository studentRespository = new StudentRespository();
    private final StudentMapper studentMapper = new StudentMapper();
    public void addStudent(AddStudentRequest request){
        Student student = studentMapper.toStudent(request);
        student.setId(IdGeneratorUtil.getNewStudentId());
        studentRespository.addStudent(student);
    }


    public Student getStudent0(){
        return studentRespository.getStudentById(0L);

    }

}

