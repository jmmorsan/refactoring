package refactoring;

import java.util.Scanner;

public class Ejercicio1 {

	/** Método principal */
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int numero;

		// Bucle que continúa hasta que el número introducido sea 0
		do {
			System.out.print("Introduce un número (introducir 0 terminará el programa): ");
			numero = sc.nextInt();

			if (numero != 0) {
				mostrarInformacionNumero(numero);
			}

		} while (numero != 0);

		System.out.println("Programa finalizado.");
		sc.close();
	}

	public static void mostrarInformacionNumero(int numero) {
		if (esPar(numero)) {
			System.out.println("El número " + numero + " es par.");
		} else {
			System.out.println("El número " + numero + " es impar.");
		}

		if (esPositivo(numero)) {
			System.out.println("El número " + numero + " es positivo.");
		} else {
			System.out.println("El número " + numero + " es negativo.");
		}

		System.out.println("El cuadrado de " + numero + " es " + calcularCuadrado(numero) + ".");
	}

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

	public static boolean esPositivo(int numero) {
		return numero > 0;
	}

	public static int calcularCuadrado(int numero) {
		return numero * numero;
	}
}