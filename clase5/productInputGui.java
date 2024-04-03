package clase5;
import javax.swing.*;
public class productInputGui {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // crear ventana  //
        JFrame frame=new JFrame("INGRESAR PRODUCTO");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal //
        JPanel panel=new JPanel();
        frame.add(panel);
        colocarComponentes(panel);

        // mostrar ventana //
        frame.setVisible(true);
        // metodo para agregar componentes a la ventana //
        private static void colocarComponentes(JPanel panel){
            panel.setLayout(null);
            // etiqueta y campo de texto para el nombre del producto // 

            JLabel nameLabel= new JLabel("NOMBRE DEL PRODUCTO");
            nameLabel.setBounds(10,20,80,25);
            panel.add(nameLabel);

            // campo //
            JTextField nameText=new JTextField(20);
            nameText.setBounds(10, 20, 165, 25);
            panel.add(nameText);
            //etiqueta //

            JLabel cantidadLabel = new JLabel("CANTIDAD PRODUCTO");
            cantidadLabel.setBounds(10, 50, 80, 25);
            panel.add(cantidadLabel);
            
            //campo //
            JTextField cantidadText=new JTextField(20);
            cantidadText.setBounds(100, 50, 165, 25);
            panel.add(cantidadText);

            // etiqueta //
            JLabel precioLabel= new JLabel("PRECIO");
            precioLabel.setBounds(10, 80, 80, 25);
            panel.add(precioLabel);

            // campo // 
            JTextField precioText=new JTextField(20);
            precioText.setBounds(100, 80, 165, 25);
            panel.add(precioText);

        }
        
        
    }

    private static void PlaceComponents(JPanel panel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PlaceComponents'");
    }
}
