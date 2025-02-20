package Tarea06_maui;

import javax.swing.*;

public class SwingShellApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Java Swing Shell");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Configurar el comportamiento del flyout
        // En este caso, vamos a deshabilitarlo simulando un contenedor principal sin flyout
        JPanel mainPanel = new JPanel();
        JLabel homeLabel = new JLabel("Home");

        mainPanel.add(homeLabel);
        frame.add(mainPanel);

        frame.setVisible(true);
    }
}
