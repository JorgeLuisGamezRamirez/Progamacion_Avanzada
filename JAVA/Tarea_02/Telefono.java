package Tarea02;
import javax.swing.*;

public class PhoneWord {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Mi primera app con Java Swing");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);

	        JButton button = new JButton("¡Haz clic aquí!");
	        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "¡Hola Mundo!"));

	        frame.getContentPane().add(button);

	        frame.setVisible(true);
	    }
	}


