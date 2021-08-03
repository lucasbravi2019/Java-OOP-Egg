package com.poo.Ejercicio1.Servicios;

import java.util.Scanner;

import com.poo.Ejercicio1.Entidades.Libro;

public class LibroService {

    private Libro l;
    Scanner scan = new Scanner(System.in);

    public LibroService(Libro l) {
        this.l = l;
    }

    public void crearLibro() {
        System.out.println("Ingrese el isbn");
        l.setIsbn(scan.nextLine());
        System.out.println("Ingrese el titulo");
        l.setTitulo(scan.nextLine());
        System.out.println("Ingrese el autor");
        l.setAutor(scan.nextLine());
        System.out.println("Ingrese el numero de paginas");
        l.setNumeroPaginas(scan.nextInt());
    }

}
