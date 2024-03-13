package ejercicios.trabajadores.CuidadoAnimales;

import ejercicios.trabajadores.CuidadoAnimales.Animales;

public class Elefante extends Animales {
    private int peso;

    public Elefante(String nombre, int peso) {
        super(nombre, "Elefante");
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}