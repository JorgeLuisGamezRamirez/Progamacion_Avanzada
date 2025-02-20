package Tarea02;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ejemplojframe03_d extends JFrame {
	
	static JLabel La,Lb;
	static JButton Bboton;
	
	public ejemplojframe03_d() {
		this.setLayout(null);
		this.setBounds(10,10,300,300);
		La=new JLabel ("El triangulo de base 5 y altura 2");
		La.setBounds(10,10,200,30);
		Lb=new JLabel ();
		Lb.setBounds(10,100,200,30);
		Bboton=new JButton();
		Bboton.setText("Calcular");
		Bboton.setBounds(10,50,100,30);
		
		Bboton.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Lb.setText("El area del triangulo es 5");
			}
		});
		this.add(La);
		this.add(Lb);
		this.add(Bboton);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejemplojframe03_d ventana=new ejemplojframe03_d();
		ventana.setVisible(true);
		
	}

}
