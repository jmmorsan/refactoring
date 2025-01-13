package refactoring;

import java.util.Scanner;

public class Ejercicio1 {
    /** Main method */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int numero;

        // Bucle que continúa hasta que el número introducido sea 0
        do {
            System.out.print("Introduce un número (introducir 0 terminara el programa): ");
            numero = sc.nextInt();

            if (numero != 0) {
                // Algunas funciones están dentro del mismo bloque, podrían ser extraídas.
                System.out.println("El número " + numero + " es par.");
                if (numero % 2 != 0) {
                    System.out.println("El número " + numero + " es impar.");
                }

                if (numero > 0) {
                    System.out.println("El número " + numero + " es positivo.");
                }

                // El cálculo del cuadrado podría ser extraído a una función.
                System.out.println("El cuadrado de " + numero + " es " + (numero * numero) + ".");
            }

        } while (numero != 0); // Se continuará hasta que se introduzca un 0

        System.out.println("Programa finalizado.");
        sc.close();
    }
}