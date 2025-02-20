package Tarea06_maui;

import java.awt.EventQueue;
import java.lang.System.Logger.Level;
import java.lang.System.LoggerFinder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.logging.ConsoleHandler;

public class SwingTipCalculator {
    private static final String Logger = null;
	private static final LoggerFinder logger = Logger.getLogger(SwingTipCalculator.class.getName());

    public static void main(String[] args) {
        // Configurar el logger para debug
        if (isDebugMode()) {
            logger.setLevel(Level.FINE);
            ConsoleHandler handler = new ConsoleHandler();
            handler.setLevel(Level.FINE);
            logger.addHandler(handler);
            logger.fine("Debug mode is enabled.");
        }

        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static boolean isDebugMode() {
        // Aquí podrías definir la lógica para determinar si estás en modo debug
        return true; // Cambia esto según sea necesario
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Tip Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        try {
            Font openSansRegular = Font.createFont(Font.TRUETYPE_FONT, SwingTipCalculator.class.getResourceAsStream("/OpenSans-Regular.ttf")).deriveFont(12f);
            Font openSansSemibold = Font.createFont(Font.TRUETYPE_FONT, SwingTipCalculator.class.getResourceAsStream("/OpenSans-Semibold.ttf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(openSansRegular);
            ge.registerFont(openSansSemibold);

            JLabel label = new JLabel("Bienvenido al Calculador de Propinas");
            label.setFont(openSansRegular);
            frame.add(label);

        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }
}
