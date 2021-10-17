package ru.curs.packege14;

public class Main {
    public static void main(String[] args) {
        System.out.println(myMethod(2, "Test"));
    }

    public static String myMethod(Integer i, String s){
        String text = i + s;
        return text;
    }



}
