import java.util.Scanner;

public class SignoZodiacal {
        public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario

        Scanner scanner = new Scanner(System.in);

       

        // Solicitar nombre de la persona

        System.out.print("Ingrese su nombre: ");

        String nombre = scanner.nextLine();

       

        // Solicitar fecha de nacimiento (en formato dd/mm/yyyy)

        System.out.print("Ingrese su fecha de nacimiento (dd/mm/yyyy): ");

        String fechaNacimientoStr = scanner.nextLine();

       

        // Separar día, mes y año

        String[] partesFecha = fechaNacimientoStr.split("/");

        int dia = Integer.parseInt(partesFecha[0]);

        int mes = Integer.parseInt(partesFecha[1]);

        int año = Integer.parseInt(partesFecha[2]);

       

        // Obtener la fecha actual

        java.util.Calendar fechaActual = java.util.Calendar.getInstance();

        int añoActual = fechaActual.get(java.util.Calendar.YEAR);

        int mesActual = fechaActual.get(java.util.Calendar.MONTH) + 1;

        int diaActual = fechaActual.get(java.util.Calendar.DAY_OF_MONTH);

       

        // Calcular la edad

        int edad = añoActual - año;

        if (mes > mesActual || (mes == mesActual && dia > diaActual)) {

            edad--;

        }

       

        // Determinar el signo zodiacal

        String signoZodiacal = determinarSignoZodiacal(dia, mes);
       

        // Mostrar la edad y el signo zodiacal

        System.out.println("\nHola, " + nombre + ".");

        System.out.println("Tu edad es: " + edad + " años.");

        System.out.println("Tu signo zodiacal es: " + signoZodiacal);

       

        // Cerrar el objeto Scanner

        scanner.close();

    }

   

    // Método para determinar el signo zodiacal

    public static String determinarSignoZodiacal(int dia, int mes) {

        String signo="";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {

            signo = "Aries";

        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {

            signo = "Tauro";

        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {

            signo = "Géminis";

        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {

            signo = "Cáncer";

        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {

            signo = "Leo";

        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {

            signo = "Virgo";

        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {

            signo = "Libra";

        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {

            signo = "Escorpio";

        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {

            signo = "Sagitario";

        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {

            signo = "Capricornio";

        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {

            signo = "Acuario";

        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {

            signo = "Piscis";

        }
        return signo;

       
    }

    
}
