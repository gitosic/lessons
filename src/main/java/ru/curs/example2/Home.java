package ru.curs.example2;

public class Home {
    int area;
    int amountRoom;
    String owner;
    int month;
    int priceMeter;

    public Home() {
    }

    public Home(int area, int amountRoom, int priceMeter){
        this.area = area;
        this.amountRoom = amountRoom;
        this.priceMeter = priceMeter;
    }

    /**
     * Вычисление суммы оплаты за коммуналку :))
     * @param priceMeter цена за метр
     * @param month кол-во месяцев за которые должен заплатить
     * @param amountRoom кол-во комнат
     * @param area площать квартиры
     * @return сумма к оплате
     */
    public int payMonth(int priceMeter, int month, int amountRoom, int area){
        return priceMeter * month * amountRoom;
    }
}
