package MainMenus;

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
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ir a un habitat");
                    break;
                case 2:
                    System.out.println("Montioreo de animales");
                    break;
                case 3:
                    System.out.println("Recursos zoológico");
                    break;
                case 4:
                    System.out.println("Mantenimiento y Seguridad");
                    break;
                case 5:
                    System.out.println("Gracias por visitar el zoologico");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
