package ru.curs.examples1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ket");
        Person person2 = new Person();
        person2.name = "Ben";

//        person1.name = "Ben";
//        person1.age = 20;
//        System.out.println(person1.age + " " + person1.name);

//        System.out.println(person1.toString());

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person1.name);
        System.out.println(person2.name);

        //person1.print();
    }
}
