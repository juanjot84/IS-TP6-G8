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
        System.out.println("Test_Verificar_Email: "+result);
    }
    
    @Test
    @Order(2)
    public void testVerificarNumeroTelefonico() {
        String numTel = "+54-261-5052369";
        boolean result;
        result = usuario.verificarNumeroTelefonico(numTel);
        Assertions.assertTrue(result);
        System.out.println("Test_Verificar_Teléfono: "+result);
    }

    @Test
    @Order(3)
    public void verificarSeguridadPassword() {
        String password = "3H03rt93GH";
        boolean result = usuario.verificarSeguridadPassword(password);
        System.out.println("Test_Verificar_Password_Pass: " + String.valueOf(result));
        Assertions.assertTrue(result);
    }

    @Test
    @Order(4)
    public void testLogin() {
        String email = "jcarlos@gmail.com";
        String password = "3H03rt93GH";
        boolean result = usuario.login(email, password);
        System.out.println("Test_Login_Pass: " + String.valueOf(result));
        Assertions.assertTrue(result);
    }
    @Test
    @Order(5)
    public void testVerificarClaveDistintaVacio(){
        String password = "1234";
        String result = usuario.verificarClaveDistintaVacio(password);
        String resultEsperado "la contrasenia es correcta";
        Assertions.assertTrue(resultEsperado,result);
    }
}
