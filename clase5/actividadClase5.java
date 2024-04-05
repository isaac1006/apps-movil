package clase5;

import javax.swing.* ;
public class actividadClase5 {
 // método para agregar componentes a la ventana //
        private static void colocarComponentes(JPanel panel) {
            panel.setLayout(null);
            // etiqueta y campo de texto para el nombre del producto // 

            JLabel nameLabel= new JLabel("NOMBRE DE PERSONA");
            nameLabel.setBounds(10,20,160,25);
            panel.add(nameLabel);

            // campo //
            JTextField nameText=new JTextField(20);
            nameText.setBounds(170, 20, 165, 25);
            panel.add(nameText);

            // etiqueta //
            JLabel cantidadLabel = new JLabel("FECHA DE NACIMIENTO");
            cantidadLabel.setBounds(10, 50, 150, 25);
            panel.add(cantidadLabel);
            
            // campo //
            JTextField cantidadText=new JTextField(20);
            cantidadText.setBounds(170, 50, 165, 25);
            panel.add(cantidadText);

            // etiqueta //
            JLabel precioLabel= new JLabel("PRECIO");
            precioLabel.setBounds(10, 80, 150, 25);
            panel.add(precioLabel);

            // campo // 
            JTextField precioText=new JTextField(20);
            precioText.setBounds(170, 80, 165, 25);
            panel.add(precioText);

            // boton de insertar // 
            JButton inserButton= new JButton(" insertar Datos");
            inserButton.setBounds(180,120, 120, 25);
            panel.add(inserButton);
            
                // etiqueta para mostrar la informacion ingresada //
            JLabel infoLabel=new JLabel("");
            infoLabel.setBounds(10, 150, 300, 25);
            panel.add(infoLabel);

            // ACCION DE BOTTON // 

            inserButton.addActionListener(e->{
                String nombre=nameText.getText();
                int cantidad=Integer.parseInt(cantidadText.getText());
                double precio=Double.parseDouble(precioText.getText());

                // Mostrar la informacion ingresada en la etiqueta //
                infoLabel.setText("nombre "+ nombre + ", cantidad  "+cantidad+ ", precio "+precio);

            });
        }
         


    
}
