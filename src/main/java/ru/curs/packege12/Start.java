package ru.curs.packege12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(null);
        arrayList.add(1);
        arrayList.add(null);
        System.out.println(arrayList);

        List linkedList = new LinkedList();
        linkedList.add(null);
        linkedList.add(3);
        linkedList.add(null);
        System.out.println(linkedList);
    }
}
