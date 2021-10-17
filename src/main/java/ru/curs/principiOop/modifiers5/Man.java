package ru.curs.principiOop.modifiers5;

import ru.curs.principiOop.modifiers5.pac1.Human;

public class Man extends Human {

    /*public void foo(){
        secondName = "Petr";
    }*/

    public static void main(String[] args) {
        Man m1 = new Man();
        System.out.println(m1.secondName);

        Human human = new Human();
        System.out.println(human.name);
    }



}
