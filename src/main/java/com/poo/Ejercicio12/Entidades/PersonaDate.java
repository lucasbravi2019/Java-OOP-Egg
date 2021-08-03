package com.poo.Ejercicio12.Entidades;

import java.util.Date;

public class PersonaDate {
    private String nombre;
    private Date fecha;

    public PersonaDate() {
    }

    public PersonaDate(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "{\n   nombre: " + nombre + ",\n   fecha_nacimiento: " + fecha.getDate() + "/" + (fecha.getMonth() + 1)
                + "/" + (fecha.getYear() + 1900) + "\n}";
    }

}
