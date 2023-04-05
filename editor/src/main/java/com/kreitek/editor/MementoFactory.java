package com.kreitek.editor;

public class MementoFactory {

    public static Memento getMemento() {
        Memento memento = new Memento();
        return memento;
    }
}
