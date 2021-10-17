package ru.curs.principiOop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        //System.out.println(encapsulation.a);
        //System.out.println(encapsulation.b);
        System.out.println(encapsulation.showInfo());
        System.out.println("get A " + encapsulation.getA());
        encapsulation.setA(3);
        System.out.println("get A " + encapsulation.getA());
    }
}
