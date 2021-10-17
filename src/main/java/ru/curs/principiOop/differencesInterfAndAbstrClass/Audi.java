package ru.curs.principiOop.differencesInterfAndAbstrClass;

public class Audi implements Car {
    @Override
    public void foo1() {
        System.out.println("Audi");
    }

    public void getNameCar(){
        System.out.println("Машина ауди");
    }
}
