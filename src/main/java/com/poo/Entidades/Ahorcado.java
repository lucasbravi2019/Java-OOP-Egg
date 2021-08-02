package com.poo.Entidades;

import java.util.ArrayList;

public class Ahorcado {
    private ArrayList<Character> letras;
    private int jugadasMaximas;
    private int cantidadLetrasEncontradas;

    public Ahorcado() {
    }

    public Ahorcado(ArrayList<Character> letras) {
        this.letras = letras;
    }

    public ArrayList<Character> getLetras() {
        return this.letras;
    }

    public void setLetras(ArrayList<Character> letras) {
        this.letras = letras;
    }

    public int getJugadasMaximas() {
        return this.jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public int getCantidadLetrasEncontradas() {
        return this.cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    @Override
    public String toString() {
        if (letras != null) {
            return "{\n   letras: " + letras.toString() + ",\n   cantidad_letras_encontradas: "
                    + cantidadLetrasEncontradas + ",\n   cantidad_turnos_jugador: " + jugadasMaximas + "\n}";
        }
        return "{\n   letras: null,\n   cantidad_letras_encontradas: " + cantidadLetrasEncontradas
                + ",\n   cantidad_turnos_jugador: " + jugadasMaximas + "\n}";
    }
}
