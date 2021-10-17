package ru.curs.packege9GoodWork;

public class Main {
    public static void main(String[] args) {
        Actions book1 = new Book();
        book1.getBookInfo();

        Book book2 = new Book();
        book2.setName("Азбука");
        book2.setPrice(100);
        book2.getBookInfo();

        getInfoAboutBook(book1);
        getInfoAboutBook(book2);
    }

    public static void getInfoAboutBook(Actions actions){
        actions.getBookInfo();
    }
}
