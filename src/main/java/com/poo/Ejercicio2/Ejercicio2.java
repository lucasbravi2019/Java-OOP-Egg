package com.poo.Ejercicio2;

import java.util.Scanner;

import com.poo.Ejercicio2.Entidades.Circunferencia;
import com.poo.Ejercicio2.Servicios.CircunferenciaService;

public class Ejercicio2 {
    public static void main(String[] args) {
        Circunferencia c = new Circunferencia();
        CircunferenciaService s = new CircunferenciaService(c);

        Scanner scan = new Scanner(System.in);
        int operacion = 0;

        while (operacion != 5) {
            System.out.println("\tMenu");
            System.out.println("1. Crear Circunferencia");
            System.out.println("2. Calcular Area");
            System.out.println("3. Calcular Perimetro");
            System.out.println("4. Mostrar Circunferencia");
            System.out.println("5. Salir");
            operacion = scan.nextInt();
            if (operacion == 1) {
                s.crearCircunferencia();
            }
            if (operacion == 2) {
                System.out.println("Area: " + s.calcularArea());
            }
            if (operacion == 3) {
                System.out.println("Perimetro: " + s.calcularPerimetro());
            }
            if (operacion == 4) {
                System.out.println(c);
            }
            if (operacion == 5) {
                return;
            }
        }
    }
}
