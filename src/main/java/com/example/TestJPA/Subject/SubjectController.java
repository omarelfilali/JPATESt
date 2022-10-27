package com.example.TestJPA.Subject;


import com.example.TestJPA.Student.Student;
import com.example.TestJPA.Student.StudentRepository;
import com.example.TestJPA.Teacher.Teacher;
import com.example.TestJPA.Teacher.TeacherReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Subjects")
public class SubjectController {

    @Autowired
    SubjectReposetory subjectReposetory;
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherReposetory teacherReposetory;
    @GetMapping
    List<Subject> getSubjects(){
        return subjectReposetory.findAll();
    }

    @PostMapping
    Subject saveSubject(@RequestBody Subject s){
        return subjectReposetory.save(s);
    }

    @PutMapping("/{subjectid}/Student/{studentid}")
    Subject enrollStudentToSubject(@PathVariable Long subjectid , @PathVariable Long studentid){
        Subject s = subjectReposetory.findById(subjectid).get();
        Student st= studentRepository.findById(studentid).get();

        s.enrollStudent(st);

        return s ;

    }

    @PutMapping("/{subjectid}/Teacher/{Teacherid}")
    Subject assignTeacher(@PathVariable Long subjectid , @PathVariable Long Teacherid){
        Subject s = subjectReposetory.findById(subjectid).get();
        Teacher st= teacherReposetory.findById(Teacherid).get();

        s.assignTeacher(st);

        return s ;

    }
}
