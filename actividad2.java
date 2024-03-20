import java.util.Scanner;

public class actividad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Elija una opción según el siguiente menú:");
            System.out.println("1. Calcular moneda local");
            System.out.println("2. Calcular salario");
            System.out.println("3. Calcular área de un triángulo");
            System.out.println("4. Salir");

            // Leer la opción seleccionada por el usuario // 
            System.out.print("Ingrese el número de opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    monedaLocal(scanner);
                    break;
                case 2:
                    calcularSalario(scanner);
                    break;
                case 3:
                    areaTriangulo(scanner);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 4.");
            }
        }
    }
    public static void monedaLocal(Scanner scanner) {
        System.out.print("Bienvenido a Cacular Moneda Local ");
        System.out.print("");
        System.out.println("Ingrese el valor en Dólares a convertir:");
        double dolares = scanner.nextDouble();

        // Realizar las conversiones a pesos colombianos, argentinos, ecuatorianos y peruanos
        double pesosColombianos = dolares * 4000; // Tasa de cambio aproximada
        double pesosArgentinos = dolares * 100; // Tasa de cambio aproximada
        double pesosEcuatorianos = dolares * 1.25; // Tasa de cambio aproximada
        double pesosPeruanos = dolares * 4; // Tasa de cambio aproximada

        // Imprimir los datos
        System.out.println("Pesos Colombianos: " + pesosColombianos);
        System.out.println("Pesos Argentinos: " + pesosArgentinos);
        System.out.println("Pesos Ecuatorianos: " + pesosEcuatorianos);
        System.out.println("Soles Peruanos: " + pesosPeruanos);

   }

      /*Crear un algoritmo   se ingrese el nombre,
     el  salario de una persona y se calcule  cuanto debe aportar para pesion y salud. */

     // Función para calcular el aporte para pensión y salud
     public static void calcularSalario(Scanner scanner) {
        System.out.println("Ingrese su nombre:");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su salario en pesos:");
        double salario = scanner.nextDouble();

        double aportePension = salario * 0.10;
        double aporteSalud = salario * 0.04;
        double deducciones = aportePension + aporteSalud;
        double salarioNeto = salario - deducciones;

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Aporte para pensión: $" + aportePension);
        System.out.println("Aporte para salud: $" + aporteSalud);
        System.out.println("Su pago en nómina es de: $" + salarioNeto);
    }


    // halla el area de un triangulo // 
    public static void areaTriangulo(Scanner scanner) {
        System.out.print("Bienvenido vas a hallar el area de un triangulo ");
        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);
    }

}
