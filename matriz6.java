import java.util.Scanner;

public class matriz6 {

    public static void main(String[] args){

        // crea el objeto  pa ingresar los datos de la libreia scanner //
        Scanner ingresoDatos = new Scanner(System.in);
               // Crear una matriz 4x4

               int[][] matriz = new int[6][6];
        // ingresar los datos en la matriz //
        System.out.println("ingresa  los numero en la matriz");
        
        // creo el cilco for para ingresar los datos en la matriz //
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("ingrese el numero de la posision  ( "+ i + ",  " + j + " ); " );
                matriz [i][j] = ingresoDatos.nextInt();
            }
            
        }
        // ahora vamos a crear otro for para inprimir la matriz // 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                  // Imprimir cada elemento de la matriz separado por una tabulación //
                  System.out.print(matriz[i][j] + "\t");
            }
              // Imprimir una nueva línea al final de cada fila //
              System.out.println();
            
        } 
        ingresoDatos.close();

    }
    
}
