package Tarea06_maui;
import javax.swing.*;
import java.awt.*;

public class JavaSwingApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Java Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        try {
            Font openSansRegular = Font.createFont(Font.TRUETYPE_FONT, JavaSwingApp.class.getResourceAsStream("/OpenSans-Regular.ttf")).deriveFont(12f);
            Font openSansSemibold = Font.createFont(Font.TRUETYPE_FONT, JavaSwingApp.class.getResourceAsStream("/OpenSans-Semibold.ttf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(openSansRegular);
            ge.registerFont(openSansSemibold);

            JLabel label = new JLabel("Hola, Java Swing!");
            label.setFont(openSansRegular);
            frame.add(label);

        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }
}
