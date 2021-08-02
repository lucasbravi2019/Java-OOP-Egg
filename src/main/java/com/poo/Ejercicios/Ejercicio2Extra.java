package com.poo.Ejercicios;

import com.poo.Entidades.Puntos;
import com.poo.Servicios.PuntosService;

public class Ejercicio2Extra {
    public static void main(String[] args) {
        Puntos p = new Puntos();
        PuntosService s = new PuntosService(p);

        s.crearPuntos();
        System.out.println(s.calcularDistancia());
        System.out.println(p);
    }
}
