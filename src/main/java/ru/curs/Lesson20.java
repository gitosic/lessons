package ru.curs;

public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Ben", 12);

    }
}

class Human{
    private String name;
    private int age;

    public Human(){
        System.out.println("Hi from first constructor");
    }

    public Human(String name){
        System.out.println("Hi " + name + " from second constructor");
        this.name = name;
    }

    public Human(String name, int age){
        System.out.println("Hi " + name + ", where age " + age + " from third constructor");
        this.name = name;
        this.age = age;
    }
}
