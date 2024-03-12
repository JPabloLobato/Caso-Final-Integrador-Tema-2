package org.zoologico;

public class HabitatAviario extends Habitat {
    private int nivelNidos;

    public HabitatAviario() {
        super("Aviario");
        this.nivelNidos = 0;
    }

    public int getNivelNidos() {
        return nivelNidos;
    }

    public void setNivelNidos(int nivelNidos) {
        this.nivelNidos = nivelNidos;
    }
}
