package ru.curs.packege5;

public class Main {
    public static void main(String[] args) {
        ActionsMonsterTruck simpleCar = new Car();
        simpleCar.getFire();
        ActionsMonsterTruck monsterTruck = new MonsterCar();


        Car car1 = new Car();
        car1.openDoors();
        car1.closeDoors();

        System.out.println(111);
        myMethod(simpleCar);
        myMethod(monsterTruck);
        System.out.println(222);

    }

    public static void myMethod(ActionsMonsterTruck actionsMonsterTruck){
        actionsMonsterTruck.getFire();
    }
}
