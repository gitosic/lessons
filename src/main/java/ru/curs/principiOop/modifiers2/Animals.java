package ru.curs.principiOop.modifiers2;

public class Animals {
    public String region = "деволтовый какой-то";

    private int age;
    private String name;

    /**
     * Конструктор Animals
     *
     * @param age  возраст
     * @param name кличка животного
     */
    public Animals(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
