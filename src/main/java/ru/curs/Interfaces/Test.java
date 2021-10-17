package ru.curs.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        animal.sleep();
        person.sayHello();
        animal.showInfo();
        person.showInfo();

        Info info1 = new Animal(1);
        Info info2 = new Person("Ben");
        info1.showInfo();

        Car car = new Car(100);
    }
}
