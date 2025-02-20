package Tarea08_mauijava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class T8 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        CurrencyConverter converter = new CurrencyConverter();

        JTextField textField = new JTextField(20);
        JLabel resultLabel = new JLabel("Converted amount: ");

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(textField.getText());
                    String result = converter.convertUsdToEur(amount);
                    resultLabel.setText("Converted amount: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
                }
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter amount in USD:"));
        frame.add(textField);
        frame.add(convertButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
