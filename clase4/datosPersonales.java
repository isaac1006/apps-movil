package clase4;
import javax.swing.*;

public class datosPersonales {

    public static void main(String[] args) {
        // solicitar al ususario ingresar el nombre //

        String nombre=JOptionPane.showInputDialog("ingres el nombre ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
        String mensaje= "nombre:"+nombre + "\nedad:" + edad;
        // mostrar mensaje // 
        JOptionPane.showMessageDialog(null,mensaje,"datos personales",JOptionPane.INFORMATION_MESSAGE); // es importante agregar el .INFORMATION_MESAAGE para ver el string //
        
        // ingresar apellido estado civil fecha de nacimiento // 
        // mostrar nombre completo  año de nacimiento fecha de nacimiento barrio y direccion // 
        
        
         
    }
    
}
