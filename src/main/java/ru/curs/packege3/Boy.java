package ru.curs.packege3;

public class Boy implements Player, Stydy {
    @Override
    public void play() {
        System.out.println("Играет рок музыка");
    }

    @Override
    public void read() {
        System.out.println("Мальчик читает");
    }

    public void methodOne(){
        System.out.println("Метод не из интерфейса");
    }
}
