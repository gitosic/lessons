package ru.curs.packege1;

public class Bicycle implements Interf {

    public void getTextBiBi(){
        System.out.println("Метод getTextBiBi из класса Bicycle");
    }

    @Override
    public void getInfoCar() {
        System.out.println("Метод из класса Bicycle");
    }
}
