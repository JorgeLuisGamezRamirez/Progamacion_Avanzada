package Tarea05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JTextField;

public class Cronometro extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel Panelprincipal;
	private JLabel Etiqueta_iniciar,etiqueta_detener,etiqueta_salida;
	private JButton B_Salida,B_Detener,B_iniciar;
	private long tiempoinicio,timpodetener;
	private double tiempotranscurrido;
	JTextField textIniciar,textDetener,TextSalida;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cronometro frame = new Cronometro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cronometro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 157);
		Panelprincipal = new JPanel();
		Panelprincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Panelprincipal);
		GridBagLayout gbl_panelprincipal = new GridBagLayout();
		gbl_panelprincipal.columnWidths = new int[] {118, 118, 118};
		gbl_panelprincipal.rowHeights = new int[] {37, 37, 37};
		gbl_panelprincipal.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelprincipal.rowWeights = new double[]{0.0, 0.0, 0.0};
		Panelprincipal.setLayout(gbl_panelprincipal);
		
		B_iniciar = new JButton("Iniciar");
		GridBagConstraints gbc_b_iniciar = new GridBagConstraints();
		gbc_b_iniciar.insets = new Insets(0, 0, 5, 5);
		gbc_b_iniciar.gridx = 0;
		gbc_b_iniciar.gridy = 0;
		Panelprincipal.add(B_iniciar, gbc_b_iniciar);
		B_iniciar.addActionListener(this);
		
		Etiqueta_iniciar = new JLabel("Iniciar");
		GridBagConstraints gbc_etiqueta_iniciar = new GridBagConstraints();
		gbc_etiqueta_iniciar.insets = new Insets(0, 0, 5, 5);
		gbc_etiqueta_iniciar.gridx = 1;
		gbc_etiqueta_iniciar.gridy = 0;
		Panelprincipal.add(Etiqueta_iniciar, gbc_etiqueta_iniciar);
		
		textIniciar = new JTextField("New label");
		GridBagConstraints gbc_textIniciar = new GridBagConstraints();
		gbc_textIniciar.insets = new Insets(0, 0, 5, 0);
		gbc_textIniciar.gridx = 2;
		gbc_textIniciar.gridy = 0;
		Panelprincipal.add(textIniciar, gbc_textIniciar);
		
		B_Detener = new JButton("Detener");
		GridBagConstraints gbc_b_Detener = new GridBagConstraints();
		gbc_b_Detener.insets = new Insets(0, 0, 5, 5);
		gbc_b_Detener.gridx = 0;
		gbc_b_Detener.gridy = 1;
		Panelprincipal.add(B_Detener, gbc_b_Detener);
		this.B_Detener.addActionListener(this);
		
		etiqueta_detener = new JLabel("Detener");
		GridBagConstraints gbc_etiqueta_detener = new GridBagConstraints();
		gbc_etiqueta_detener.insets = new Insets(0, 0, 5, 5);
		gbc_etiqueta_detener.gridx = 1;
		gbc_etiqueta_detener.gridy = 1;
		Panelprincipal.add(etiqueta_detener, gbc_etiqueta_detener);
		
		textDetener = new JTextField("New label");
		GridBagConstraints gbc_textDetener = new GridBagConstraints();
		gbc_textDetener.insets = new Insets(0, 0, 5, 0);
		gbc_textDetener.gridx = 2;
		gbc_textDetener.gridy = 1;
		Panelprincipal.add(textDetener, gbc_textDetener);
		
		B_Salida = new JButton("Salida");
		GridBagConstraints gbc_b_Salida = new GridBagConstraints();
		gbc_b_Salida.insets = new Insets(0, 0, 0, 5);
		gbc_b_Salida.gridx = 0;
		gbc_b_Salida.gridy = 2;
		Panelprincipal.add(B_Salida, gbc_b_Salida);
		
		etiqueta_salida = new JLabel("Salida");
		GridBagConstraints gbc_etiqueta_salida = new GridBagConstraints();
		gbc_etiqueta_salida.insets = new Insets(0, 0, 0, 5);
		gbc_etiqueta_salida.gridx = 1;
		gbc_etiqueta_salida.gridy = 2;
		Panelprincipal.add(etiqueta_salida, gbc_etiqueta_salida);
		
		TextSalida = new JTextField("New label");
		GridBagConstraints gbc_TextSalida = new GridBagConstraints();
		gbc_TextSalida.gridx = 2;
		gbc_TextSalida.gridy = 2;
		Panelprincipal.add(TextSalida, gbc_TextSalida);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==B_iniciar) {
			this.tiempoinicio=System.currentTimeMillis();
			this.Etiqueta_iniciar.setText(String.valueOf(this.tiempoinicio));
			this.etiqueta_detener.setText("");
			this.etiqueta_salida.setText("");
			
		}else 
			if(e.getSource()==B_Detener) {
				this.timpodetener=System.currentTimeMillis();
				this.etiqueta_detener.setText(String.valueOf(this.timpodetener));
				this.tiempotranscurrido=((this.timpodetener-this.tiempotranscurrido)/1000);
				this.etiqueta_salida.setText(String.valueOf(this.tiempotranscurrido));
				
			}else 
				if(e.getSource()==B_Salida) {
					this.dispose();
				}
		
	}

}
