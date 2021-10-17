package ru.curs.principiOop.modifiers;

import ru.curs.principiOop.modifiers.ModifieresPublic;

public class TestQA {
    public static void main(String[] args) {
        ModifieresPublic m1 = new ModifieresPublic();
        System.out.println(m1.name);

        FirstClass f1 = new FirstClass();
        System.out.println(f1.age);
    }
}
