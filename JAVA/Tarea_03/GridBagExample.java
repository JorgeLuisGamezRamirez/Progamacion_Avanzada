package tarea03_layout;
import java.awt.*;
import javax.swing.*;

public class GridBagExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        // Botón 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(new JButton("Botón 1"), gbc);

        // Botón 2
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        frame.add(new JButton("Botón 2"), gbc);

        // Botón 3
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        frame.add(new JButton("Botón 3"), gbc);

        // Botón 4
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        frame.add(new JButton("Botón 4"), gbc);

        // Botón 5
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        frame.add(new JButton("Botón 5"), gbc);

        // Botón 6
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        frame.add(new JButton("Botón 6"), gbc);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}



