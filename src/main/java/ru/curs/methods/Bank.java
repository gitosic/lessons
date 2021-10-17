package ru.curs.methods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        System.out.println(foo1(2,"Text"));

        List<String> list = new ArrayList<String>();
        List<String> Linkedlist = new LinkedList<String>();
        list.add("Test1");
        list.add(1,"Test2");



        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static String foo1(Integer integer, String string){
        String test = integer + " " + string;
        return test;
    }

    //Напиши тест, который проверяет входящее сеообщение на предмет наличия определенного текста внутри себе


}
