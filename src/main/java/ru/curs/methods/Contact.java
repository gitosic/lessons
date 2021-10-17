package ru.curs.methods;

public class Contact {
    private String name;
    private int age;

    public Contact(String name, int age){
        this.age = age;
        this.name = name;
    }

    public final String foo1(String s){
        return s;
    }

    public String foo1(){
        return "Text123";
    }
}
