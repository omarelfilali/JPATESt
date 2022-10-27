package com.example.TestJPA.Subject;


import com.example.TestJPA.Student.Student;
import com.example.TestJPA.Teacher.Teacher;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @ManyToMany
    @JoinTable(name = "students_enrolled",
    joinColumns = @JoinColumn(name = "subject_id"),
    inverseJoinColumns = @JoinColumn(name="student_id"))
    Set<Student> EnrolledStudents=new HashSet<>();



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id",referencedColumnName = "id")
    private Teacher teacher ;

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public Set<Student> getEnrolledStudents() {
        return EnrolledStudents;
    }

    public void enrollStudent(Student s){
        this.EnrolledStudents.add(s);
    }

    public void assignTeacher(Teacher st) {
        this.teacher=st;
    }
}
