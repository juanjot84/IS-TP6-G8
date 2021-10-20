package com.isg8.tp6;

public class Producto {
    
    private String nombreProducto;
    private String descripcion;
    
    public Producto() {
        
    }
    
    public inicializarProducto() {
        this.nombreProducto = "Celular Samsung J7";
        this.descripcion = "El mejor celular";
    }
    
    public Producto(String nombreProducto, String descripcion) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean verificarDescripcionProducto(String descripcion) {
        if (this.descripcion.isEmpty() || this.descripcion.length()>255) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean verificarNombreProducto(String nombreProducto) {
        if(this.nombreProducto.isEmpty() || this.nombreProducto.length()>255) {
            return false;
        } else {
            return true;
        }
    }
    

    
}
