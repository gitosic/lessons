package ru.curs.principiOop.abstraction;

public abstract class Weapon {

    private String name;

    public abstract void shoot();
    public abstract void shoot2();
    public void show(){
        System.out.println("Show text");
    };
}
