import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JTextField insertarElemnentoDeLaTextField;
    private JButton ponerElemntoButton;
    private JButton sacarElementoButton;
    private JButton elementoTopeButton;
    private JButton listaDeEElemnetosButton;
    private JTextArea PilaLista;
    private JPanel Principal;
    private JLabel Ingreso;
    private Pila coleccion = new Pila();

    //-----------------------------------------------

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ventana() {

        ponerElemntoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coleccion.insertar(Integer.parseInt(insertarElemnentoDeLaTextField.getText()));
                JOptionPane.showMessageDialog(null,"Insetado correctamente");
            }
        });

        sacarElementoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null,"Eliminadooo: "+coleccion.eliminar());
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());

                }

            }
        });

        elementoTopeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null,"CIMA: "+coleccion.consultarTope());
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());

                }

            }
        });

        listaDeEElemnetosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaDeEElemnetosButton.setText(coleccion.toString());

            }
        });

    }

}

