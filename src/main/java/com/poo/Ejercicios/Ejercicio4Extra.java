package com.poo.Ejercicios;

import com.poo.Entidades.Nif;
import com.poo.Servicios.NifService;

public class Ejercicio4Extra {
    public static void main(String[] args) {
        Nif n = new Nif();
        NifService s = new NifService(n);

        s.crearNif();
        s.mostrar();

        System.out.println(n);
    }
}
