package ejercicios.trabajadores.AdministracionRecursos;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Integer> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }

    public void agregarItem(String item, int cantidad) {
        int currentQuantity = inventario.getOrDefault(item, 0);
        inventario.put(item, currentQuantity + cantidad);
    }

    public void quitarItem(String item, int cantidad) {
        if (inventario.containsKey(item)) {
            int currentQuantity = inventario.get(item);
            if (currentQuantity >= cantidad) {
                inventario.put(item, currentQuantity - cantidad);
            } else {
                System.out.println("No hay suficientes " + item + " en el inventario.");
            }
        } else {
            System.out.println(item + " no se encuentra en el inventario.");
        }
    }

    public void mostrarInventario() {
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }
    }
}