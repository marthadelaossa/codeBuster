package com.codebuster.www.utils;


import com.github.javafaker.Faker;

import java.util.Locale;

public class Datos {

    static Faker faker = new Faker(new Locale("es-MX"));

    private String nombre;
    private String apellido;
   private String correo;
    private String contrasenha;






    public Datos() {

        this.nombre = faker.name().firstName();
        this.apellido = faker.name().lastName();
        this.correo = faker.internet().emailAddress();
        this.contrasenha = faker.internet().password(3,4,true,true,true);

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public String getContrasenha(){
        return contrasenha;
    }
}


