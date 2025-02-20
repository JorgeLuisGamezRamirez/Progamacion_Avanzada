package Tarea02;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhoneNumberTranslator {
    private static String[] numberToText = {
            "Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco",
            "Seis", "Siete", "Ocho", "Nueve"
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traductor de Números de Teléfono");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTextField textField = new JTextField(15);
        JButton translateButton = new JButton("Traducir");
        JLabel resultLabel = new JLabel("");

        translateButton.addActionListener(e -> {
            String input = textField.getText();
            StringBuilder translated = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    translated.append(numberToText[Character.getNumericValue(c)]).append(" ");
                }
            }
            resultLabel.setText(translated.toString());
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Ingrese el número de teléfono:"));
        frame.add(textField);
        frame.add(translateButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}

