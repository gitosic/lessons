package ru.curs.packege5;

public class Car implements ActionsMonsterTruck {
    int year;
    int weight;
    String color;

    void openDoors(){
        System.out.println("Открываются двери");
    };
    void closeDoors(){
        System.out.println("Закрываются двери");
    };

    @Override
    public void jump() {
        System.out.println("Подпрыгивает только на кочках");
    }

    @Override
    public void getFire() {
        System.out.println("Горит, если поднести спичку к баку");
    }



}
