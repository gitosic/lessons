package ru.curs.methods;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Verifications verifications = new Verifications();
//        verifications.checkOne("Some text1", "text2");

        int[] myArray; // объявление массива
        myArray = new int[10];// создание, то есть, выделение памяти для массива на 10 элементов типа int
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);

        Contact contact = new Contact("Ben", 18);
        List<Object> list = new LinkedList<Object>();
        list.add(contact);
        System.out.println(list.get(0));
    }
}
