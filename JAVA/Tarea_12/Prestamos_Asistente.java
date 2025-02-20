package Tarea12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AsistentePrestamos extends JFrame {

    JLabel saldoLabel = new JLabel("Saldo del Préstamo");
    JTextField saldoTextField = new JTextField();
    JLabel interesLabel = new JLabel("Tasa de Interés");
    JTextField interesTextField = new JTextField();
    JLabel mesesLabel = new JLabel("Número de Pagos");
    JTextField mesesTextField = new JTextField();
    JLabel pagoLabel = new JLabel("Pago Mensual");
    JTextField pagoTextField = new JTextField();
    JButton calcularButton = new JButton("Calcular");
    JButton nuevoPrestamoButton = new JButton("Nuevo Préstamo");
    JButton mesesButton = new JButton("Calcular por Meses");
    JButton pagoButton = new JButton("Calcular por Pago");
    JLabel analisisLabel = new JLabel("Análisis del Préstamo");
    JTextArea analisisTextArea = new JTextArea();
    JButton salirButton = new JButton("Salir");

    Font fuente = new Font("Arial", Font.PLAIN, 16);
    Color amarilloClaro = new Color(255, 255, 128);
    boolean calcularPago;

    public static void main(String args[]) {
        new AsistentePrestamos().setVisible(true);
    }

    public AsistentePrestamos() {
        setTitle("Asistente de Préstamos");
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                salir();
            }
        });

        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints restricciones;

        restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.anchor = GridBagConstraints.WEST;
        restricciones.insets = new Insets(10, 10, 0, 0);
        getContentPane().add(saldoLabel, restricciones);

        saldoTextField.setPreferredSize(new Dimension(100, 25));
        saldoTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        saldoTextField.setFont(fuente);
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(10, 10, 0, 10);
        getContentPane().add(saldoTextField, restricciones);

        saldoTextField.addActionListener(e -> saldoTextField.transferFocus());

        restricciones.gridx = 0;
        restricciones.gridy = 1;
        getContentPane().add(interesLabel, restricciones);

        interesTextField.setPreferredSize(new Dimension(100, 25));
        interesTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        restricciones.gridx = 1;
        getContentPane().add(interesTextField, restricciones);
        interesTextField.addActionListener(e -> interesTextField.transferFocus());

        restricciones.gridx = 0;
        restricciones.gridy = 2;
        getContentPane().add(mesesLabel, restricciones);

        mesesTextField.setPreferredSize(new Dimension(100, 25));
        mesesTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        restricciones.gridx = 1;
        getContentPane().add(mesesTextField, restricciones);
        mesesTextField.addActionListener(e -> mesesTextField.transferFocus());

        restricciones.gridx = 0;
        restricciones.gridy = 3;
        getContentPane().add(pagoLabel, restricciones);

        pagoTextField.setPreferredSize(new Dimension(100, 25));
        pagoTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        restricciones.gridx = 1;
        getContentPane().add(pagoTextField, restricciones);
        pagoTextField.addActionListener(e -> pagoTextField.transferFocus());

        restricciones.gridx = 3;
        restricciones.gridy = 5;
        getContentPane().add(salirButton, restricciones);

        salirButton.addActionListener(e -> salir());

        pack();
        setLocationRelativeTo(null);
    }

    private void salir() {
        System.exit(0);
    }
}
