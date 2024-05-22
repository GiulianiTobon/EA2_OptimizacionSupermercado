
package com.EA2.optimizacion_supermercado.models;

import java.util.ArrayList;
import java.util.List;


public class Carrito {
    
    private List<Producto> productos;

    //CONSTRUCTOR
    public Carrito() {
        this.productos = new ArrayList<>();
    }

    //METODOS
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
    

}
