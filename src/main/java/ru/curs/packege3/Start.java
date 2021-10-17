package ru.curs.packege3;

public class Start extends Game {
    public static void main(String[] args) {
        Boy ivan = new Boy();
        Girl alenushka = new Girl();

        ivan.play();
        alenushka.play();

        Player unit = ivan;
        unit.play();

        ivan.methodOne();

        System.out.println(111);
        start(ivan);
        System.out.println(222);
        ivan.read();
        School school = new School();
        school.start(ivan);

    }
}
