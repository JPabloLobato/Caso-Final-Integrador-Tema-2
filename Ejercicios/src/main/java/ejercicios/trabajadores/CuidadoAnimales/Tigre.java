package ejercicios.trabajadores.CuidadoAnimales;

import ejercicios.trabajadores.CuidadoAnimales.Animales;

public class Tigre extends Animales {
    private String longitudCola;

    public Tigre(String nombre, String longitudCola) {
        super(nombre, "Tigre");
        this.longitudCola = longitudCola;
    }

    public String getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(String longitudCola) {
        this.longitudCola = longitudCola;
    }
}