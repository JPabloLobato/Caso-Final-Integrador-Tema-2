package MainMenus;

import org.zoologico.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.zoologico.Pedido;
import org.zoologico.ManejoRecursos;
import org.zoologico.Inventario;
import org.zoologico.Proveedores;
import org.zoologico.Mantenimiento;
import org.zoologico.Seguridad;
import org.zoologico.Tarea;
import org.zoologico.Eventos;

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
                    ManejoRecursos manejoRecursos = new ManejoRecursos();
                    System.out.println("Bienvenido a la administración de recursos, escoja una opción: ");
                    System.out.println("1. Agregar pedido.");
                    System.out.println("2. Quitar pedido.");
                    System.out.println("3. Mostrar pedido.");
                    System.out.println("4. Agregar al inventario.");
                    System.out.println("5. Quitar del inventario.");
                    System.out.println("6. Mostrar inventario.");
                    System.out.println("7. Agregar producto al proveedor.");
                    System.out.println("8. Quitar producto al proveedor.");
                    System.out.println("9. Mostrar productos del proveedor.");
                    System.out.println("10. Agregar alimento, medicina o equipamiento.");
                    System.out.println("11. Quitar alimento, medicina o equipamiento.");
                    System.out.println("12. Mostrar alimento, medicina o equipamiento.");
                    int opcionRecursos = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcionRecursos) {
                        case 1:
                            System.out.println("Ingrese el nombre del item:");
                            String nombreItem = scanner.nextLine();
                            System.out.println("Ingrese la cantidad del item:");
                            int cantidadItem = scanner.nextInt();
                            scanner.nextLine(); // consume the newline
                            manejoRecursos.agregarAlPedido(nombreItem, cantidadItem);
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del item:");
                            nombreItem = scanner.nextLine();
                            manejoRecursos.quitarDelPedido(nombreItem);
                            break;
                        case 3:
                            manejoRecursos.mostrarPedido();
                            break;
                        case 4:
                            System.out.println("Ingrese el nombre del item:");
                            nombreItem = scanner.nextLine();
                            System.out.println("Ingrese la cantidad del item:");
                            cantidadItem = scanner.nextInt();
                            scanner.nextLine(); // consume the newline
                            manejoRecursos.agregarAlInventario(nombreItem, cantidadItem);
                            break;
                        case 5:
                            System.out.println("Ingrese el nombre del item:");
                            nombreItem = scanner.nextLine();
                            manejoRecursos.quitarDelInventario(nombreItem, cantidadItem);
                            break;
                        case 6:
                            manejoRecursos.mostrarInventario();
                            break;
                        case 7:
                            System.out.println("Ingrese el nombre del producto:");
                            String nombreProducto = scanner.nextLine();
                            manejoRecursos.agregarProductoProveedor(nombreProducto);
                            break;
                        case 8:
                            System.out.println("Ingrese el nombre del producto:");
                            nombreProducto = scanner.nextLine();
                            manejoRecursos.quitarProductoProveedor(nombreProducto);
                            break;
                        case 9:
                            manejoRecursos.mostrarProductosProveedor();
                            break;
                        case 10:
                            System.out.println("Ingrese el nombre del recurso:");
                            String nombreRecurso = scanner.nextLine();
                            System.out.println("Ingrese la cantidad del recurso:");
                            int cantidadRecurso = scanner.nextInt();
                            scanner.nextLine(); // consume the newline
                            manejoRecursos.agregarAlInventario(nombreRecurso, cantidadRecurso);
                            break;
                        case 11:
                            System.out.println("Ingrese el nombre del recurso:");
                            nombreRecurso = scanner.nextLine();
                            manejoRecursos.quitarDelInventario(nombreRecurso, cantidadRecurso);
                            break;
                        case 12:
                            manejoRecursos.mostrarInventario();
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                case 4:
                    Mantenimiento mantenimiento = new Mantenimiento();
                    Seguridad seguridad = new Seguridad();
                    System.out.println("Bienvenido a Mantenimiento y Seguridad, escoja una opción: ");
                    System.out.println("1. Programar mantenimiento.");
                    System.out.println("2. Marcar mantenimiento como completado.");
                    System.out.println("3. Mostrar tareas de mantenimiento.");
                    System.out.println("4. Registrar evento de seguridad.");
                    System.out.println("5. Mostrar eventos de seguridad.");
                    int opcionMantenimientoSeguridad = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcionMantenimientoSeguridad) {
                        case 1:
                            System.out.println("Ingrese la descripción de la tarea:");
                            String descripcion = scanner.nextLine();
                            System.out.println("Ingrese la fecha de la tarea:");
                            String fecha = scanner.nextLine();
                            mantenimiento.agregarTarea(new Tarea(descripcion, fecha));
                            break;
                        case 2:
                            System.out.println("Ingrese la descripción de la tarea completada:");
                            descripcion = scanner.nextLine();
                            mantenimiento.completarTarea(descripcion);
                            break;
                        case 3:
                            mantenimiento.mostrarTareas();
                            break;
                        case 4:
                            System.out.println("Ingrese la descripción del evento de seguridad:");
                            descripcion = scanner.nextLine();
                            System.out.println("Ingrese la ubicación del evento:");
                            String ubicacion = scanner.nextLine();
                            System.out.println("Ingrese la hora del evento:");
                            String hora = scanner.nextLine();
                            seguridad.agregarEvento(new Eventos(descripcion, ubicacion, hora));
                            break;
                        case 5:
                            seguridad.mostrarEventos();
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
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