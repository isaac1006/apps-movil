package java2;

import java.util.Scanner;

public class matriz {
      public static void main(String[]args){

        //crear un objeto scanner para leer la entrada del main
        Scanner scanner=new Scanner(System.in);

        //crear una Matriz 4*4
        int [][]matriz=new int[4][4];

        //solicitar al usurio q ingrese numeros para la matriz
        System.out.println("ingresar los numeros en la matriz");
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println("ingresar los numeros a la matriz");

                matriz[i][j]=scanner.nextInt();
            }
        }

        //imprimir la matriz despues 
        System.out.println("\n la mtriz ingresada es:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println(matriz[i][j] + "\t" );
            }
        }
    }
    
}
