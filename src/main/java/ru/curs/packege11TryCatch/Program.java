package ru.curs.packege11TryCatch;


import java.io.IOException;

public class Program {
    public static void main(String[] args) {
/*        try {
            int[] nums = new int[3];
            nums[4] = 1;
            System.out.println(nums[4]);
        } catch (Exception e){
            System.out.println("Ошибка " + e);
            //e.printStackTrace();
        } finally {//todo. finally выполняется даже если ошибки нет
            System.out.println("Finally");
        }
        System.out.println("Программа завершена");

        System.out.println(111);
        System.out.println(111);
        System.out.println(111);

*/
/*
        int[] nums2 = new int[3];
        try {
//            nums2[4] = 1;
            nums2[4] = Integer.parseInt("dfsdfsf");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за пределы массива");
        } catch (NumberFormatException ex){
            System.out.println("Ошибка преобразования из строки в число");
        } catch (Exception ex){
            System.out.println("Хз что произошло.");
        }finally {
            System.out.println("Код который всегда отработает");
            System.err.println("Код который всегда отработает");
        }
*/

        foo();

    }



    public static void foo(){
//        System.out.println(1/0);

//        int array[] = {1,2,3};
//        array[4] = 5;
        ABC abc = null;
        /*try {
            abc.show();
        } catch (Exception  e){
            e.printStackTrace();
        }*/

        /*if (abc == null){
            System.err.println("Ошибка: NullPointerException");
        } else {
            abc.show();
        }*/

        System.out.println("111111111");

        try {
            abc.show();
            System.out.println(1/0);
        } catch (NullPointerException | ArithmeticException  e){
            e.printStackTrace();
        }


    }
}
