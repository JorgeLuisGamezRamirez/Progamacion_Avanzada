package Tarea02;
import javax.swing.JFrame;
public class ejemplojframe01_c extends JFrame {

	public ejemplojframe01_c() {
		this.setTitle("2025-3");
		this.setBounds(10,20,400,300);
	}
	
	public static void main(String[]args) {
		ejemplojframe01_c ventana=new ejemplojframe01_c();
		ventana.setVisible(true);
	}
}
