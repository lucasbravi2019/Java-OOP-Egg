package com.poo.Ejercicio12;

import java.util.Date;

import com.poo.Ejercicio12.Entidades.PersonaDate;
import com.poo.Ejercicio12.Servicios.PersonaDateService;

public class Ejercicio12 {
    public static void main(String[] args) {
        PersonaDate p = new PersonaDate();
        PersonaDateService s = new PersonaDateService(p);

        s.crearPersona();
        System.out.println("La edad de " + p.getNombre() + " es de " + s.calcularEdad() + " años");
        System.out.println("Es menor que: " + s.menorQue(28));
        System.out.println(p);
    }
}
