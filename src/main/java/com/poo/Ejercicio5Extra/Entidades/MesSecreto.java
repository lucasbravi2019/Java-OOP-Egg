package com.poo.Ejercicio5Extra.Entidades;

import java.util.Arrays;

public class MesSecreto {
    private String[] meses;

    public String[] getMeses() {
        return this.meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public MesSecreto() {
    }

    public MesSecreto(String[] meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "{\n   meses: " + Arrays.toString(meses) + "\n}";
    }
}
