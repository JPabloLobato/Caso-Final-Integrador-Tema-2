package org.zoologico;

public abstract class Habitat {
    protected double temperatura;
    protected double humedad;
    protected boolean limpieza;

    public Habitat (double temperatura, double humedad, boolean limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }
public abstract void monitorearCondiciones();
}
class HabitatAcuatico extends Habitat {
    public HabitatAcuatico(double temperatura, double humedad, boolean limpieza) {
        super(temperatura, humedad, limpieza);
    }
    public void monitorearCondiciones() {
        System.out.println("Monitoreado las condiciones del habitat terrestre: ");
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + (limpieza ? "Limpio ":"Sucio "));
    }
}

class HabitatTerrestre extends Habitat {
    public HabitatTerrestre(double temperatura, double humedad, boolean limpieza) {
        super(temperatura, humedad, limpieza);
    }
    public void monitorearCondiciones() {
        System.out.println("Monitoreado las condiciones del habitat terrestre: ");
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + (limpieza ? "Limpio ":"Sucio "));
    }

}
class HabitatAviario extends Habitat {
    public HabitatAviario(double temperatura, double humedad, boolean limpieza) {
        super(temperatura, humedad, limpieza);
    }
    public void monitorearCondiciones() {
        System.out.println("Monitoreando las condiciones del hábitat aviario: ");
        System.out.println("Temperatura: " +temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + (limpieza ? "Limpio ":"Sucio "));
    }
}