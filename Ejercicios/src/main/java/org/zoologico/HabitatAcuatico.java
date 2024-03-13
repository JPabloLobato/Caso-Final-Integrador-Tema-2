package org.zoologico;

public class HabitatAcuatico extends Habitat {

    private int nivelAgua;

    public HabitatAcuatico() {
        super("Acuatico");
        this.nivelAgua = 0;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }
}
