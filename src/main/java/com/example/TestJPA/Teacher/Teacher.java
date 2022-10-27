package com.example.TestJPA.Teacher;


import com.example.TestJPA.Subject.Subject;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;



    @OneToMany(mappedBy = "teacher")
    Set<Subject> subjects = new HashSet<>();



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setName(String name) {
        this.name = name;
    }
}
