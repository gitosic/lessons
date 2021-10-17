package ru.curs.packege1;

public class Main extends Bicycle {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Audi";
        c1.mileage = 205000;
        System.out.println(c1.model);
        System.out.println(c1.mileage);
        System.out.println(c1.age);
        c1.getInfoCar();

        Car c2 = new Car(2,"tesla");
        System.out.println(c2.age + " " + c2.model);

        Interf in1 = new Car();
        Interf in2 = new Bicycle();
        in1.getInfoCar();
        in2.getInfoCar();
        Bicycle b1 = new Bicycle();
        b1.getTextBiBi();

    }
}
