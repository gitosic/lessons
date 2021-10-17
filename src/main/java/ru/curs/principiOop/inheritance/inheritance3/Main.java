package ru.curs.principiOop.inheritance.inheritance3;

public class Main {
    public static void main(String[] args) {
        MonsterTruck monsterTruck = new MonsterTruck();
        monsterTruck.sound();

        int[] myArray; // объявление массива
        myArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int

        int[] myArray2 = new int[10]; // объявление и выделение памяти “в одном флаконе”

        String[] seasons  = new String[4]; /* объявили и создали массив. Java выделила память под массив из 4 строк, и сейчас в каждой ячейке записано значение null (поскольку строка — ссылочный тип)*/
        seasons[0] = "Winter"; /* в первую ячейку, то есть, в ячейку с нулевым номером мы записали строку Winter. Тут мы получаем доступ к нулевому элементу массива и записываем туда конкретное значение  */
        seasons[1] = "Spring"; // проделываем ту же процедуру с ячейкой номер 1 (второй)
        seasons[2] = "Summer"; // ...номер 2
        seasons[3] = "Autumn"; // и с последней, номер 3

        System.out.println(seasons[2]);





    }
}
