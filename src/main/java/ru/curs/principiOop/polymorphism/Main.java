package ru.curs.principiOop.polymorphism;

public class Main {
    public static void main(String[] args) {
        /*Ostrich ostrich = new Ostrich();
        Crow crow = new Crow();

        ostrich.setName("Страус");

        ostrich.walk();
        ostrich.walk();*/

        Birds ostrich2 = new Ostrich();
        Birds cow = new Crow();

        Test test = new Test();
        test.foo(ostrich2);
        test.foo(cow);
    }
}
