package com.poo.Ejercicio1Extra;

import com.poo.Ejercicio1Extra.Entidades.Cancion;
import com.poo.Ejercicio1Extra.Servicios.CancionService;

public class Ejercicio1Extra {
    public static void main(String[] args) {
        Cancion c = new Cancion();
        CancionService s = new CancionService(c);

        s.crearCancion();
        System.out.println(c);
    }
}
