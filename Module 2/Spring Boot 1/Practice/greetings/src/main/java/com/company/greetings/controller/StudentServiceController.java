package com.company.greetings.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.company.greetings.models.Student;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

@RestController

public class StudentServiceController {

    // This data would come from your db in real life.
    private static List<Student> studentList = new ArrayList<>(Arrays.asList(
            new Student("Sam"),
            new Student("Lisa"),
            new Student("Ming"),
            new Student("Lynda")
    ));

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getStudents() {
        return studentList;
    }

    @RequestMapping(value = "/students/{index}", method = RequestMethod.GET)
    public Student getStudentByIndex(@PathVariable int index) {
        return studentList.get(index);
    }
}
