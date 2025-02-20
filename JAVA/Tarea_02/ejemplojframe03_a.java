package Tarea02;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ejemplojframe03_a extends JFrame {

	static JLabel La,Lb;
	static JButton Bboton;
	
	public ejemplojframe03_a()
	{
		this.setLayout(null);
		this.setBounds(10,101,300,300);
		La=new JLabel ("El triangulo de base 5 y altura 2");
		La.setBounds(10,10,200,30);
		Lb=new JLabel ();
		Lb.setBounds(10,100,200,30);
		Bboton=new JButton("Calcular");
		Bboton.setBounds(10,50,100,30);
		this.add(La);
		this.add(Lb);
		this.add(Bboton);
		
	}
	public static void main (String[]args) {
		ejemplojframe03_a ventana=new ejemplojframe03_a();
		ventana.setVisible(true);
		Lb.setText("El area del triangulo es 5");
	}
}
