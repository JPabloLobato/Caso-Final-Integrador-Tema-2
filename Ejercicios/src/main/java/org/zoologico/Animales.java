package org.zoologico;

public class Animales {
    private String nombre;
    private String especie;
    private String estadoSalud;
    private String estadoAlimentacion;
    private String estadoComportamiento;

    public Animales(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public void registrarAlimentacion(String estadoAlimentacion) {
        this.estadoAlimentacion = estadoAlimentacion;
    }

    public void registrarSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public void registrarComportamiento(String estadoComportamiento) {
        this.estadoComportamiento = estadoComportamiento;
    }

    public String getEstadoAlimentacion() {
        return estadoAlimentacion;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public String getEstadoComportamiento() {
        return estadoComportamiento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
}