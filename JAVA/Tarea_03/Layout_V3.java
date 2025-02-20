package tarea03_layout;

import java.awt.*;
import javax.swing.*;

public class Layout_V3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MarcoCalculadora m = new MarcoCalculadora();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
    }

}

class MarcoCalculadora extends JFrame {

    public MarcoCalculadora() {
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
        Lamina milamina = new Lamina();
        add(milamina);
    }

}

class Lamina extends JPanel {

    public Lamina() {
        setLayout(new BorderLayout());
        JButton pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(4, 4));

        ponerBoton("7", lamina2);
        ponerBoton("8", lamina2);
        ponerBoton("9", lamina2);
        ponerBoton("/", lamina2);

        ponerBoton("4", lamina2);
        ponerBoton("5", lamina2);
        ponerBoton("6", lamina2);
        ponerBoton("*", lamina2);

        ponerBoton("1", lamina2);
        ponerBoton("2", lamina2);
        ponerBoton("3", lamina2);
        ponerBoton("-", lamina2);

        ponerBoton("0", lamina2);
        ponerBoton(".", lamina2);
        ponerBoton("=", lamina2);
        ponerBoton("+", lamina2);

        add(lamina2, BorderLayout.CENTER);
    }

    private void ponerBoton(String rotulo, JPanel lamina2) {
        JButton boton = new JButton(rotulo);
        lamina2.add(boton);
    }
}


