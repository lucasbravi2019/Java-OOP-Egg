package com.poo.Ejercicio12.Servicios;

import java.util.Date;
import java.util.Scanner;

import com.poo.Ejercicio12.Entidades.PersonaDate;

public class PersonaDateService {
    private PersonaDate p;
    Scanner scan = new Scanner(System.in);

    public PersonaDateService(PersonaDate p) {
        this.p = p;
    }

    public void crearPersona() {
        System.out.println("Por favor ingrese su nombre");
        p.setNombre(scan.nextLine());
        scan.useDelimiter("[^0-9]");
        System.out.println("Ingrese su fecha de nacimiento");
        int dia = Integer.valueOf(scan.next());
        int mes = Integer.valueOf(scan.next()) - 1;
        int anio = Integer.valueOf(scan.next()) - 1900;
        p.setFecha(new Date(anio, mes, dia));
    }

    public int calcularEdad() {
        Date fechaActual = new Date();
        Date fechaNacimiento = p.getFecha();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth()) {
            return fechaActual.getYear() - fechaNacimiento.getYear() - 1;
        } else if (fechaNacimiento.getMonth() == fechaActual.getMonth()) {
            if (fechaNacimiento.getDate() > fechaActual.getDate()) {
                return fechaActual.getYear() - fechaNacimiento.getYear() - 1;
            } else {
                return fechaActual.getYear() - fechaNacimiento.getYear();
            }
        } else {
            return fechaActual.getYear() - fechaNacimiento.getYear();
        }

    }

    public boolean menorQue(int edad) {
        int comparacion = Integer.compare(calcularEdad(), edad);
        if (comparacion < 0) {
            return true;
        } else {
            return false;
        }
    }

}
