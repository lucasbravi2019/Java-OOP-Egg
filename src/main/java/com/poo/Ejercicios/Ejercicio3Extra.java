package com.poo.Ejercicios;

import com.poo.Entidades.Raices;
import com.poo.Servicios.RaicesService;

public class Ejercicio3Extra {
    public static void main(String[] args) {
        Raices r = new Raices();
        RaicesService s = new RaicesService(r);

        s.crearCoeficientes();
        s.calcular();
        System.out.println(r);
    }
}
