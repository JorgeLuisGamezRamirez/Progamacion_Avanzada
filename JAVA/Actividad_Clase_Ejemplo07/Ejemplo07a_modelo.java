package Clase11_02_25;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Ejemplo07a_modelo {

	private DefaultComboBoxModel listacombo;
	private DefaultListModel listalista;
	
	
	public Ejemplo07a_modelo() {
		listacombo = new DefaultComboBoxModel();
		listalista = new DefaultListModel();
	}
	
	public DefaultComboBoxModel getModeloCombobox() {
		return this.listacombo;
	}
	public DefaultListModel getModeloList() {
		return this.listalista;
	}
	public void InsertarcomboBox(Cproducto info) {
		this.listacombo.addElement(info);
	}
	public void InsertarListBox(Cproducto info) {
		this.listalista.addElement(info);
	}
}
