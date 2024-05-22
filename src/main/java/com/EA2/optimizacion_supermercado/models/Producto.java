
package com.EA2.optimizacion_supermercado.models;



public class Producto {
    
    //ATRIBUTOS
    private String nombre;
    private double precio;
    private int presentacion;
    private int cantidadEnStock;
    
    //CONSTRUCTORES

    public Producto(String nombre, double precio, int presentacion, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.presentacion = presentacion;
        this.cantidadEnStock = cantidadEnStock;
    }
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public int getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(int presentacion) {
        this.presentacion = presentacion;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
    

    //METODOS

    
}

