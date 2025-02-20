package Tarea09_maui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipCalculator extends JFrame {
    private JTextField billAmountField;
    private JTextField tipPercentageField;
    private JLabel tipAmountLabel;
    private JLabel totalAmountLabel;

    public TipCalculator() {
        setTitle("Tip Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Crear y agregar componentes
        add(new JLabel("Bill Amount:"));
        billAmountField = new JTextField();
        add(billAmountField);

        add(new JLabel("Tip Percentage:"));
        tipPercentageField = new JTextField();
        add(tipPercentageField);

        add(new JLabel("Tip Amount:"));
        tipAmountLabel = new JLabel("0.00");
        add(tipAmountLabel);

        add(new JLabel("Total Amount:"));
        totalAmountLabel = new JLabel("0.00");
        add(totalAmountLabel);

        JButton calculateButton = new JButton("Calculate");
        add(calculateButton);

        // Acción del botón
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTip();
            }
        });

        setVisible(true);
    }

    private void calculateTip() {
        try {
            double billAmount = Double.parseDouble(billAmountField.getText());
            double tipPercentage = Double.parseDouble(tipPercentageField.getText());
            double tipAmount = billAmount * (tipPercentage / 100);
            double totalAmount = billAmount + tipAmount;

            tipAmountLabel.setText(String.format("%.2f", tipAmount));
            totalAmountLabel.setText(String.format("%.2f", totalAmount));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TipCalculator();
            }
        });
    }
}
