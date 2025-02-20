package Tarea04;

import javax.swing.*;
import java.awt.*;

public class RectangleDrawJ extends JApplet {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometric GUI");
        RectangleDrawJ applet = new RectangleDrawJ();

        frame.add(applet);
        frame.setSize(600, 400); // Tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        applet.init();
    }

    @Override
    public void init() {
        add(new DrawingPanel());
    }

    class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Dibujar un rectángulo
            g.setColor(Color.BLUE);
            g.fillRect(100, 100, 200, 150);

            // Dibujar un rectángulo con borde
            g.setColor(Color.RED);
            g.drawRect(100, 100, 200, 150);

            // Agregar más elementos gráficos aquí si es necesario
        }
    }
}
