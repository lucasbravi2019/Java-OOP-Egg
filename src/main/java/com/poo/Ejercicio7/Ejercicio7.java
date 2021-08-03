package com.poo.Ejercicio7;

import com.poo.Ejercicio7.Entidades.Persona;
import com.poo.Ejercicio7.Servicios.PersonaService;

public class Ejercicio7 {
    public static void main(String[] args) {
        Persona[] personas = new Persona[4];
        PersonaService[] pService = new PersonaService[4];

        int delgado = 0;
        int ideal = 0;
        int sobrepeso = 0;
        int mayor = 0;
        int menor = 0;
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
            pService[i] = new PersonaService(personas[i]);
            pService[i].crearPersona();
            pService[i].imc();
            if (pService[i].calcularIMC() == -1) {
                delgado++;
            }
            if (pService[i].calcularIMC() == 0) {
                ideal++;
            }
            if (pService[i].calcularIMC() == 1) {
                sobrepeso++;
            }
            if (pService[i].esMayorDeEdad()) {
                System.out.println(personas[i].getNombre() + " es mayor de edad");
                mayor++;
            } else {
                System.out.println(personas[i].getNombre() + " es menor de edad");
                menor++;
            }
        }

        if (delgado > 0) {
            if (delgado == 1) {
                System.out.println("Hay " + delgado + " persona con peso por debajo del ideal");
            } else {
                System.out.println("Hay " + delgado + " personas con peso por debajo del ideal");
            }
            System.out.println("El porcentaje de personas con peso por debajo del ideal es de: "
                    + (double) (delgado / personas.length * 100));
        }
        if (ideal > 0) {
            if (ideal == 1) {
                System.out.println("Hay " + ideal + " persona con peso ideal");
            } else {
                System.out.println("Hay " + ideal + " personas con peso ideal");
            }
            System.out.println(
                    "El porcentaje de personas con peso ideal es de: " + (double) ideal / personas.length * 100);
        }
        if (sobrepeso > 0) {
            if (sobrepeso == 1) {
                System.out.println("Hay " + sobrepeso + " persona con peso por encima del ideal");
            } else {
                System.out.println("Hay " + sobrepeso + " personas con peso por encima del ideal");
            }
            System.out.println(
                    "El porcentaje de personas con sobrepeso es de: " + (double) sobrepeso / personas.length * 100);
        }

        if (mayor > 0) {
            if (mayor == 1) {
                System.out.println("Hay " + mayor + " persona mayor de edad");
            } else {
                System.out.println("Hay " + mayor + " personas mayores de edad");
            }
            System.out.println("El porcentaje de personas mayores es de: " + (double) mayor / personas.length * 100);
        }
        if (menor > 0) {
            if (menor == 1) {
                System.out.println("Hay " + menor + " persona menor de edad");
            } else {
                System.out.println("Hay " + menor + " personas menores de edad");
            }
            System.out.println("El porcentaje de personas menores es de: " + (double) menor / personas.length * 100);
        }

        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
