package com.poo.Servicios;

import java.util.Scanner;

import com.poo.Entidades.Cuenta;

public class CuentaService {
    private Cuenta c;
    Scanner scan = new Scanner(System.in);

    public CuentaService(Cuenta c) {
        this.c = c;
    }

    public void crearCuenta() {
        System.out.println("Ingrese su dni");
        c.setDni(scan.nextLong());
        c.setNumeroCuenta((int) (Math.random() * 10000));
        c.setInteres(22.5);
        System.out.println("Desea depositar dinero? (S/N)");
        if (scan.next().toUpperCase().charAt(0) == 'S') {
            System.out.println("Cuanto desea ingresar?");
            ingresar(scan.nextDouble());
        }
        System.out.println("Su cuenta ha sido creada satisfactoriamente");
        System.out.println(c);
    }

    public void ingresar(double ingreso) {
        System.out.println("Usted deposito: $" + ingreso);
        c.setSaldo(c.getSaldo() + ingreso);
    }

    public void retirar(double retiro) {
        if (c.getSaldo() < retiro) {
            System.out.println("Fondos insuficientes.");
        } else {
            c.setSaldo(c.getSaldo() - retiro);
            System.out.println("Usted retiro: $" + retiro);
        }
    }

    public void extraccionRapida() {
        System.out.println("Extraccion finalizada");
        System.out.println("Monto extraido: $" + (c.getSaldo() * .2));
        c.setSaldo(c.getSaldo() * .8);
    }

    public void consultarSaldo() {
        System.out.println("Su saldo en pesos es de: $" + c.getSaldo());
    }

    public void consultarDatos() {
        System.out.println("\t Datos de la cuenta");
        System.out.println("Numero de cuenta: " + c.getNumeroCuenta());
        System.out.println("Numero de dni: " + c.getDni());
        System.out.println("Saldo: $" + c.getSaldo());
        System.out.println("Intereses: " + c.getInteres() + "%");
    }

}
