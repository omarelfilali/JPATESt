package com.example.TestJPA.Student;

import com.example.TestJPA.Subject.Subject;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "EnrolledStudents")
    Set<Subject> subjects=new HashSet<>();

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Set<Subject> getSubjects() {
        return subjects;
    }
}
