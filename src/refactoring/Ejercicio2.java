package refactoring;

import java.util.Scanner;

public class Ejercicio2 {
    /** Main method */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int edad;
        int sumaEdad = 0;
        int contadorAlumnos = 0;
        int contadorMayores18 = 0;

        // Bucle que continúa hasta que la edad sea negativa
        do {
            System.out.print("Introduce la edad de un alumno (si la edad es negativa, se para el programa): ");
            edad = sc.nextInt();

            if (edad >= 0) {
                sumaEdad += edad;
                contadorAlumnos++;
                if (edad >= 18) {
                    contadorMayores18++;
                }
            }

        } while (edad >= 0);

        System.out.println("La suma de edades es: " + sumaEdad);
        if (contadorAlumnos > 0) {
            double media = (double) sumaEdad / contadorAlumnos;
            System.out.println("La media de edad es: " + media);
        } else {
            System.out.println("No se han introducido edades suficientes.");
        }

        // Un método que muestra los resultados podría ser útil aquí
        System.out.println("Programa finalizado.");
        sc.close();
    }
}