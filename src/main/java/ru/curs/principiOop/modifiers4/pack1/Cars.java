package ru.curs.principiOop.modifiers4.pack1;

public class Cars {
    public String name;
    protected String name2;

    public Cars() {
        this.name2 = "Bob";
    }

    protected int age;

    public void getInfo(){
        System.out.println("Получить инфу 1");
    }

    protected void getMainInfo(){
        System.out.println("Получить инфу 1");
    }


}
