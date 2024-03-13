package org.visitantes;
import org.zoologico.Habitat;
import org.zoologico.Animales;
import java.util.Scanner;

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

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Quiosco, escoja una opcion: ");
        System.out.println("1. Ver información de un animal");
        System.out.println("2. Ver información de un hábitat");
        System.out.println("3. Salir");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Contamos con un elefante llamado Lucas, un tigre llamado Polo y un león llamado Simba.");
                break;
            case 2:
                System.out.println("A tan solo 100 metros a la derecha encontrar el habitat acuatico, a tan solo 50 metros al frente encontrara el habitat aviario y a 300m a la izquierda el habitat terrestre.");
                break;
            case 3:
                System.out.println("Gracias por visitar el quiosco");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}