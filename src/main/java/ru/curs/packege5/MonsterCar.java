package ru.curs.packege5;

public class MonsterCar implements ActionsMonsterTruck {
    @Override
    public void jump() {
        System.out.println("Прыгает при нажатии кнопки");
    }

    @Override
    public void getFire() {
        System.out.println("Горит при нажатии кнопки");
    }
}
