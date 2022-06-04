package com.sofka;


/**
 * Descripcio: Ejercicio5. Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa unbucle while.
 * * @author Daniel Felipe Marin
 * v1.0
 */

import java.util.logging.Logger;

public class ExerciseFive {

    public static void main(String[] args) {

        Logger log = Logger.getLogger("Mensaje");
        log.info("Bienvenid@ al programa que muestra los números pares e impares entre 1 y 100\n ");

        int numberValue = 1;
        while (numberValue <= 100) {
            if (numberValue % 2 == 0) {
                System.out.println("El numero " + numberValue + " es par");
            } else if (numberValue % 2 != 0)
                System.out.println("El numero " + numberValue + " es impar");

            numberValue++;
        }
    }
}
