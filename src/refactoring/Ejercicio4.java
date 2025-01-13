package refactoring;

import java.util.Scanner;

public class Ejercicio4 {
    /** Main method */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce el valor mínimo del rango: ");
        int min = sc.nextInt();

        System.out.print("Introduce el valor máximo del rango: ");
        int max = sc.nextInt();

        if (min >= max) {
            System.out.println("El valor mínimo debe ser menor que el valor máximo.");
        } else {
            // Un método que valide y obtenga el número podría ser útil
            int numero;
            do {
                System.out.print("Introduce un número entre [" + min + ", " + max + "]: ");
                numero = sc.nextInt();
            } while (numero < min || numero > max);
            System.out.println("¡El número " + numero + " está dentro del rango!");
        }

        sc.close();
    }
}