package ru.curs.packege9GoodWork;

public class Book implements Actions {
    String name;
    int price;

    public Book(String name, int price){
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void getBookInfo(){
        System.out.println("Название книги '" + this.name + "', её цена " + this.price + "руб.");
    }
}
