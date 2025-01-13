package refactoring;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce un número (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, introduce un número positivo mayor que 0.");
        } else {
            // Aquí podría extraerse la lógica de contar en un método separado
            System.out.println("Contando desde 1 hasta " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
