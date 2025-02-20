package tarea03_layout;

import javax.swing.*;
import java.awt.*;

public class EjemploLayouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de Layouts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Usando FlowLayout


        // Agregando componentes
        frame.add(new JButton("Amarillo"),BorderLayout.NORTH);
        frame.add(new JButton("Rojo"),BorderLayout.SOUTH);
        frame.add(new JButton("Azul"),BorderLayout.WEST);
        frame.add(new JButton("Negro"),BorderLayout.EAST);
        frame.add(new JButton("Verde"),BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
