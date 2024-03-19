package java2;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Crear una matriz 4x4

        int[][] matriz = new int[4][4];

        // Solicitar al usuario que ingrese números para la matriz //
        System.out.println("Ingrese los números en la matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Solicitar al usuario que ingrese los números para cada posición de la matriz //
                System.out.println("Ingrese el número para la posición (" + i + ", " + j + "):");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Imprimir la matriz ingresada
        System.out.println("\nLa matriz ingresada es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Imprimir cada elemento de la matriz separado por una tabulación //
                System.out.print(matriz[i][j] + "\t");
            }
            // Imprimir una nueva línea al final de cada fila //
            System.out.println();
        }
    
        scanner.close();
    }
}
