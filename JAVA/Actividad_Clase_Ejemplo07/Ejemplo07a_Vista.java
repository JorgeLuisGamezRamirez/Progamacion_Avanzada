package Clase11_02_25;

import java.awt.*;
import java.awt.GridBagLayout;
import java.util.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejemplo07a_Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final JList Ldatos = null;
	private static final Object Cdatos = null;
	private static final String Bsalir = null;
	private JPanel contentPane;
	private JComboBox combo;


	public Ejemplo07a_Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		
		Ldatos = new JList();
		Ldatos.setSelectionmode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(Ldatos);
		
		Bsalir = new JButton("Salir");
		GridBagContraints gbc_Bsalir = new GridBagContraints();
		gbc_Bsalir.gridwidth = 7;
		gbc_Bsalir.insets = new Insets (0,0,5,5);
		gbc_Bsalir.gridx = 6;
		gbc_Bsalir.gridy = 6;
		contentPane.add(Bsalir,gbc_Bsalir);
	}
	public Object JComboBox() {
		return this.Cdatos;
	}
	public JList getListBox() {
		return this.Ldatos;
	}
	public JButton

}
