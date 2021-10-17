package ru.curs.packege6;

public class Children implements Studying {
    //имя, фамилия, возраст, текущий уровень знаний
    String name;
    String surname;
    int age;
    String level;

    public Children(String name, String surname, int age, String level) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.level = level;
    }

    public void methodChildren(){
        System.out.println("Метод только класса Children");
    }

    @Override
    public void comeToSchool() {
        System.out.println("Дети приходят в шкову в 12 часов");
    }

    @Override
    public void doWork() {
        System.out.println("Дети делают работу");
    }

    @Override
    public void getInfo(String name, String surname, int age, String level) {
        System.out.println(name + surname + age + level);
    }
}
