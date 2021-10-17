package ru.curs.principiOop.differencesInterfAndAbstrClass;

public class Bmw implements Car {
    @Override
    public void foo1() {
        System.out.println("БМВ");
    }

    public void getNameCar(){
        System.out.println("Машина бмв");
    }
}
