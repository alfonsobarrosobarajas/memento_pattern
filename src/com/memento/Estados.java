package com.memento;

import java.util.ArrayList;

public class Estados {

    private ArrayList<Memento> estados = new ArrayList<>();


    public void addMemento(Memento m){
        estados.add(m);
    }



    public Memento getMemento(int index) {
        return estados.get(index);
    }
}
