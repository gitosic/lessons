package ru.curs.principiOop.abstraction;

public class Main {
    public static void main(String[] args) {
        Weapon weapon = new AK47();
        AK47 ak47 = new AK47();

        weapon.shoot();
        weapon.shoot2();
        ak47.shoot();
    }
}
