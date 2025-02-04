package org.example;

public class Person {
    String name;
    String gender;
    int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name + " a " + age + " years old " + gender + ".");
    }
}
