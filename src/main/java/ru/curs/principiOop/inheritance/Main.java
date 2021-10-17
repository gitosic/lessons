package ru.curs.principiOop.inheritance;

public class Main {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        Crow crow = new Crow();

        ostrich.setName("Страус");

        Birds ostrich2 = new Ostrich();
        ostrich2.getName();
        ostrich.hideHead();//а тут есть hideHead поскольку ссылаемся напрямую на класс Ostrich
    }
}
