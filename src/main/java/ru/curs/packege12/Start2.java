package ru.curs.packege12;

import java.util.LinkedHashMap;
import java.util.Map;

public class Start2 {
    public static void main(String[] args) {
        Map<Integer, String> map2 = new LinkedHashMap<>(16,1.1f, true);
        map2.put(3,"три");
        map2.put(1,"один");
        map2.put(6,"шесть");
        map2.get(1);
        map2.get(1);
        map2.get(1);
        map2.get(6);
        map2.get(6);
        map2.get(6);
        map2.get(6);
        map2.get(6);
        System.out.println(map2);
        //{16=16, 15=15, 14=14, 13=13, 12=12, 11=11, 10=10, 9=9, 8=8, 7=7, 6=6, 5=5, 4=4, 3=3, 2=2, 1=1, 0=0}
        //{16=16, 15=15, 14=14, 13=13, 12=12, 11=11, 10=10, 8=8, 7=7, 5=5, 4=4, 2=2, 1=1, 0=0, 3=3, 6=6, 9=9}
    }
}
