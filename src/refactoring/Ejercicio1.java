package refactoring;

import java.util.Scanner;

public class Ejercicio1 {
    /** Main method */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número (introducir 0 terminará el programa): ");
            numero = sc.nextInt();

            if (numero != 0) {
                procesarNumero(numero);
            }

        } while (numero != 0); // Continuar hasta que se introduzca un 0

        System.out.println("Programa finalizado.");
        sc.close();
    }

    /** Procesa un número y muestra sus propiedades */
    public static void procesarNumero(int numero) {
        System.out.println("El número " + numero + (esPar(numero) ? " es par." : " es impar."));
        System.out.println("El número " + numero + (numero > 0 ? " es positivo." : " es negativo."));
        System.out.println("El cuadrado de " + numero + " es " + calcularCuadrado(numero) + ".");
    }

    /** Comprueba si un número es par */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    /** Calcula el cuadrado de un número */
    public static int calcularCuadrado(int numero) {
        return numero * numero;
    }
}