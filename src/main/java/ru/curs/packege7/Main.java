package ru.curs.packege7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
//        cat.age = 1;
        cat.setAge(2);
//        cat.name = "Рыжый";
        cat.setName("Рыжий");
//        System.out.println(cat.age + " " + cat.name);

//        System.out.println(cat.getInfo(1,"aaa"));
        System.out.println(cat.getInfo());
    }

}
