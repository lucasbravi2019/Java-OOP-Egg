package com.poo.Ejercicio3Extra;

import com.poo.Ejercicio3Extra.Entidades.Raices;
import com.poo.Ejercicio3Extra.Servicios.RaicesService;

public class Ejercicio3Extra {
    public static void main(String[] args) {
        Raices r = new Raices();
        RaicesService s = new RaicesService(r);

        s.crearCoeficientes();
        s.calcular();
        System.out.println(r);
    }
}
