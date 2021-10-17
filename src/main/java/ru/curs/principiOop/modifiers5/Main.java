package ru.curs.principiOop.modifiers5;

import ru.curs.principiOop.modifiers5.pac1.Human;

public class Main extends Human {
    public static void main(String[] args) {
        Human men1 = new Human();
        Main men2 = new Main();
        System.out.println(men1.name);
        //System.out.println(men1.secondName);//так не могу

        System.out.println(men2.info);
        men2.foo1();


    }
}
