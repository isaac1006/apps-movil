import java.time.LocalDate;
import java.time.Period;

public class actividad1{
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 7;
        // Calcular la suma
        int suma = numero1 + numero2;
        // Resta
        int resta = numero1 - numero2;
        // Multiplicación
        int multi = numero1 * numero2;
        // División
        int divi = numero1 / numero2;

        // Calcular la fecha de nacimiento
        LocalDate fechaNac = LocalDate.of(1993, 6, 10);
        LocalDate ahora = LocalDate.now();

        // Mostrar resultados
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multi);
        System.out.println("La división es: " + divi);

        // Calcular la edad
        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %d años, %d meses y %d días%n",
                          periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}