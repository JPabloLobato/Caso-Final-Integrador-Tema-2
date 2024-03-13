package MainMenus;
import java.util.Scanner;
public class MenuPrincipal {
    //menu principal, que lleva a los menus trabajador o visitante
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.println("Bienvenido al Zoologico, escoja una opcion: ");
            System.out.println("1. Trabajador");
            System.out.println("2. Visitante");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    MenuTrabajador.menuTrabajador();
                    break;
                case 2:
                    MenuVisitante.menuVisitante();
                    break;
                case 3:
                    System.out.println("Gracias por visitar el zoologico");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            // Puedes mover el break aquí para salir del bucle después de procesar la opción
            if (opcion == 3) {
                break;
            }
        }
    }
}
