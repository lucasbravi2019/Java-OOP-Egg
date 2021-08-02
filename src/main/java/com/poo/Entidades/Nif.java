package com.poo.Entidades;

public class Nif {
    private long dni;
    private char nif;

    public Nif() {
    }

    public Nif(long dni, char nif) {
        this.dni = dni;
        this.nif = nif;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getNif() {
        return this.nif;
    }

    public void setNif(char nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "{\n   dni: " + dni + ",\n   nif: " + nif + "\n}";
    }

}
