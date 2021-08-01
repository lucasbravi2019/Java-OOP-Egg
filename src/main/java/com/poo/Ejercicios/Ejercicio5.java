package com.poo.Ejercicios;

import java.util.Scanner;

import com.poo.Entidades.Cuenta;
import com.poo.Servicios.CuentaService;

public class Ejercicio5 {
    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        CuentaService s = new CuentaService(c);

        Scanner scan = new Scanner(System.in);
        int operacion = 0;

        while (operacion != 8) {
            System.out.println("\t Menu");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Extraccion rapida");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Consultar datos");
            System.out.println("7. Mostrar cuenta");
            System.out.println("8. Salir");
            operacion = scan.nextInt();
            if (operacion == 1) {
                s.crearCuenta();
            }
            if (operacion == 2) {
                System.out.println("Cuanto desea depositar?");
                s.ingresar(scan.nextDouble());
            }
            if (operacion == 3) {
                System.out.println("Cuanto desea retirar?");
                s.retirar(scan.nextDouble());
            }
            if (operacion == 4) {
                s.extraccionRapida();
            }
            if (operacion == 5) {
                s.consultarSaldo();
            }
            if (operacion == 6) {
                s.consultarDatos();
            }
            if (operacion == 7) {
                System.out.println(c);
            }
            if (operacion == 8) {
                return;
            }
        }
    }
}
