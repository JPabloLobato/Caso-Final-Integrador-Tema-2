package MainMenus;

import org.zoologico.HabitatAcuatico;
import org.zoologico.HabitatAviario;
import org.zoologico.HabitatTerrestre;

import java.util.Scanner;

public class MenuTrabajador {
    public static void menuTrabajador() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bienvenido al Zoologico, escoja una opcion: ");
            System.out.println("1. Ir a un habitat");
            System.out.println("2. Monitoreo de animales");
            System.out.println("3. Recursos zoológico");
            System.out.println("4. Mantenimiento y Seguridad");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de hábitat:");
                    System.out.println("a. Acuático");
                    System.out.println("b. Terrestre");
                    System.out.println("c. Aviario");

                    char tipoHabitat = scanner.next().charAt(0);

                    switch (tipoHabitat) {
                        case 'a':
                            HabitatAcuatico acuatico = new HabitatAcuatico();
                            acuatico.monitorear();
                            break;
                        case 'b':
                            HabitatTerrestre terrestre = new HabitatTerrestre();
                            terrestre.monitorear();
                            break;
                        case 'c':
                            HabitatAviario aviario = new HabitatAviario();
                            aviario.monitorear();
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Monitoreo de animales");
                    break;
                case 3:
                    System.out.println("Recursos zoológico");
                    break;
                case 4:
                    System.out.println("Mantenimiento y Seguridad");
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
