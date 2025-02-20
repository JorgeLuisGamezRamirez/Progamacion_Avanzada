package Tarea08_mauijava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Data Binding Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        MainViewModel viewModel = new MainViewModel();

        JTextField textField = new JTextField(20);
        JLabel label = new JLabel();

        // Bind the text field to the label
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewModel.setName(textField.getText());
                label.setText(viewModel.getName());
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(label);

        frame.setVisible(true);
    }
}
