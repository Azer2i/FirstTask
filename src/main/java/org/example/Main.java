package org.example;


import org.example.controller.StudentController;
import org.example.controller.TeacherController;
import org.example.dto.request.AddStudentRequest;
import org.example.dto.request.AddTeacherRequest;
import org.example.entitiy.Human;
import org.example.entitiy.Student;
import org.example.entitiy.Teacher;
import org.example.util.RequestBuilderUtil;

import java.util.Scanner;

public class Main {

    public static final StudentController studentController = new StudentController();
    public static final TeacherController teacherController = new TeacherController();
    public static void main(String[] args) {
        while (true){
            menuprinter();
        }



    }

    private static void menuprinter(){
        System.out.println("""
                Choose your process
                1.  add student
                2. get student
                3.add teacher
                4.get teacher
                
                """);

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                addStudent();
                break;
            default:
                defaultSwitchCase();


        }
        switch (choice){
            case 1:
                addTeacher();
                break;
            default:
                defaultSwitchCase();
        }


    }
    private static void defaultSwitchCase(){
        System.out.println("your chousise is not  Ok for us .please chousie again ");
        menuprinter();
    }
    private static void addStudent(){
        AddStudentRequest addStudentRequest = RequestBuilderUtil.addStudent();
        studentController.addStudent(addStudentRequest);


    }
    public static void getStudent(){
        Student student = studentController.getStudent();
        System.out.println(student.toString());
    }
    public static void getTeacher(){
        Teacher teacher = teacherController.getTeacher();
        System.out.println(teacher.toString());
    }


    private  static void addTeacher(){
        AddTeacherRequest addTeacherRequest = RequestBuilderUtil.addTeacher();
        teacherController.addTeacher(addTeacherRequest);
    }


}