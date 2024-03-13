package com.codebuster.www.utils;

import java.io.IOException;

public class Espera {

    public static void esperar(int segundos) throws InterruptedException {
        Thread.sleep(segundos * 1000L);
    }
}
