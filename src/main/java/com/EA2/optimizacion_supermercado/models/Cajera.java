
package com.EA2.optimizacion_supermercado.models;


class Cajera extends Thread {
    
    private String nombre;

    //CONSTRUCTOR
    public Cajera(String nombre) {
        this.nombre = nombre;
    }
    
    //METODOS
    public void procesarCompra(Cliente cliente) {
        System.out.println("Cajera " + nombre + " está procesando la compra de " + cliente.getNombre());

        Carrito carrito = cliente.getCarrito();

        for (Producto producto : carrito.getProductos()) {
            System.out.println("Procesando " + producto.getNombre() + " - Tiempo: " + calcularTiempoProcesamiento(producto.getPrecio()));
        }

        System.out.println("Total de la compra: $" + carrito.calcularTotal());
    }
    
    private double calcularTiempoProcesamiento(double precio) {
        // Simulación de tiempo de procesamiento basado en el precio del producto
        return precio * 0.1; // Puedes ajustar este valor según tus necesidades
    }
    
}
    

