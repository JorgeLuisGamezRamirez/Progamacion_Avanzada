package Tarea02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ejemplojframe03_c extends JFrame implements ActionListener {

	static JLabel La,Lb;
	static JButton Bboton;
	
	public ejemplojframe03_c()
	{
		this.setLayout(null);
		this.setBounds(10,10,300,300);
		La=new JLabel ("El triangulo de base 5 y altura 2");
		La.setBounds(10,10,200,30);
		Lb=new JLabel ();
		Lb.setBounds(10,100,200,30);
		Bboton=new JButton();
		Bboton.setText("Calcular");
		Bboton.setBounds(10,50,100,30);
		Bboton.addActionListener(this);
		this.add(La);
		this.add(Lb);
		this.add(Bboton);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==Bboton) {
			Lb.setText("El area del triangulo es 5");
		}

	}

	public static void main(String[] args) {
		ejemplojframe03_c ventana=new ejemplojframe03_c();
		ventana.setVisible(true);

	}

}
