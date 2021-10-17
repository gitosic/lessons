package ru.curs.packege8;

public class Main {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        System.out.println(encapsulation.showResult());
        System.out.println(encapsulation.getA());
        System.out.println(encapsulation.getB());
        encapsulation.setA(2);
        System.out.println(encapsulation.getA());
    }
}
