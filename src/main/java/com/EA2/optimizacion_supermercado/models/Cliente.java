
package com.EA2.optimizacion_supermercado.models;

import java.util.Random;
import java.util.concurrent.TimeUnit;


class Cliente implements Runnable {
    private String nombre;
    private Carrito carrito;
    private Cajera cajera;

    public Cliente(String nombre, Carrito carrito, Cajera cajera) {
        this.nombre = nombre;
        this.carrito = carrito;
        this.cajera = cajera;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    
    //METODO RUN PARA APLICACIÒN DEL RUNNABLE
    @Override
    public void run() {
        cajera.procesarCompra(this);
    }

    public Carrito getCarrito() {
        return carrito;
    }
}
     

