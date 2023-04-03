package com.kreitek.pets;

public class ConsoleLogger {
    private static int contador = 0;

    public void debug(String message) {
        contador++;
        System.out.println("[debug][" + contador + "] - " + message);
    }
}
