package com.kreitek.editor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Memento {
    private List<String> state = new ArrayList<>();

    public Memento() {
    }

    public List<String> getState() {
        return this.state;
    }

    public void setState(List<String> state) {
        this.state.addAll(state);
    }
}
