package com.poo.Ejercicios;

import java.util.Scanner;

import com.poo.Entidades.Matematica;
import com.poo.Servicios.MatematicaService;

public class Ejercicio9 {
    public static void main(String[] args) {
        Matematica m = new Matematica();
        MatematicaService s = new MatematicaService(m);
        Scanner scan = new Scanner(System.in);
        int operacion = 0;

        while (operacion != 6) {
            System.out.println("\t Menu");
            System.out.println("1. Llenar numeros");
            System.out.println("2. Mostrar mayor");
            System.out.println("3. Calcular potencia");
            System.out.println("4. Calcular raiz");
            System.out.println("5. Mostrar numeros");
            System.out.println("6. Salir");
            operacion = scan.nextInt();
            if (operacion == 1) {
                s.llenarNumeros();
            }
            if (operacion == 2) {
                System.out.println("El numero mayor es " + s.devolverMayor());
            }
            if (operacion == 3) {
                System.out.println("La potencia es: " + s.calcularPotencia());
            }
            if (operacion == 4) {
                System.out.println("La raiz es: " + s.calcularRaiz());
            }
            if (operacion == 5) {
                System.out.println(m);
            }
            if (operacion == 6) {
                return;
            }
        }

    }
}
