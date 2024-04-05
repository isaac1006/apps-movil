import javax.swing.*;
import java.awt.event.*;

public class SignoZodiacalGUI extends JFrame implements ActionListener {
    private JTextField diaTextField, mesTextField, añoTextField, nombreTextField;
    private JButton determinarSignoButton;

 

    public SignoZodiacalGUI() {
        setTitle("Determinar Signo Zodiacal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

 

        JPanel panel = new JPanel();

        JLabel diaLabel = new JLabel("Día:");
        JLabel mesLabel = new JLabel("Mes:");
        JLabel añoLabel = new JLabel("Año:");
        JLabel nombreLabel = new JLabel("Nombre:");

        diaTextField = new JTextField(5);
        mesTextField = new JTextField(5);
        añoTextField = new JTextField(5);
        nombreTextField=new JTextField(5);
        determinarSignoButton = new JButton("Determinar Signo");

        determinarSignoButton.addActionListener(this);
        panel.add(diaLabel);
        panel.add(diaTextField);
        panel.add(mesLabel);
        panel.add(mesTextField);
        panel.add(añoLabel);
        panel.add(añoTextField);
        panel.add(nombreLabel);
        panel.add(nombreTextField);
        panel.add(determinarSignoButton);

        add(panel);

        setVisible(true);

    }

 

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == determinarSignoButton) {
            int dia = Integer.parseInt(diaTextField.getText());
            int mes = Integer.parseInt(mesTextField.getText());
            String signo = determinarSignoZodiacal(dia, mes);
            String nombre = nombreTextField.getText();
            JOptionPane.showMessageDialog(this,  nombre + " Tu signo zodiacal es: " + signo);
        }
    }

 

    private String determinarSignoZodiacal(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } 

        else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } 

        else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } 
        else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } 
        else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } 
        else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } 
        else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } 
        else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } 
        else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } 
        else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } 
        else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } 
        else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Piscis";
        } 
        else {
            return "Error: Fecha no válida";
        }
    }

    public static void main(String[] args) {
        new SignoZodiacalGUI();
    }

}