package com.poo.Ejercicio6Extra.Servicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.poo.Ejercicio6Extra.Entidades.Ahorcado;

public class AhorcadoService {
    private Ahorcado a;
    Scanner scan = new Scanner(System.in);

    public AhorcadoService(Ahorcado a) {
        this.a = a;
    }

    public void crearJuego() {
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = scan.next();
        ArrayList<Character> palabraArray = new ArrayList<Character>();
        for (int i = 0; i < palabra.length(); i++) {
            palabraArray.add(palabra.charAt(i));
        }
        a.setLetras(palabraArray);
        System.out.println("Ingrese la cantidad de turnos");
        a.setJugadasMaximas(scan.nextInt());
        a.setCantidadLetrasEncontradas(0);
    }

    public int longitud() {
        return a.getLetras().size();
    }

    public boolean buscarLetra(char letra) {
        for (char i : a.getLetras()) {
            if (i == letra) {
                return true;
            }
        }
        return false;
    }

    public int encontradas(char letra) {
        if (buscarLetra(letra)) {
            int repetido = 0;
            for (char i : a.getLetras()) {
                if (i == letra) {
                    repetido++;
                }
            }
            return repetido;
        }
        return 0;
    }

    public void letrasEncontradas(char letra) {
        System.out.println("Longitud de la palabra: " + longitud());
        if (encontradas(letra) == 0) {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
            a.setJugadasMaximas(a.getJugadasMaximas() - 1);
        }
        if (encontradas(letra) > 0) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
            a.setCantidadLetrasEncontradas(a.getCantidadLetrasEncontradas() + encontradas(letra));
        }
        System.out.println("Numero de letras (encontradas, faltantes): (" + a.getCantidadLetrasEncontradas() + ","
                + (longitud() - a.getCantidadLetrasEncontradas()) + ")");
        System.out.println("Numero de oportunidades restantes: " + intentos());
    }

    public int intentos() {
        return a.getJugadasMaximas();
    }

    public boolean victoria() {
        if (a.getCantidadLetrasEncontradas() == longitud()) {
            return true;
        }
        return false;
    }

    public boolean derrota() {
        if (a.getJugadasMaximas() == 0 && a.getCantidadLetrasEncontradas() < longitud()) {
            return true;
        }
        return false;
    }

    public void juego() {
        crearJuego();
        while (!victoria() && !derrota()) {
            System.out.println("Ingrese una letra:");
            letrasEncontradas(scan.next().charAt(0));
        }
        if (victoria()) {
            System.out.println("Felicidades! Ha ganado!");
        }
        if (derrota()) {
            System.out.println("Lo sentimos! Ha perdido!");
        }
    }
}
