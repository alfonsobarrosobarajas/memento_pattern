package com.memento;

public class Persona {

    private String nombre;

    public Memento saveToMemento(){
        System.out.println("Guardando ... ");
        return new Memento(nombre);
    }

    public void restoreFromMemento(Memento m){
        nombre = m.getSavedState();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
