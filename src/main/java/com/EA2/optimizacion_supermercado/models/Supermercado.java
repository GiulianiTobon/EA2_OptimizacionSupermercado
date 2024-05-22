
package com.EA2.optimizacion_supermercado.models;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Supermercado {
    public static void main(String[] args) {
        //Instanciamiento de las clases
        Cajera cajera1 = new Cajera("Cajera 1");
        Cajera cajera2 = new Cajera("Cajera 2");

        Cliente cliente1 = new Cliente("Cliente 1", crearCarritoCompra(), cajera1);
        Cliente cliente2 = new Cliente("Cliente 2", crearCarritoCompra(), cajera2);
        
        Thread hiloCliente1 = new Thread(cliente1);
        Thread hiloCliente2 = new Thread(cliente2);

        hiloCliente1.start();
        hiloCliente2.start();
    }
    
    //Creaciòn de los productos en el carrito
    
    private static Carrito crearCarritoCompra() {
        Carrito carrito = new Carrito();
        carrito.agregarProducto(new Producto("Leche", 2.5));
        carrito.agregarProducto(new Producto("Pan", 1.0));
        return carrito;
    }
}
