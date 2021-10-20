package com.isg8.tp6;

public class Producto {
    
    private String nombreProducto;
    private String descripcion;
    
    public Producto() {
        
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
    
    public String verificarDescripcionProducto(String descripcion) {
        String resultado;
        if (descripcion.isEmpty() || descripcion.length()>255) {
            return resultado = "Supera los caracteres o está vacio.";
        } else {
            return resultado = "Descripción asignada correctamente.";
        }
    }
    
    public String verificarNombreProducto(String nombreProducto) {
        String resultado;
        if(nombreProducto.isEmpty() || nombreProducto.length()>255) {
            resultado = ("Supera los caracteres o está vacio.");
        } else {
            resultado = ("Nombre asignado correctamente.");
        }
        
        return resultado;
    }
    

    
}
