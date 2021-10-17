package ru.curs.principiOop.forModifieresTest;

import ru.curs.principiOop.modifiers.ModifieresPrivate;
import ru.curs.principiOop.modifiers.ModifieresPublic;

public class Main {
    public static void main(String[] args) {
        ModifieresPublic modifieresPublic = new ModifieresPublic();
        modifieresPublic.foo();
        String name = modifieresPublic.name;

        //ModifieresPrivate modifieresPrivate = new ModifieresPrivate();
    }
}
