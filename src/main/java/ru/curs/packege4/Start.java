package ru.curs.packege4;

public class Start {
    public static void main(String[] args) {
        Boy ivan = new Boy();
        Girl alenushka = new Girl();

        ivan.play();
        alenushka.play();

        Player user = ivan;
        user.play();//Только те методы, которые есть в интерфейсе и не более.
        ivan.go();

        myMethod(alenushka);

        Boy b2 = new Boy();
        b2.read();

        Study lessons = new Boy();
        lessons.write();
    }

    /**
     * Создал общий метод, который принимает на вход любой объект типа Player, так как эти объекты имплементят интерфейс Player.
     * @param player
     */
    public static void myMethod(Player player){
        player.play();
    }



}
