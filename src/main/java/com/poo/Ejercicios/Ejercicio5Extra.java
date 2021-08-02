package com.poo.Ejercicios;

import com.poo.Entidades.MesSecreto;
import com.poo.Servicios.MesSecretoService;

public class Ejercicio5Extra {
    public static void main(String[] args) {
        MesSecreto m = new MesSecreto();
        MesSecretoService s = new MesSecretoService(m);

        s.preguntarMes();
        System.out.println(m);
    }
}
