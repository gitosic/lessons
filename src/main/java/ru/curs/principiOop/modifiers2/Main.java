package ru.curs.principiOop.modifiers2;

public class Main {
    public static void main(String[] args) {
        Animals a1 = new Animals(5, "Шарик");
        System.out.println(a1.getName());

//        a1.setRegion("Russia");
        System.out.println(a1.region);

    }
}
