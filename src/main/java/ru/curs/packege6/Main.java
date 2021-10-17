package ru.curs.packege6;

public class Main  {
    public static void main(String[] args) {
        Children children = new Children("Иван", "Долгов", 9, "Начальный");
        //children.doWork();

        Studying student0 = new Children("Иван", "Долгов", 9, "Начальный");
        Children children0 = new Children("Иван", "Долгов", 9, "Начальный");
        children0.methodChildren();

        Studying student1 = new Men("Василий", "Иванов", 23, "Средний");

        workInSchool(student0);
        workInSchool(student1);

        Men m1 = new Men("Иван", "Долгов", 9, "Начальный");
        System.out.println(m1.GetInt(2)+2);
//        m1.GetInt(2);
    }

    static void workInSchool(Studying student){
        student.comeToSchool();
        student.doWork();
        student.getInfo("Иван", "Долгов", 9, "Начальный");
    }
}
