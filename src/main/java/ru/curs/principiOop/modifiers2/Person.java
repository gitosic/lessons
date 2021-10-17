package ru.curs.principiOop.modifiers2;

public class Person {
    protected String nameProtected;
    String nameDefault = "Дефалтовый";
    public String namePublic = "Публичный";

//    public Person() {
//        this.nameProtected = "Bob";
//    }

    public Person() {
        nameProtected = "nameProtected";
    }
}
