package ru.curs.principiOop.differencesInterfAndAbstrClass;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Bmw();
        car1.foo1();

        Bmw car2 = new Bmw();
        car2.getNameCar();

        Cat cat1 = new Cat();
        cat1.getSound();
        Animals animals = new Cat();
        animals.getSound();
        animals.getSound();

    }
}
