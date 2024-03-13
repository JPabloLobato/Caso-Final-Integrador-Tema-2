package ejercicios.trabajadores.AdministracionRecursos;

import ejercicios.trabajadores.AdministracionRecursos.Inventario;
import ejercicios.trabajadores.AdministracionRecursos.Pedido;
import ejercicios.trabajadores.AdministracionRecursos.Proveedores;

public class ManejoRecursos {
    private Inventario inventario;
    private Pedido pedido;
    private Proveedores proveedores;

    public ManejoRecursos() {
        this.inventario = new Inventario();
        this.pedido = new Pedido();
        this.proveedores = new Proveedores("Proveedor Principal");
    }

    public void agregarAlInventario(String item, int cantidad) {
        inventario.agregarItem(item, cantidad);
    }

    public void quitarDelInventario(String item, int cantidad) {
        inventario.quitarItem(item, cantidad);
    }

    public void mostrarInventario() {
        inventario.mostrarInventario();
    }

    public void agregarAlPedido(String item, int cantidad) {
        pedido.agregarItem(item, cantidad);
    }

    public void quitarDelPedido(String item) {
        pedido.quitarItem(item);
    }

    public void mostrarPedido() {
        pedido.mostrarPedido();
    }

    public void agregarProductoProveedor(String producto) {
        proveedores.agregarProducto(producto);
    }

    public void quitarProductoProveedor(String producto) {
        proveedores.quitarProducto(producto);
    }

    public void mostrarProductosProveedor() {
        proveedores.mostrarProductos();
    }
}