package com.poo.Ejercicio2.Servicios;

import java.util.Scanner;

import com.poo.Ejercicio2.Entidades.Circunferencia;

public class CircunferenciaService {
    private Circunferencia c;
    Scanner scan = new Scanner(System.in);

    public CircunferenciaService(Circunferencia c) {
        this.c = c;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia");
        c.setRadio(scan.nextDouble());
    }

    public double calcularArea() {
        return Math.PI * Math.pow(c.getRadio(), 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * c.getRadio();
    }
}
