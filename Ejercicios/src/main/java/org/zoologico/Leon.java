package org.zoologico;

public class Leon extends Animales {
    private String tamañoMelena;

    public Leon(String nombre, String tamañoMelena) {
        super(nombre, "Leon");
        this.tamañoMelena = tamañoMelena;
    }

    public String getTamañoMelena() {
        return tamañoMelena;
    }

    public void setTamañoMelena(String tamañoMelena) {
        this.tamañoMelena = tamañoMelena;
    }
}