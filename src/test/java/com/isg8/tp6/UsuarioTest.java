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
        usuario = new Usuario();
        usuario.inicializarValores();
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
    public void verificarSeguridadPassword() {
        String password = "3H03rt93GH";
        boolean result = usuario.verificarSeguridadPassword(password);
        System.out.println("Test_Verificar_Password_Pass: " + String.valueOf(result));
        Assertions.assertTrue(result);
    }

    @Test
    @Order(3)
    public void testLogin() {
        String email = "jcarlos@gmail.com";
        String password = "3H03rt93GH";
        boolean result = usuario.login(email, password);
        System.out.println("Test_Login_Pass: " + String.valueOf(result));
        Assertions.assertTrue(result);
    }

}
