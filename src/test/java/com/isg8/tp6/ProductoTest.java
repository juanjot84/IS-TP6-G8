package com.isg8.tp6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;

public class ProductoTest {
    
    private Producto producto;
    
    public ProductoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        producto = new Producto();
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    @Order(1)
    public void testVerificarNombreProducto() {
        String nombre = "Impresora HP";
        String resultado;
        String esperado = "Nombre asignado correctamente.";
        resultado = producto.verificarNombreProducto(nombre);
        Assertions.assertEquals(esperado,resultado);
        System.out.println("Test_Verificar_Nombre_Producto: "+resultado);
    }
    
    @Test
    @Order(2)
    public void testVerificarDescripcionProducto() {
        String descripcion = "Esta es la descripción de la Impresora HP.";
        String esperado = "Descripción asignada correctamente.";
        String resultado = producto.verificarDescripcionProducto(descripcion);
        Assertions.assertEquals(esperado,resultado);
        System.out.println("Test_Verificar_Descripcion_Producto: "+resultado);
    }  
}
