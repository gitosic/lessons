package ru.curs.packege7;

public class Cat {
    private int age;
    private String name;

    public String getInfo(){
        String deskr = name + " " + age;
        return deskr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
