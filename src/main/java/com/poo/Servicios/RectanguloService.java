package com.poo.Servicios;

import java.util.Scanner;

import com.poo.Entidades.Rectangulo;

public class RectanguloService {
    private Rectangulo r;
    Scanner scan = new Scanner(System.in);

    public RectanguloService(Rectangulo r) {
        this.r = r;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese la altura del rectangulo");
        r.setAltura(scan.nextDouble());
        System.out.println("Ingrese la base del rectangulo");
        r.setBase(scan.nextDouble());
    }

    public double calcularSuperficie() {
        return r.getAltura() * r.getBase();
    }

    public double calcularPerimetro() {
        return r.getAltura() * 2 + r.getBase() * 2;
    }

    public void dibujar() {
        for (int i = 0; i < (int) r.getAltura(); i++) {
            for (int j = 0; j < (int) r.getBase(); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
