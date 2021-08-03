package com.poo.Ejercicio6Extra;

import com.poo.Ejercicio6Extra.Entidades.Ahorcado;
import com.poo.Ejercicio6Extra.Servicios.AhorcadoService;

public class Ejercicio6Extra {
    public static void main(String[] args) {
        Ahorcado a = new Ahorcado();
        AhorcadoService s = new AhorcadoService(a);

        System.out.println(a);

        s.juego();
        System.out.println(a);
    }
}
