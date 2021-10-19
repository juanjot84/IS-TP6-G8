package com.isg8.tp6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {

    private String nombre;
    private String apellido;
    private String telefono;
    private String razonSocial;
    private int dni;
    private String situacionIva;
    private String email;
    private String password;

    public Usuario () {

    }

    public boolean login(String email, String password) {

        return true;
    }

    public String verificarEmail(String email) {
        String result;
        String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
                "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
        Pattern pattern = Pattern.compile(emailPattern);

        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            result = "Email valido";
        } else {
            result = "Email no valido";
        }
        return result;
    }

    public boolean verificarPassword(String password) {

        return true;
    }
}
