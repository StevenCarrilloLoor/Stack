import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JTextField insertarElemnentoDeLaTextField;
    private JButton ponerElemntoButton;
    private JButton sacarElementoButton;
    private JButton elementoTopeButton;
    private JButton listaDeEElemnetosButton;
    private Pila coleccion = new Pila();

    //-----------------------------------------------

    public Ventana() {

        ponerElemntoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        sacarElementoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        elementoTopeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        listaDeEElemnetosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

