package Tareas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio01 extends JFrame implements ActionListener{
	private JPanel panel;
	private JButton Bmensaje;
	
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio01 frame = new ejercicio01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ejercicio01() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(panel);
		
		Bmensaje = new JButton("Oprimir");
		Bmensaje.addActionListener(this);
		panel.add(Bmensaje);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==this.Bmensaje)
		{
			JOptionPane.showMessageDialog(this, "Hola");
		}
	}

}
