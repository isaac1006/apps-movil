package clase5;

import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AsistenciaClaseGUI extends JFrame implements ActionListener {
    
    private JComboBox<String> materiaComboBox;
    private JComboBox<String> horaComboBox;
    private JButton tomarAsistenciaButton;
    private JTextField nombreEstudiante; // Declaración de JTextField

    public AsistenciaClaseGUI() {
        setTitle("Registro de Asistencia");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel materiaLabel = new JLabel("Materia:");
        JLabel horaLabel = new JLabel("Hora:");
        JLabel nombre = new JLabel("Nombre estudiante");
        materiaComboBox = new JComboBox<>(new String[]{"Matemáticas", "Ciencias", "Historia"});
        horaComboBox = new JComboBox<>(new String[]{"8:00 AM", "10:00 AM", "2:00 PM"});
        tomarAsistenciaButton = new JButton("Tomar Asistencia");
        tomarAsistenciaButton.addActionListener(this);

        nombreEstudiante = new JTextField(20); // Inicialización de JTextField
        panel.add(materiaLabel);
        panel.add(materiaComboBox);
        panel.add(horaLabel);
        panel.add(horaComboBox);
        panel.add(nombre);
        panel.add(nombreEstudiante); // Agregar nombreEstudiante al panel
        panel.add(tomarAsistenciaButton);

        add(panel);
        setVisible(true);
    }

    // Método necesario para implementar la interfaz ActionListener
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tomarAsistenciaButton) {
            String materiaSeleccionada = (String) materiaComboBox.getSelectedItem();
            String horaSeleccionada = (String) horaComboBox.getSelectedItem();
            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

            JOptionPane.showMessageDialog(this, "Asistencia Registrada:\n\n" +
                    "Materia: " + materiaSeleccionada + "\n" +
                    "Fecha: " + formatoFecha.format(fechaActual) + "\n" +
                    "Hora: " + horaSeleccionada +"\n" +
                    "Alumno: " + nombreEstudiante.getText()); // Obtener texto del JTextField
        }
    }

    public static void main(String[] args) {
        new AsistenciaClaseGUI();
    }
}