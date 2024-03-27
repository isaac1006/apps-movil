package clase4;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellido;
    private String estadoCivil;
    private String fechaNacimiento;
    private String barrio;
    private String direccion;

    public Persona() {
        // Constructor vacío 
    }

    public void solicitarDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        estadoCivil = JOptionPane.showInputDialog("Ingrese su estado civil:");
        fechaNacimiento = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (formato: dd/mm/aaaa):");
        barrio = JOptionPane.showInputDialog("Ingrese su barrio:");
        direccion = JOptionPane.showInputDialog("Ingrese su dirección:");
    }

    public void mostrarInformacion() {
        String mensaje = "Nombre completo: " + nombre + " " + apellido + "\n" +
                         "Estado civil: " + estadoCivil + "\n" +
                         "Fecha de nacimiento: " + fechaNacimiento + "\n" +
                         "Edad: " + calcularEdad(fechaNacimiento) + " años" + "\n" +
                         "Barrio: " + barrio + "\n" +
                         "Dirección: " + direccion;
    
        JOptionPane.showMessageDialog(null, mensaje, "Datos Personales", JOptionPane.INFORMATION_MESSAGE);
    }

    public int calcularEdad(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNac, fechaActual);
        return periodo.getYears();
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.solicitarDatos();
        persona.mostrarInformacion();
    }
}