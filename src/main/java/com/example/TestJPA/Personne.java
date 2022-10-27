package com.example.TestJPA;

public class Personne {

     int age;
     String name ;

    public Personne(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
