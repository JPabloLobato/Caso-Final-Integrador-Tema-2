package ejercicios.trabajadores.GestionHabitats;

import ejercicios.trabajadores.GestionHabitats.Habitat;

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
