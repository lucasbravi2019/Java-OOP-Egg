package com.poo.Ejercicio3Extra.Entidades;

public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "{\n   a: " + a + ",\n   b: " + b + ",\n   c: " + c + "\n}";
    }

}
