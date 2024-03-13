package org.visitantes;
import org.zoologico.Habitat;
import org.zoologico.Animales;
public class Quiosco {
    public void mostrarInformacion(Animales animal) {
        System.out.println("Nombre del animal: " + animal.getNombre());
        System.out.println("Especie: " + animal.getEspecie());
        System.out.println("Estado de salud: " + animal.getEstadoSalud());
        System.out.println("Estado de alimentación: " + animal.getEstadoAlimentacion());
        System.out.println("Estado de comportamiento: " + animal.getEstadoComportamiento());

    }
    public void mostrarInformacion(Habitat habitat) {
        System.out.println("Nombre del hábitat: " + habitat.getNombre());
        System.out.println("Tipo de hábitat: " + habitat.getTipo());
    }

}
