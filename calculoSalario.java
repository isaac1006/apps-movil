import java.util.Scanner;
import java.time.*;

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
        LocalDate fecha = LocalDate.now(); // objeto para sacar la fecha // 
              
        if (ventas>=70000000) {
           comision = ventas*0.60;
            
        } else {
            comision= ventas*0.25;
        }
        // calcular el 4% en salud //
        double salud=salarioBase*0.04;

        // calcular el 12% de pension // 
        double pension = salarioBase*0.12;
        // calcular salario total // 
        double descuentos = salarioBase - (salud+pension);
        double salarioTotal= descuentos+comision;
        // mostrar informacion //
        System.out.println("\n nombre :" + nombre);
        System.out.println("Valor vetas :"+ventas );
        System.out.println("Mes :" + fecha);
        System.out.println("Salario :" + salarioBase);
        System.out.println("Comision :" + comision);
        System.out.println("Salario total " + salarioTotal);
        capturarDatos.close();

    }
    
}
