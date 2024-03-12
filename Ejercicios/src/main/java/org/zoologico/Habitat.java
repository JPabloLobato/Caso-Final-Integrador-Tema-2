package org.zoologico;

public class Habitat {
    private String tipo;
    private double temperatura;
    private double humedad;
    private boolean limpio;

    public Habitat(String tipo) {
        this.tipo = tipo;
        this.temperatura = 0;
        this.humedad = 0;
        this.limpio = true;
    }

    public void monitorear() {
        System.out.println("Monitoreando habitat " + tipo + ":");
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + (limpio ? "Limpio" : "Sucio"));
    }
}

