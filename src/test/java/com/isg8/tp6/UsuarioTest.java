package com.isg8.tp6;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioTest {
    Usuario usuario;

    @BeforeAll
    public static void beforeAll() {

    }

    @AfterAll
    public static void afterAll() {

    }

    @AfterEach
    public void afterEach() {

    }

    @BeforeEach
    public void beforeEach() {
       usuario= new Usuario();
    }

    @Test
    @Order(1)
    public void testVerificarEmail() {

        String email = "jcarlos@gmail.com";
        String resultEsperado = "Email valido";
        String result;

        result = usuario.verificarEmail(email);

        Assertions.assertEquals(resultEsperado, result);
        System.out.println(result);
    }

    @Test
    @Order(2)
    public void testVerificarPassword() {


    }

    @Test
    @Order(3)
    public void testLogin() {


    }

}
