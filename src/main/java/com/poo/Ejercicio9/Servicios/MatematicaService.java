package com.poo.Ejercicio9.Servicios;

import com.poo.Ejercicio9.Entidades.Matematica;

public class MatematicaService {
    private Matematica m;

    public MatematicaService(Matematica m) {
        this.m = m;
    }

    public void llenarNumeros() {
        m.setNumero1(Math.random() * 10);
        m.setNumero2(Math.random() * 10);
    }

    public double devolverMayor() {
        if (m.getNumero1() > m.getNumero2()) {
            return m.getNumero1();
        }
        if (m.getNumero2() > m.getNumero1()) {
            return m.getNumero2();
        }
        return 0;
    }

    public double devolverMenor() {
        if (m.getNumero1() > m.getNumero2()) {
            return m.getNumero2();
        }
        if (m.getNumero2() > m.getNumero1()) {
            return m.getNumero1();
        }
        return 0;
    }

    public double calcularPotencia() {
        return Math.pow(Math.round(devolverMayor()), Math.round(devolverMenor()));
    }

    public double calcularRaiz() {
        return Math.sqrt(Math.round(devolverMenor()));
    }

}
