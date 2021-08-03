package com.poo.Ejercicio7.Servicios;

import java.util.Scanner;

import com.poo.Ejercicio7.Entidades.Persona;

public class PersonaService {
    private Persona p;
    Scanner scan = new Scanner(System.in);

    public PersonaService(Persona p) {
        this.p = p;
    }

    public void crearPersona() {
        System.out.println("Ingrese el nombre");
        p.setNombre(scan.nextLine());
        System.out.println("Ingrese la edad");
        p.setEdad(scan.nextInt());
        System.out.println("Ingrese el sexo (H-M-O)");
        char sexo = scan.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Por favor indique H, M u O");
            sexo = scan.next().toUpperCase().charAt(0);
        }
        p.setSexo(sexo);
        System.out.println("Ingrese el peso");
        p.setPeso(scan.nextDouble());
        System.out.println("Ingrese la altura");
        p.setAltura(scan.nextDouble());
    }

    public void imc() {
        if (calcularIMC() == -1) {
            System.out.println("La persona esta por debajo de su peso ideal");
        }
        if (calcularIMC() == 0) {
            System.out.println("La persona esta en su peso ideal");
        }
        if (calcularIMC() == 1) {
            System.out.println("La persona esta por encima de su peso ideal");
        }
        if (calcularIMC() == 2) {
            System.out.println("Ocurrio un error");
        }
    }

    public int calcularIMC() {
        double imc = p.getPeso() / Math.pow(p.getAltura(), 2);
        if (imc < 20) {
            return -1;
        }
        if (imc >= 20 && imc <= 25) {
            return 0;
        }
        if (imc > 25) {
            return 1;
        }
        return 2;
    }

    public boolean esMayorDeEdad() {
        if (p.getEdad() >= 18) {
            return true;
        }
        return false;
    }
}
