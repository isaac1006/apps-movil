package clase5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reglade3 {
    public static void main(String[] args) {
        // Crear ventana
        JFrame frame = new JFrame("como calcular el precio de venta  ");
        frame.setSize(700, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal
        JPanel panel = new JPanel();
        frame.add(panel);
        colocarComponentes(panel);

        // Mostrar ventana
        frame.setVisible(true);
    }

    // Método para agregar componentes a la ventana
    private static void colocarComponentes(JPanel panel) {
        panel.setLayout(null);

        // Etiquetas y campos de texto para los valores conocidos
        JLabel label1 = new JLabel("COSTO DE FABRICACION:");
        label1.setBounds(10, 20, 160, 25);
        panel.add(label1);

        JTextField valor1Text = new JTextField(10);
        valor1Text.setBounds(160, 20, 100, 25);
        panel.add(valor1Text);

        JLabel label2 = new JLabel("PRECIO DE VENTA:");
        label2.setBounds(10, 50, 150, 25);
        panel.add(label2);

        JTextField valor2Text = new JTextField(10);
        valor2Text.setBounds(160, 50, 100, 25);
        panel.add(valor2Text);

        JLabel label3 = new JLabel("Ganacia de %:");
        label3.setBounds(10, 80, 120, 25);
        panel.add(label3);

        JTextField resultadoText = new JTextField(10);
        resultadoText.setBounds(160, 80, 100, 25);
        resultadoText.setEditable(false);
        panel.add(resultadoText);

        // Botón para realizar el cálculo
        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(300, 50, 100, 50);
        panel.add(calcularButton);

        // Acción del botón
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener los valores de los campos de texto
                    double costoFabricacion = Double.parseDouble(valor1Text.getText());
                    double precioVenta = Double.parseDouble(valor2Text.getText());
                    // cacular ganacia bruta //
                    double gananciaBruta= precioVenta-costoFabricacion;

                    // Calcular porcentaje de venta //
                    double resultado = (gananciaBruta/costoFabricacion) * 100;

                    // Mostrar el resultado en el campo de texto correspondiente
                    resultadoText.setText(Double.toString(resultado));
                } catch (NumberFormatException ex) {
                    // Manejo de errores en caso de valores no válidos
                    JOptionPane.showMessageDialog(panel, "Por favor ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
}





