package ru.curs.Interfaces;

public class Car {
    int price;


    public Car(int price) {
        this.price = price;
    }

    public Car(){
        System.out.println("Вызов конструктора в классе 'Car'");
    }
}
