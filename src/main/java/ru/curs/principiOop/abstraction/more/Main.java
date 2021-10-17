package ru.curs.principiOop.abstraction.more;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Bmw();
        Car car2 = new Audi();
        car1.drive();
        car2.drive();
    }
}
