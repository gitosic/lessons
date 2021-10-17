package ru.curs.packege10ArLiAndMaps;

import java.util.*;

public class ArLiAndMaps {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(3);//[][][]
        list.add("first");//[first][][]
        list.add("second");//[first][second][]
        list.add("third");//[first][second][third]
        list.add(1,"string");//[first][string][second][third][][][][][][]//если меньше минимального, то делается массив из 10 ячеек
        System.out.println(list.size());
        list.remove(2);//[first][string][third][][][][][][][]
        System.out.println(list.size());

        List<String> stringList = new LinkedList<>();
        stringList.add("first");//{header} -> <- ["first"]
        stringList.add("second");//{header} -> <- ["first"] -> <- ["second"]
        stringList.add("third");//{header} -> <- ["first"] -> <- ["second"]-> <- ["third"]
        stringList.add(1, "string");//{header} -> <- ["first"] -> <- ["string"] -> <- ["second"]-> <- ["third"]
        stringList.remove(2);//{header} -> <- ["first"] -> <- ["string"] -> <- ["third"]
//                                                                            ["second"]
//        Iterator<String> iterator = stringList.iterator();

 /*       Map<Integer, String> map = new HashMap<>(16,1.1f);
        for (int i = 16; i >=0; i--) {
            map.put(i, "" + i);
        }
        System.out.println(map);
 */

        Map<Integer, String> map2 = new LinkedHashMap<>(16,1.1f, true);
        for (int i = 16; i >=0; i--) {
            map2.put(i, "" + i);
        }
        map2.get(3);
        map2.get(3);
        map2.get(3);
        map2.get(6);
        map2.get(9);
        System.out.println(map2);
        //{16=16, 15=15, 14=14, 13=13, 12=12, 11=11, 10=10, 9=9, 8=8, 7=7, 6=6, 5=5, 4=4, 3=3, 2=2, 1=1, 0=0}
        //{16=16, 15=15, 14=14, 13=13, 12=12, 11=11, 10=10, 8=8, 7=7, 5=5, 4=4, 2=2, 1=1, 0=0, 3=3, 6=6, 9=9}




    }
}
