package ru.curs.principiOop.modifiers;

public class ModifieresPrivate {
    private String name;
    private ModifieresPrivate(){};


    private void foo(){
        ModifieresPrivate modifieresPrivate = new ModifieresPrivate();
    }
}