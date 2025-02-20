package tarea03_layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LAYOUT_V4 {

    public static void main(String[] args) {
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

    private JButton pantalla;
    private JPanel lamina2;
    private double resultado;
    private String ultimaOperacion;

    public Lamina() {
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(4, 4));

        ponerBoton("7");
        ponerBoton("8");
        ponerBoton("9");
        ponerBoton("/");

        ponerBoton("4");
        ponerBoton("5");
        ponerBoton("6");
        ponerBoton("*");

        ponerBoton("1");
        ponerBoton("2");
        ponerBoton("3");
        ponerBoton("-");

        ponerBoton("0");
        ponerBoton(".");
        ponerBoton("=");
        ponerBoton("+");

        add(lamina2, BorderLayout.CENTER);
        
        ultimaOperacion = "=";
        resultado = 0;
    }

    private void ponerBoton(String rotulo) {
        JButton boton = new JButton(rotulo);
        lamina2.add(boton);
        if ("0123456789.".contains(rotulo)) {
            boton.addActionListener(new InsertaNumero(rotulo));
        } else {
            boton.addActionListener(new Operacion(rotulo));
        }
    }

    private class InsertaNumero implements ActionListener {
        private String numero;

        public InsertaNumero(String numero) {
            this.numero = numero;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (pantalla.getText().equals("0") || ultimaOperacion.equals("=")) {
                pantalla.setText(numero);
            } else {
                pantalla.setText(pantalla.getText() + numero);
            }
            ultimaOperacion = "";
        }
    }

    private class Operacion implements ActionListener {
        private String operacion;

        public Operacion(String operacion) {
            this.operacion = operacion;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
            pantalla.setText("" + resultado);
        }

        private void calcular(double x) {
            switch (ultimaOperacion) {
                case "+":
                    resultado += x;
                    break;
                case "-":
                    resultado -= x;
                    break;
                case "*":
                    resultado *= x;
                    break;
                case "/":
                    if (x != 0) {
                        resultado /= x;
                    } else {
                        pantalla.setText("Error");
                        return;
                    }
                    break;
                case "=":
                    resultado = x;
                    break;
            }
        }
    }
}

