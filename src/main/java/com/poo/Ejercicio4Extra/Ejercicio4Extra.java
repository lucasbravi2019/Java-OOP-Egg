package com.poo.Ejercicio4Extra;

import com.poo.Ejercicio4Extra.Entidades.Nif;
import com.poo.Ejercicio4Extra.Servicios.NifService;

public class Ejercicio4Extra {
    public static void main(String[] args) {
        Nif n = new Nif();
        NifService s = new NifService(n);

        s.crearNif();
        s.mostrar();

        System.out.println(n);
    }
}
