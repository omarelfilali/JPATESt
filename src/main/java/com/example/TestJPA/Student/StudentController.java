package com.example.TestJPA.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;


    @GetMapping()
    public List<Student> getStudents(){
        return studentRepository.findAll();

    }

    @PostMapping
    Student saveStudent(@RequestBody Student s){
        return studentRepository.save(s);

    }
}
