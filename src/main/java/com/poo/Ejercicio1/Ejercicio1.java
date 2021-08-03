package com.poo.Ejercicio1;

import java.util.Scanner;

import com.poo.Ejercicio1.Entidades.Libro;
import com.poo.Ejercicio1.Servicios.LibroService;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operacion = 0;

        Libro l = new Libro();
        LibroService s = new LibroService(l);

        while (operacion != 3) {
            System.out.println("\tMENU");
            System.out.println("1. Crear Libro");
            System.out.println("2. Mostrar Libro");
            System.out.println("3. Salir");
            operacion = scan.nextInt();
            if (operacion == 1) {
                s.crearLibro();
            }
            if (operacion == 2) {
                System.out.println(l);
            }
            if (operacion == 3) {
                return;
            }
        }
    }

}
