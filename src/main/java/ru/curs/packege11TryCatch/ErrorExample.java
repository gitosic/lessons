package ru.curs.packege11TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorExample {
    public void foo2(){ //todo Добавляется throws FileNotFoundException
                        //todo или оборачиваем в блок try catch
        try {
            FileInputStream fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
