package com.poo.Servicios;

import java.util.Scanner;

import com.poo.Entidades.MesSecreto;

public class MesSecretoService {
    private MesSecreto m;

    public MesSecretoService(MesSecreto m) {
        this.m = m;
        llenarMeses();
    }

    public void llenarMeses() {
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre",
                "octubre", "noviembre", "diciembre" };
        m.setMeses(meses);
    }

    public void preguntarMes() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minusculas");
        String mes = scan.next();
        while (repetirMes(mes)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            mes = scan.next();
        }
        System.out.println("Ha acertado!");
    }

    public boolean repetirMes(String mes) {
        // Cambiar el numero de indice desde 0 a 11 para generar diferentes meses
        // secretos.
        String mesSecreto = m.getMeses()[3];
        if (mes.equals(mesSecreto)) {
            return false;
        }
        return true;
    }

}
