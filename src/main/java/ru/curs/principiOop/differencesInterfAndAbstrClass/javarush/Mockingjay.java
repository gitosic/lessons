package ru.curs.principiOop.differencesInterfAndAbstrClass.javarush;

public class Mockingjay extends Bird {

    @Override
    public void fly() {
        System.out.println("Лети, птичка!");
    }

    public static void main(String[] args) {

        Mockingjay someBird = new Mockingjay();
        someBird.setAge(19);
        System.out.println(someBird.getAge());
    }
}
