package com.poo.Ejercicio1Extra.Entidades;

public class Cancion {
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "{\n   titulo: " + titulo + ",\n   autor: " + autor + "\n}";
    }

}
