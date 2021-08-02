package com.poo.Ejercicios;

import com.poo.Entidades.Cancion;
import com.poo.Servicios.CancionService;

public class Ejercicio1Extra {
    public static void main(String[] args) {
        Cancion c = new Cancion();
        CancionService s = new CancionService(c);

        s.crearCancion();
        System.out.println(c);
    }
}
