package ru.curs.principiOop.inheritance;

public class Birds {
    private String name;
    private Wings wings;

    /*public Birds(String name, Wings wings) {
        this.name = name;
        this.wings = wings;
    }*/

    public void walk(){
        System.out.println("Я птица я гуляю");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
