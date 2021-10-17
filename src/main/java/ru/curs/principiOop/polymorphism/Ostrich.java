package ru.curs.principiOop.polymorphism;

public class Ostrich extends Birds {

    public void hideHead(){
        System.out.println("I ostrich and i scared");
    }

    @Override
    public void walk() {
        //super.walk();
        System.out.println("Eee baby");
    }

    /*public void walk(String str){
        System.out.println("Ho-ho-ho " + str);
    }

    public void walk(){
        System.out.println("Ho-ho-ho class Ostrich extends Birds");
    }*/
}
