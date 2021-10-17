package ru.curs.principiOop.inheritance.inheritance2;

public class Main {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        Crow crow = new Crow();

        ostrich.hideHead();
        crow.fly();
        crow.walk();
    }
}
