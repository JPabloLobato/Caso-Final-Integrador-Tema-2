package MainMenus;

import org.zoologico.Habitat;
import org.zoologico.HabitatAcuatico;
import org.zoologico.HabitatAviario;
import org.zoologico.HabitatTerrestre;
import org.zoologico.Animales;
import org.zoologico.Leon;
import org.zoologico.Elefante;
import org.zoologico.Tigre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuTrabajador {
    public static void menuTrabajador() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Habitat> habitats = new HashMap<>();
        habitats.put("Acuatico", new HabitatAcuatico());
        habitats.put("Aviario", new HabitatAviario());
        habitats.put("Terrestre", new HabitatTerrestre());
        Map<String, Animales> animales = new HashMap<>();
        animales.put("Simba", new Leon("Simba", "Grande"));
        animales.put("Lucas", new Elefante("Lucas", 5000));
        animales.put("Polo", new Tigre("Polo", "1"));

        while (true) {
            System.out.println("Bienvenido al Zoologico, escoja una opcion: ");
            System.out.println("1. Ir a un habitat");
            System.out.println("2. Cuidado de los animales");
            System.out.println("3. Recursos zoológico");
            System.out.println("4. Mantenimiento y Seguridad");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de hábitat:");
                    System.out.println("a. Acuatico");
                    System.out.println("b. Terrestre");
                    System.out.println("c. Aviario");

                    String tipoHabitat = scanner.nextLine();
                    String habitatKey = "";

                    switch (tipoHabitat) {
                        case "a":
                            habitatKey = "Acuatico";
                            break;
                        case "b":
                            habitatKey = "Terrestre";
                            break;
                        case "c":
                            habitatKey = "Aviario";
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }

                    Habitat habitatSeleccionado = habitats.get(habitatKey);
                    if (habitatSeleccionado != null) {
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Registrar condiciones del hábitat");
                        System.out.println("2. Mostrar condiciones del hábitat");

                        int opcionHabitat = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionHabitat) {
                            case 1:
                                System.out.println("Ingrese la temperatura: ");
                                double temperatura = scanner.nextDouble();
                                System.out.println("Ingrese la humedad: ");
                                double humedad = scanner.nextDouble();
                                System.out.println("Ingrese el estado de limpieza (true para limpio, false para sucio): ");
                                boolean limpio = scanner.nextBoolean();

                                habitatSeleccionado.setTemperatura(temperatura);
                                habitatSeleccionado.setHumedad(humedad);
                                habitatSeleccionado.setLimpio(limpio);
                                break;
                            case 2:
                                habitatSeleccionado.monitorear();
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                    } else {
                        System.out.println("Opción no válida");
                    }
                    break;
                case 2:
                    System.out.println("Has seleccionado Animales. Por favor, elige una opción:");
                    System.out.println("a. Registrar alimentación, comportamiento y salud");
                    System.out.println("b. Monitoreo de animales");

                    String opcionAnimales = scanner.nextLine();

                    switch (opcionAnimales) {
                        case "a":
                            System.out.println("Ingrese el nombre del animal (escriba Simba, Lucas, Polo):");
                            String nombreAnimal = scanner.nextLine();
                            Animales animalSeleccionado = animales.get(nombreAnimal);

                            if (animalSeleccionado != null) {
                                System.out.println("Ingrese el estado de alimentación:");
                                String alimentacion = scanner.nextLine();
                                animalSeleccionado.registrarAlimentacion(alimentacion);

                                System.out.println("Ingrese el estado de salud:");
                                String salud = scanner.nextLine();
                                animalSeleccionado.registrarSalud(salud);

                                System.out.println("Ingrese el estado de comportamiento:");
                                String comportamiento = scanner.nextLine();
                                animalSeleccionado.registrarComportamiento(comportamiento);
                            } else {
                                System.out.println("Animal no encontrado");
                            }
                            break;
                        case "b":
                            System.out.println("Ingrese el nombre del animal:");
                            nombreAnimal = scanner.nextLine();
                            animalSeleccionado = animales.get(nombreAnimal);

                            if (animalSeleccionado != null) {
                                System.out.println("Estado de alimentación: " + animalSeleccionado.getEstadoAlimentacion());
                                System.out.println("Estado de salud: " + animalSeleccionado.getEstadoSalud());
                                System.out.println("Estado de comportamiento: " + animalSeleccionado.getEstadoComportamiento());
                            } else {
                                System.out.println("Animal no encontrado");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                case 3:
                    // Código para recursos zoológico
                    break;
                case 4:
                    // Código para mantenimiento y seguridad
                    break;
                case 5:
                    System.out.println("Gracias por visitar el zoologico");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}