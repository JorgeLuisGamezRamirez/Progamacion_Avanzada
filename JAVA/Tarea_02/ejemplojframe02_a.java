package Tarea02;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class ejemplojframe02_a extends JFrame {

	JLabel a,b;
	
	public ejemplojframe02_a() {
		
	this.setTitle("2025-3");
	this.setBounds(10,20,300,200);
	a=new JLabel("el triangulo de base 2*5");
	a.setBounds(10,10,200,30);
	b=new JLabel();
	b.setBounds(10,50,300,30);
	add(a);

	}
	public static void main(String[] args) {
	
		ejemplojframe02_a ventana= new ejemplojframe02_a();
		ventana.setVisible(true);
		
	}
	
}
