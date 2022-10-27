package com.example.TestJPA.Teacher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Teachers")
public class TeacherController {

    @Autowired
    TeacherReposetory teacherReposetory ;

    @GetMapping
    List<Teacher> getTeachers(){
        return teacherReposetory.findAll();
    }


    @PostMapping
    Teacher saveTeacher(@RequestBody Teacher t){
        return teacherReposetory.save(t);
    }

}
