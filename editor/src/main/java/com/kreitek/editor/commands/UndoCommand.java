package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;
import com.kreitek.editor.MementoCaretaker;
import com.kreitek.editor.MementoFactory;

import java.util.ArrayList;

public class UndoCommand implements Command {
    Memento memento = MementoFactory.getMemento();
    MementoCaretaker caretaker = MementoCaretaker.getInstance();

    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines.clear();
        memento = caretaker.get();
        caretaker.pop();
        documentLines.addAll(memento.getState());
    }
}
