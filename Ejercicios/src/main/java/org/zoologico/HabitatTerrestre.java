package org.zoologico;

public class HabitatTerrestre extends Habitat {
    private int nivelArboles;

    public HabitatTerrestre() {
        super("Terrestre");
        this.nivelArboles = 0;
    }

    public int getNivelArboles() {
        return nivelArboles;
    }

    public void setNivelArboles(int nivelArboles) {
        this.nivelArboles = nivelArboles;
    }
}
