package com.kreitek.editor;

import java.util.ArrayList;
import java.util.List;

public class MementoCaretaker {

    private static volatile MementoCaretaker instance;
    private List<Memento> mementos = new ArrayList<>();

    private MementoCaretaker() {
    }

    public static MementoCaretaker getInstance() {
        if (instance == null) {
            synchronized (MementoCaretaker.class) {
                if (instance == null) {
                    instance = new MementoCaretaker();
                }
            }
        }
        return instance;
    }

    public void push(Memento state) {
        mementos.add(state);
    }

    public void pop() {
        int index = mementos.size() - 1;
        mementos.remove(index);
    }

    public Memento get(){
        try {
            int index = mementos.size() - 2;
            Memento memento = mementos.get(index);
            return memento;
        }
        catch (Exception e){
            System.out.println("---------------------");
            System.out.println("No more undo");
            System.out.println("---------------------");
        }
        Memento memento = MementoFactory.getMemento();
        return memento;
    }

}
