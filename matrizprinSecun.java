import java.util.Scanner;

public class matrizprinSecun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Crear una matriz 4x4 // 
        int[][] matriz = new int[4][4];

        // Paso 2: Llenar la matriz con valores ingresados por el usuario //
        System.out.println("Ingrese los valores para llenar la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Paso 3: Mostrar la matriz resultante
        System.out.println("Matriz resultante:");
        mostrarMatriz(matriz);

        // Paso 4: Mostrar la diagonal principal de la matriz
        System.out.println("Diagonal principal:");
        mostrarDiagonalPrincipal(matriz);

        // Paso 5: Mostrar la matriz secundaria
        System.out.println("Matriz secundaria:");
        mostrarMatriz(matrizSecundaria(matriz));

        scanner.close();
    }

    // Método para mostrar la matriz // 
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para mostrar la diagonal principal de la matriz // 
    public static void mostrarDiagonalPrincipal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    // Método para obtener la matriz secundaria de una matriz
    public static int[][] matrizSecundaria(int[][] matriz) {
        int[][] secundaria = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                secundaria[i][j] = matriz[i][3 - j];
            }
        }
        return secundaria;
    }
}