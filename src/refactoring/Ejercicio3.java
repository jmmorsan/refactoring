package refactoring;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    /** Main method */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int N = aleatorio.nextInt(100) + 1;
        int numero = 0;

        while (N != numero) {
            System.out.print("Introduzca un número: ");
            numero = sc.nextInt();

            if (numero <= 100 && numero > 0) {
                // El manejo de la pista puede mejorarse.
                if (numero > N) {
                    System.out.println("El número es más pequeño.");
                } else if (numero < N) {
                    System.out.println("El número es más grande.");
                }
            } else {
                System.out.println("Error, el número debe estar entre 1 y 100");
            }
        }

        System.out.println("¡Enhorabuena, el número es " + N + " !");
        sc.close();
    }
}