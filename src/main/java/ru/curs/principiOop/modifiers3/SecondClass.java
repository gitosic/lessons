package ru.curs.principiOop.modifiers3;

import ru.curs.principiOop.modifiers2.Animals;
import ru.curs.principiOop.modifiers2.Person;

public class SecondClass extends Person {
    public static void main(String[] args) {
        Animals a1 = new Animals(1,"бобик");

        /*Person p1 = new Person();
        System.out.println(p1.namePublic);*/

        Person p2 = new Person();
        System.out.println(p2.namePublic);
    }
}
