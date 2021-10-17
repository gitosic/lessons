package ru.curs.packege2;

public class Building implements Information {

    public Building(){
    }

    @Override
    public void getInfoCity() {
        System.out.println("Это из класса Building");
    }
}
