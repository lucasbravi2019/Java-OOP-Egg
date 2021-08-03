package com.poo.Ejercicio5Extra;

import com.poo.Ejercicio5Extra.Entidades.MesSecreto;
import com.poo.Ejercicio5Extra.Servicios.MesSecretoService;

public class Ejercicio5Extra {
    public static void main(String[] args) {
        MesSecreto m = new MesSecreto();
        MesSecretoService s = new MesSecretoService(m);

        s.preguntarMes();
        System.out.println(m);
    }
}
