package ru.curs.principiOop.polymorphism;

public class Crow extends Birds {

    public void fly(){
        System.out.println("I crow and i fly");
    }

    @Override
    public void walk() {
        System.out.println("I Crow");
    }
}
