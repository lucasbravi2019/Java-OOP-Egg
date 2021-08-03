package com.poo.Ejercicio6;

import java.util.Scanner;

import com.poo.Ejercicio6.Entidades.Cafetera;
import com.poo.Ejercicio6.Servicios.CafeteraService;

public class Ejercicio6 {
    public static void main(String[] args) {
        Cafetera c = new Cafetera();
        CafeteraService s = new CafeteraService(c);

        Scanner scan = new Scanner(System.in);
        int operacion = 0;

        while (operacion != 6) {
            System.out.println("\t Menu");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Mostrar cafetera");
            System.out.println("6. Salir");
            operacion = scan.nextInt();
            if (operacion == 1) {
                s.llenarCafetera();
            }
            if (operacion == 2) {
                System.out.println("Cuantos ml de cafe desea servir?");
                s.servirTaza(scan.nextInt());
            }
            if (operacion == 3) {
                s.vaciarCafetera();
            }
            if (operacion == 4) {
                System.out.println("Cuanto cafe desea agregar?");
                s.agregarCafe(scan.nextInt());
            }
            if (operacion == 5) {
                System.out.println(c);
            }
        }
    }
}
