package ru.curs.packege4;

public class Boy implements Player, Study {
    @Override
    public void play() {
        System.out.println("Мальчик запускает игру");
    }

    void go(){
        System.out.println("Мальчик гуляет");
    }

    @Override
    public void write() {
        System.out.println("Мальчик пишет");
    }

    @Override
    public void read() {
        System.out.println("Мальчик читает");
    }
}
