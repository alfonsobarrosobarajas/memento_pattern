package com.memento;

public class Main {

    public static void main(String[] args) {


        Estados estados = new Estados();

        Persona p = new Persona();
        p.setNombre("Elyze Ryd");
        p.setNombre("Floor Jansen");

        estados.addMemento(p.saveToMemento());

        p.setNombre("Alisa White-Gluz");

        estados.addMemento(p.saveToMemento());

        p.setNombre("Tarja Turunen");



        Memento m0 = estados.getMemento(0);
        Memento m1 = estados.getMemento(1);

        System.out.println(m0.getSavedState());
        System.out.println(m1.getSavedState());

    }
}
