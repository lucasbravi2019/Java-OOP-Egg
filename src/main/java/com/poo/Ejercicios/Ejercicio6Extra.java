package com.poo.Ejercicios;

import com.poo.Entidades.Ahorcado;
import com.poo.Servicios.AhorcadoService;

public class Ejercicio6Extra {
    public static void main(String[] args) {
        Ahorcado a = new Ahorcado();
        AhorcadoService s = new AhorcadoService(a);

        System.out.println(a);

        s.juego();
        System.out.println(a);
    }
}
