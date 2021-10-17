package ru.curs.packege1;

public class Car implements Interf{
    int age;
    int mileage;
    String model;

    public Car(){

    }

    public Car(int age, String model){
        this.age = age;
        this.model = model;
    }

    public void getInfoCar(){
        System.out.println("Метод из класса Car");
    }
}
