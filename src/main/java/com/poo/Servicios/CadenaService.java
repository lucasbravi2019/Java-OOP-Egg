package com.poo.Servicios;

import java.util.Scanner;

import com.poo.Entidades.Cadena;

public class CadenaService {
    private Cadena c;
    Scanner scan = new Scanner(System.in);

    public CadenaService(Cadena c) {
        this.c = c;
    }

    public void crearFrase() {
        System.out.println("Ingrese una palabra o frase");
        c.setFrase(scan.nextLine());
        c.setLongitud(c.getFrase().length());
    }

    public void mostrarVocales() {
        int vocales = 0;

        for (int i = 0; i < c.getLongitud(); i++) {
            char letra = c.getFrase().toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales de la palabra es de: " + vocales);
    }

    public void invertirFrase() {
        String fraseInvertida = "";
        System.out.println(c.getFrase());
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += String.valueOf(c.getFrase().charAt(i));
        }
        System.out.println("La frase invertida es:");
        System.out.println(fraseInvertida);
    }

    public int vecesRepetido(char letra) {
        int repetido = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().toLowerCase().charAt(i) == letra) {
                repetido++;
            }
        }
        return repetido;
    }

    public void compararLongitud(String frase) {
        if (c.getLongitud() > frase.length()) {
            System.out.println("La frase " + c.getFrase() + " es mas larga");
            System.out.println("La frase " + frase + " es mas corta");
        } else if (c.getLongitud() == frase.length()) {
            System.out.println("Ambas frases tienen la misma longitud");
        } else {
            System.out.println("La frase " + frase + " es mas larga");
            System.out.println("La frase " + c.getFrase() + " es mas corta");
        }
    }

    public String unirFrases(String frase) {
        return c.getFrase() + " " + frase;
    }

    public void reemplazar(char simbolo) {
        String nuevaFrase = "";
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().toLowerCase().charAt(i) == 'a') {
                nuevaFrase += simbolo;
            } else {
                nuevaFrase += String.valueOf(c.getFrase().charAt(i));
            }
        }
        System.out.println("La nueva frase es: " + nuevaFrase);
    }

    public boolean contiene(char letra) {
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().toLowerCase().charAt(i) == letra) {
                return true;
            }
        }
        return false;
    }
}
