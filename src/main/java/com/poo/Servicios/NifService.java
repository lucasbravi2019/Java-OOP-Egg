package com.poo.Servicios;

import java.util.Scanner;

import com.poo.Entidades.Nif;

public class NifService {
    private Nif n;
    Scanner scan = new Scanner(System.in);

    public NifService(Nif n) {
        this.n = n;
    }

    public void crearNif() {
        System.out.println("Ingrese su dni");
        n.setDni(scan.nextLong());
        n.setNif(calcularNif());
    }

    public char calcularNif() {
        char[] nif = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };
        return nif[calcularResto()];
    }

    public int calcularResto() {
        return (int) (n.getDni() % 23);
    }

    public void mostrar() {
        System.out.println("El NIF es: ");
        System.out.println(n.getDni() + "-" + n.getNif());
    }
}
