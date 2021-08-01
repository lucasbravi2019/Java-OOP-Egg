package com.poo.Ejercicios;

import java.util.Scanner;

import com.poo.Entidades.Rectangulo;
import com.poo.Servicios.RectanguloService;

public class Ejercicio4 {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        RectanguloService s = new RectanguloService(r);

        Scanner scan = new Scanner(System.in);
        int operacion = 0;

        while (operacion != 6) {
            System.out.println("\t Menu");
            System.out.println("1. Crear Rectangulo");
            System.out.println("2. Calcular Superficie");
            System.out.println("3. Calcular Perimetro");
            System.out.println("4. Dibujar");
            System.out.println("5. Mostrar Rectangulo");
            System.out.println("6. Salir");
            operacion = scan.nextInt();
            if (operacion == 1) {
                s.crearRectangulo();
            }
            if (operacion == 2) {
                System.out.println("Superficie: " + s.calcularSuperficie());
            }
            if (operacion == 3) {
                System.out.println("Perimetro: " + s.calcularPerimetro());
            }
            if (operacion == 4) {
                s.dibujar();
            }
            if (operacion == 5) {
                System.out.println(r);
            }
            if (operacion == 6) {
                return;
            }
        }
    }
}
