package ru.curs.examples1;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("Hello " + name + " возраста " + age);
    }

    public Person(String personName){
        name = personName;
    }

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void print(){
        System.out.println("Функция принт !!!");
    }
}
