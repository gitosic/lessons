package ru.curs.packege6;

public class Men implements Studying, Moreintf {
    //имя, фамилия, возраст, текущий уровень знаний
    String name;
    String surname;
    int age;
    String level;

    public Men(String name, String surname, int age, String level) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.level = level;
    }

    @Override
    public void comeToSchool() {
        System.out.println("Мужчины приходят в шкову в 12 часов");
    }

    @Override
    public void doWork() {
        System.out.println("Мужчины делают работу");
    }

    @Override
    public void getInfo(String name, String surname, int age, String level) {

    }

    @Override
    public int GetInt(int i) {
        return i;
    }
}
