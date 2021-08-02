package com.poo.Servicios;

import java.util.Scanner;

import com.poo.Entidades.Cancion;

public class CancionService {
    private Cancion c;
    Scanner scan = new Scanner(System.in);

    public CancionService(Cancion c) {
        this.c = c;
    }

    public void crearCancion() {
        System.out.println("Ingrese el nombre de la cancion");
        c.setTitulo(scan.nextLine());
        System.out.println("Ingrese el autor de la cancion");
        c.setAutor(scan.nextLine());
    }

}
