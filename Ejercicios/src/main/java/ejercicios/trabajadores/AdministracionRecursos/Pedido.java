package ejercicios.trabajadores.AdministracionRecursos;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private Map<String, Integer> pedido;

    public Pedido() {
        this.pedido = new HashMap<>();
    }

    public void agregarItem(String item, int cantidad) {
        int currentQuantity = pedido.getOrDefault(item, 0);
        pedido.put(item, currentQuantity + cantidad);
    }

    public void quitarItem(String item) {
        if (pedido.containsKey(item)) {
            pedido.remove(item);
        } else {
            System.out.println(item + " no se encuentra en el pedido.");
        }
    }

    public void mostrarPedido() {
        for (Map.Entry<String, Integer> entry : pedido.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }
    }
}