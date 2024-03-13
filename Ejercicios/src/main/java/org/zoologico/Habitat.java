package org.zoologico;

public class Habitat {
    protected double temperatura;
    protected double humedad;
    protected boolean limpio;
    private String tipo;

    public Habitat(String tipo) {
        this.tipo = tipo;
        this.temperatura = 0;
        this.humedad = 0;
        this.limpio = true;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public void setLimpio(boolean limpio) {
        this.limpio = limpio;
    }

    public void monitorear() {
        System.out.println("Monitoreando habitat " + tipo + ":");
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + (limpio ? "Limpio" : "Sucio"));
    }
}