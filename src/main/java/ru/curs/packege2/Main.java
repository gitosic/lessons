package ru.curs.packege2;

public class Main {
    public static void main(String[] args) {
        Roads r1 = new Roads();
        r1.number = 799;
        r1.region = "Москва";
        System.out.println(r1.number + " " + r1.region);

        Roads r2 = new Roads("Астраханской обл",30, "Астрахань1");
        System.out.println(r2.number);
        System.out.println(r2.region);
        r2.getInfoByRoad("Москве", 799);
        r2.getInfoCity();

        Building b1 = new Building();
        b1.getInfoCity();

        Information t1 = new Roads();
        Information t2 = new Building();
        System.out.println("111");
        t1.getInfoCity();
        t2.getInfoCity();
        System.out.println("222");
        outputInfo(t1);
        outputInfo(t2);
    }

    public static void outputInfo(Information information){
        information.getInfoCity();
    }
}
