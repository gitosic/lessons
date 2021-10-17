package ru.curs.example2;

public class Main {
    public static void main(String[] args) {
        Home firstHome = new Home();
        firstHome.amountRoom = 1;
        firstHome.area = 20;
        firstHome.owner = "landlord";

        System.out.println(firstHome.payMonth(14,1, 1, 20));

        Home secondHome = new Home(34,2,26);
        System.out.println("Площадь квартиры " + secondHome.area + " количество комнат " + secondHome.amountRoom + " с ценой за метр " + secondHome.priceMeter);
        System.out.println("К оплате (тыс. руб): " + secondHome.payMonth(26,1,2, 34));

        Home h1 = new Home(1,3,2);
        System.out.println("777 " + h1.area + h1.amountRoom + h1.priceMeter);
    }/**/
}
