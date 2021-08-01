package com.poo.Ejercicios;

import java.util.Scanner;

import com.poo.Entidades.Cadena;
import com.poo.Servicios.CadenaService;

public class Ejercicio8 {
    public static void main(String[] args) {
        Cadena c = new Cadena();
        CadenaService s = new CadenaService(c);

        Scanner scan = new Scanner(System.in);
        int operacion = 0;

        while (operacion != 10) {
            System.out.println("\t Menu");
            System.out.println("1. Crear frase");
            System.out.println("2. Mostrar cantidad vocales");
            System.out.println("3. Invertir frase");
            System.out.println("4. Calcular veces que se repite ");
            System.out.println("5. Comparar longitud");
            System.out.println("6. Unir frases ");
            System.out.println("7. Reemplazar");
            System.out.println("8. Comprobar si existe una letra");
            System.out.println("9. Mostrar objeto");
            System.out.println("10. Salir");
            operacion = scan.nextInt();
            if (operacion == 1) {
                s.crearFrase();
            }
            if (operacion == 2) {
                s.mostrarVocales();
            }
            if (operacion == 3) {
                s.invertirFrase();
            }
            if (operacion == 4) {
                System.out.println("Ingrese la letra a buscar");
                System.out.println("La letra se repite " + s.vecesRepetido(scan.next().charAt(0)) + " veces");
            }
            if (operacion == 5) {
                System.out.println("Ingrese una frase");
                scan.nextLine();
                s.compararLongitud(scan.nextLine());
            }
            if (operacion == 6) {
                System.out.println("Ingrese una frase");
                scan.nextLine();
                System.out.println(s.unirFrases(scan.nextLine()));
            }
            if (operacion == 7) {
                System.out.println("Ingrese el simbolo por el que quiere reemplazar la letra a");
                s.reemplazar(scan.next().charAt(0));
            }
            if (operacion == 8) {
                System.out.println("Ingrese la letra a buscar");
                System.out.println(s.contiene(scan.next().toLowerCase().charAt(0)));
            }
            if (operacion == 9) {
                System.out.println(c);
            }
            if (operacion == 10) {
                return;
            }
        }

    }
}
