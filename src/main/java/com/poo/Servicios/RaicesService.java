package com.poo.Servicios;

import java.util.Scanner;

import com.poo.Entidades.Raices;

public class RaicesService {
    private Raices r;
    Scanner scan = new Scanner(System.in);

    public RaicesService(Raices r) {
        this.r = r;
    }

    public void crearCoeficientes() {
        System.out.println("Ingrese a, b y c");
        r.setA(scan.nextDouble());
        r.setB(scan.nextDouble());
        r.setC(scan.nextDouble());
    }

    public double getDiscriminante() {
        return Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC());
    }

    public boolean tieneRaices() {
        if (getDiscriminante() > 0) {
            return true;
        }
        return false;
    }

    public boolean tieneRaiz() {
        if (getDiscriminante() == 0) {
            return true;
        }
        return false;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            double raiz1 = (-r.getB() + Math.sqrt(getDiscriminante())) / (2 * r.getA());
            double raiz2 = (-r.getB() - Math.sqrt(getDiscriminante())) / (2 * r.getA());
            System.out.println("x1: " + raiz1);
            System.out.println("x2: " + raiz2);
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double raiz = (-r.getB() / (2 * r.getA()));
            System.out.println("x1,2: " + raiz);
        }
    }

    public void calcular() {
        if (!tieneRaiz() && !tieneRaices()) {
            System.out.println("No tiene raices");
        } else if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        }
    }

}
