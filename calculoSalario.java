import java.util.Scanner;

public class calculoSalario {
    public static void main(String[] args) {
        // crear un objeto de tipo scanner para leer la entrada de datos // 
        Scanner capturarDatos=new Scanner(System.in); // objeto para capturar datos // 
        // Solicitar el nombre de la persona // 
        System.out.println("ingrese el nombre de la persona ");
        String nombre = capturarDatos.nextLine(); 
        // ingresar valor vendido del mes // 
        System.out.println(nombre+ " ingresa el valor vendido en el mes ");
        double ventas =capturarDatos.nextDouble();
        // calculo salario base //
        System.out.println("ingresa el valor del salario base");
        double salarioBase= capturarDatos.nextDouble();
        // calcular salario comision salario //
        double comision=0;
        if (ventas>=70000000) {
           comision = ventas*0.60;
            
        } else {
            comision= ventas*0.25;
        }
    }
    
}
