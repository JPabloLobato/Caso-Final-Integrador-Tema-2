package org.zoologico;

import java.util.ArrayList;
import java.util.List;

public class Proveedores {
    private String nombre;
    private List<String> productos;

    public Proveedores(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(String producto) {
        productos.add(producto);
    }

    public void quitarProducto(String producto) {
        productos.remove(producto);
    }

    public void mostrarProductos() {
        System.out.println("Proveedor: " + nombre);
        for (String producto : productos) {
            System.out.println("Producto: " + producto);
        }
    }
}