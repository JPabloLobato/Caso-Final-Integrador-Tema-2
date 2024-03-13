package MainMenus;
import org.visitantes.GuiaVirtual;
import org.visitantes.Quiosco;

import java.util.Scanner;
public class MenuVisitante {
    public static void menuVisitante() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bienvenido al Zoologico, escoja una opcion: ");
            System.out.println("1. Realizar un tour");
            System.out.println("2. Visitar un quiosco");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tipo de tour que desea realizar (para niños, aves, mamiferos): ");
                    System.out.println("1. Realizar un tour para niños");
                    System.out.println("2. Realizar un tour para aficionados a las aves");
                    System.out.println("3. Realizar un tour para amantes de los mamíferos");
                    System.out.println("4. Salir")
                    int opcion = scanner.nextInt();
                    scanner.nextLine();
                    Interes interes;
                    switch (opcion) {
                        case 1:
                            interes = new InteresNinos();
                            guiavirtual(interes);
                            break;
                        case 2:
                            interes = new InteresAves();
                            guiavirtual(interes);
                            break;
                        case 3:
                            interes = new InteresMamiferos();
                            guiavirtual(interes);
                            break;
                        case 4:
                            System.out.println("Gracias por visitar el zoologico");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                case 2:
                    Quiosco quiosco = new Quiosco();
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
