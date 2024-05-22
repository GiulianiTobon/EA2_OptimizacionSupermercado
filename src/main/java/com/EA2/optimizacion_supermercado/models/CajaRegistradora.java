
package com.EA2.optimizacion_supermercado.models;


import com.EA2.optimizacion_supermercado.models.Carrito;
import com.EA2.optimizacion_supermercado.models.Producto;




public class CajaRegistradora {
    
    private static int cajeros = 3;
    
    public double cobrar(Carrito carrito) {
        double total = 0;
        for (Producto producto : carrito.getProductos()) {
            total += producto.getPrecio();
        }
        return total;
    }
}
