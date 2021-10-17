package ru.curs.principiOop.modifiers5.pac1;

public class Human {
    public String name;
    protected String secondName;
    protected String info = "777";

    protected void foo1(){
        System.out.println("111");
    }

    public Human(){
        this.name = "Иван";
        this.secondName = "Петров";
    }
}
