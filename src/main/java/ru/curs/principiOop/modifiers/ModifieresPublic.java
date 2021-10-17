package ru.curs.principiOop.modifiers;

public class ModifieresPublic {
    public String name;
    public ModifieresPublic(){};


    private class FirstClass{
        public String color;
    }

    public void foo(){
        FirstClass firstClass = new FirstClass();
        firstClass.color.toString();
    };
}