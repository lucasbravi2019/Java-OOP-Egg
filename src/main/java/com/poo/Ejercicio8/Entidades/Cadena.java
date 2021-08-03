package com.poo.Ejercicio8.Entidades;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return this.frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return this.longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "{\n   frase: " + frase + ",\n   longitud: " + longitud + " \n}";
    }
}
