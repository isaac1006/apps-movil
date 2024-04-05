
import javax.swing.*;

public class InfoPersonal{
    public static void main(String[] args) {
        
        //crear ventana
        JFrame frame=new JFrame("DATOS PERSONALES");
        frame.setSize(1000, 600 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para mostrar el icono para cerrar la ventana
        
        //crear el panel principal
        JPanel panel=new JPanel();
        frame.add(panel);
        colocarcomponente(panel);

        frame.setVisible(true);
    }

        //metodo para agregar componentes a la ventana
        private static void colocarcomponente(JPanel panel) {
            panel.setLayout(null);

            JLabel nameLabel=new JLabel("NOMBRES");
            nameLabel.setBounds(10, 20, 140, 25);
            panel.add(nameLabel);
            JTextField nameText=new JTextField(20);
            nameText.setBounds(150,20,165,25);
            panel.add(nameText);

            JLabel LastnameLabel=new JLabel("APELLIDOS");
            LastnameLabel.setBounds(10, 50, 140, 25);
            panel.add(LastnameLabel);
            JTextField LastnameText=new JTextField(20);
            LastnameText.setBounds(150,50,165,25);
            panel.add(LastnameText);

            JLabel fechaNacimLabel=new JLabel("FECHA DE NACIMIENTO");
            fechaNacimLabel.setBounds(10, 80, 140, 25);
            panel.add(fechaNacimLabel);
            JTextField fechaNacimText=new JTextField(20);
            fechaNacimText.setBounds(150,80,165,25);
            panel.add(fechaNacimText);

           
            JLabel edadLabel=new JLabel("EDAD");
            edadLabel.setBounds(10, 110, 140, 25);
            panel.add(edadLabel);
            JTextField edadText=new JTextField(20);
            edadText.setBounds(150,110,165,25);
            panel.add(edadText); //permite mostrar la etiqueta o el cammpo en laventana

        
            JLabel sexoLabel=new JLabel("SEXO");
            sexoLabel.setBounds(10, 140, 140, 25);
            panel.add(sexoLabel);
            JTextField sexoText=new JTextField(20);
            sexoText.setBounds(150,140,165,25);
            panel.add(sexoText);

            JLabel barrioLabel=new JLabel("BARRIO");
            barrioLabel.setBounds(10, 170, 140, 25);
            panel.add(barrioLabel);
            JTextField barrioText=new JTextField(20);
            barrioText.setBounds(150,170,165,25);
            panel.add(barrioText);

            JLabel direccionLabel=new JLabel("DIRECCION");
            direccionLabel.setBounds(10, 200, 140, 25);
            panel.add(direccionLabel);
            JTextField direccionText=new JTextField(20);
            direccionText.setBounds(150,200,165,25);
            panel.add(direccionText);

            JLabel celularLabel=new JLabel("CELULAR");
            celularLabel.setBounds(10, 230, 140, 25);
            panel.add(celularLabel);
            JTextField celularText=new JTextField(20);
            celularText.setBounds(150,230,165,25);
            panel.add(celularText);

            //boton insertar
            JButton insertButton=new JButton("GUARDAR");
            insertButton.setBounds(100, 260, 130, 25);
            panel.add(insertButton);

            //etiqueta para mostrar la informacion ingresada
            JLabel infoLabel=new JLabel("");
            infoLabel.setBounds(10, 290, 1000, 25 );
            panel.add(infoLabel);

            //imprimir - mostrar la información la accion del boton
            insertButton.addActionListener(e->{
                String nombre= nameText.getText();
                String apellido= LastnameText.getText();
                int anonaci=Integer.parseInt(fechaNacimText.getText());
                int edad=Integer.parseInt(edadText.getText());
                String sexo= sexoText.getText();
                String barrio= barrioText.getText();
                String direccion= direccionText.getText();
                String celular= celularText.getText();
                

                //mostrar la informacion ingresada
                infoLabel.setText("Nombre: "+nombre + "Apellidos: "+apellido + "Año Nacimiento: "+anonaci + "Edad: "+edad + "Sexo: "+sexo + "Barrio: "+barrio + "Direccion: "+direccion + "Celular: "+celular );
                
                // infoLabel.setText("Apellidos: "+apellido);
                //infoLabel.setText("Año Nacimiento: "+anonaci);
                //infoLabel.setText("Edad: "+edad);
                //infoLabel.setText("Sexo: "+sexo);
                //infoLabel.setText("Barrio: "+barrio);
                //infoLabel.setText("Direccion: "+direccion);
                //infoLabel.setText("Celular: "+celular);

            }
            );

        }
    }
