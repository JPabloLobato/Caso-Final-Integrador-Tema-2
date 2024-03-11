package MainMenus;
import java.util.Scanner;
public class MenuVisitante {
    public static void menuVisitante() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bienvenido al Zoologico, escoja una opcion: ");
            System.out.println("1. Ver animales");
            System.out.println("2. Ir a un habitat");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Animales");
                    break;
                case 2:
                    System.out.println("Habitat");
                    break;
                case 3:
                    System.out.println("Gracias por visitar el zoologico");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
