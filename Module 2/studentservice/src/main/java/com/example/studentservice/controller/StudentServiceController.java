package com.example.studentservice.controller;


import com.example.studentservice.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentServiceController {

    private List<Student> studentList;

    public StudentServiceController() {
        studentList = new ArrayList<>();
        studentList.add(new Student("Andy", 20));
        studentList.add(new Student("Jose", 8));
        studentList.add(new Student("Kevin", 21));
        studentList.add(new Student("Lloyd", 10));

    }

    @RequestMapping(value="/students", method= RequestMethod.GET)
    public List<Student> getStudents() {
        return studentList;
    }

//    @RequestMapping(value="/students/{theIndexOfTheStudent}", method=RequestMethod.GET)
//    public Student getStudentByIndexInList(@PathVariable int theIndexOfTheStudent) {
//        return studentList.get(theIndexOfTheStudent);
//    }

    @RequestMapping(value="/students/{studentName}", method=RequestMethod.GET)
    public Student getStudentByName(@PathVariable String studentName) {

//        List<Student> matchingStudentList = studentList.stream()
//                .filter(st -> st.getName().equals(studentName))
//                .collect(Collectors.toList());
//        return matchingStudentList.get(0);
//        OR  a more formal way is as illustrated bellow
        for (Student thisStudent : studentList) {
            if(thisStudent.getName().equals(studentName)) {
                return thisStudent;
            }
        }
        return null;

    }

}
