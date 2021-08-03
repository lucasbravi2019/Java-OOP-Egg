package com.poo.Ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("[^0-9]");
        System.out.println("Inserte la fecha de su nacimiento (15/5/1994)");
        int dia = Integer.valueOf(scan.next());
        int mes = Integer.valueOf(scan.next()) - 1;
        int anio = Integer.valueOf(scan.next()) - 1900;
        Date fechaNacimiento = new Date(anio, mes, dia);
        scan.close();
        System.out.println("Hay una diferencia de " + (fechaActual.getYear() - fechaNacimiento.getYear()) + " años");
    }
}
