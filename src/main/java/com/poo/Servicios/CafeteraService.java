package com.poo.Servicios;

import java.util.Scanner;

import com.poo.Entidades.Cafetera;

public class CafeteraService {
    private Cafetera c;
    Scanner scan = new Scanner(System.in);

    public CafeteraService(Cafetera c) {
        this.c = c;
    }

    public void llenarCafetera() {
        if (c.getCapacidadMaxima() == 0) {
            System.out.println("Por favor especifique la capacidad maxima de la cafetera");
            c.setCapacidadMaxima(scan.nextInt());
        }
        c.setCantidadActual(c.getCapacidadMaxima());
        System.out.println("La cafetera ha sido llenada");
    }

    public void servirTaza(int taza) {
        if (c.getCantidadActual() < taza) {
            System.out.println("La taza no ha sido llenada, se sirvieron " + c.getCantidadActual() + " ml");
            c.setCantidadActual(0);
        } else {
            System.out.println("Su cafe esta listo");
            c.setCantidadActual(c.getCantidadActual() - taza);
        }
    }

    public void vaciarCafetera() {
        c.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada");
    }

    public void agregarCafe(int cafe) {
        if (c.getCapacidadMaxima() < (c.getCantidadActual() + cafe)) {
            System.out.println("La cafetera se rebalso! A limpiar!");
            c.setCantidadActual(c.getCapacidadMaxima());
        } else {
            c.setCantidadActual(c.getCantidadActual() + cafe);
            System.out.println("La cafetera dispone actualmente de " + c.getCantidadActual() + " ml");
        }
    }

}
