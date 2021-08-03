package com.poo.Ejercicio2Extra;

import com.poo.Ejercicio2Extra.Entidades.Puntos;
import com.poo.Ejercicio2Extra.Servicios.PuntosService;

public class Ejercicio2Extra {
    public static void main(String[] args) {
        Puntos p = new Puntos();
        PuntosService s = new PuntosService(p);

        s.crearPuntos();
        System.out.println(s.calcularDistancia());
        System.out.println(p);
    }
}
