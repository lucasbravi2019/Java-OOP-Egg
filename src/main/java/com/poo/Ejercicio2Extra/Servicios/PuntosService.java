package com.poo.Ejercicio2Extra.Servicios;

import java.util.Scanner;

import com.poo.Ejercicio2Extra.Entidades.Puntos;

public class PuntosService {
    private Puntos p;
    Scanner scan = new Scanner(System.in);

    public PuntosService(Puntos p) {
        this.p = p;
    }

    public void crearPuntos() {
        System.out.println("Ingresa el primer punto");
        p.setX1(scan.nextDouble());
        p.setY1(scan.nextDouble());
        System.out.println("Ingresa el segundo punto");
        p.setX2(scan.nextDouble());
        p.setY2(scan.nextDouble());
    }

    public double calcularDistancia() {
        return Math.sqrt(Math.pow((p.getX2() - p.getX1()), 2) + Math.pow((p.getY2() - p.getY1()), 2));
    }
}
