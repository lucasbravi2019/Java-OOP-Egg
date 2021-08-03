package com.poo.Ejercicio5.Entidades;

public class Cuenta {
    private long dni;
    private int numeroCuenta;
    private double saldo;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(long dni, int numeroCuenta, double saldo, double interes) {
        this.dni = dni;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return this.interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "{\n   numero_cuenta: " + numeroCuenta + ",\n   dni: " + dni + ",\n   saldo: " + saldo
                + ",\n   interes: " + interes + " \n}";
    }
}
