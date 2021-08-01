package com.poo.Ejercicios;

import java.util.Scanner;

import com.poo.Entidades.Operacion;
import com.poo.Servicios.OperacionService;

public class Ejercicio3 {
    public static void main(String[] args) {
        Operacion o = new Operacion();
        OperacionService s = new OperacionService(o);

        Scanner scan = new Scanner(System.in);
        int operacion = 0;

        while (operacion != 7) {
            System.out.println("\t Menu");
            System.out.println("1. Crear Operacion");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Mostrar numeros");
            System.out.println("7. Salir");
            operacion = scan.nextInt();
            if (operacion == 1) {
                s.crearOperacion();
            }
            if (operacion == 2) {
                System.out.println("Suma: " + s.sumar());
            }
            if (operacion == 3) {
                System.out.println("Resta: " + s.restar());
            }
            if (operacion == 4) {
                if (s.multiplicar() == 0) {
                    System.out
                            .println("Multiplicacion: uno o ambos numeros son 0. Por favor use valores distintos a 0.");
                } else {
                    System.out.println("Multiplicacion: " + s.multiplicar());
                }
            }
            if (operacion == 5) {
                if (s.dividir() == 0) {
                    System.out.println("Division: division por 0. Por favor use un denominador diferente de 0.");
                } else {
                    System.out.println("Division: " + s.dividir());
                }
            }
            if (operacion == 6) {
                System.out.println(o);
            }
            if (operacion == 7) {
                return;
            }
        }

    }
}
