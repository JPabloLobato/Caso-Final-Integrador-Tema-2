package org.zoologico;

public class HabitatZoo {
    public static void main(String[] args) {
        HabitatAcuatico acuatico = new HabitatAcuatico();
        acuatico.setNivelAgua(50);
        acuatico.monitorear();

        HabitatTerrestre terrestre = new HabitatTerrestre();
        terrestre.setNivelArboles(10);
        terrestre.monitorear();

        HabitatAviario aviario = new HabitatAviario();
        aviario.setNivelNidos(5);
        aviario.monitorear();
    }
}
