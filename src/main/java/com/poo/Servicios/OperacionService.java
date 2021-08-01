package com.poo.Servicios;

import java.util.Scanner;

import com.poo.Entidades.Operacion;

public class OperacionService {
    private Operacion o;
    Scanner scan = new Scanner(System.in);

    public OperacionService(Operacion o) {
        this.o = o;
    }

    public void crearOperacion() {
        System.out.println("Ingrese el primer numero");
        o.setNumero1(scan.nextDouble());
        System.out.println("Ingrese el segundo numero");
        o.setNumero2(scan.nextDouble());
    }

    public double sumar() {
        return o.getNumero1() + o.getNumero2();
    }

    public double restar() {
        return o.getNumero1() - o.getNumero2();
    }

    public double multiplicar() {
        if (o.getNumero1() == 0 || o.getNumero2() == 0) {
            return 0;
        }
        return o.getNumero1() * o.getNumero2();
    }

    public double dividir() {
        if (o.getNumero2() == 0) {
            return 0;
        }
        return o.getNumero1() / o.getNumero2();
    }
}
