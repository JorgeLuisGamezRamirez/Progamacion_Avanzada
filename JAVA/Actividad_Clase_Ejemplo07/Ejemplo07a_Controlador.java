package Clase11_02_25;

public class Ejemplo07a_Controlador {
	
	private Ejemplo07a_Vista vista;
	private Ejemplo07a_modelo modelo;
	
	
	public Ejemplo07a_Controlador(Ejemplo07a_Vista vista, Ejemplo07a_modelo modelo) {
		super();
		this.vista = vista;
		this.vista.setVisible(false);
		this.modelo = modelo;
		Cproducto p1= new Cproducto("001","Coca Cola");
		Cproducto p2= new Cproducto("002","Pepsi Cola");
		Cproducto p3= new Cproducto("003","Big Cola");
		Cproducto p4= new Cproducto("004","Coca Cola Light");

		modelo.InsertarcomboBox(p1);
		modelo.InsertarcomboBox(p2);
		modelo.InsertarcomboBox(p3);
		modelo.InsertarcomboBox(p4);

		modelo.InsertarListBox(p1);
		modelo.InsertarListBox(p2);
		modelo.InsertarListBox(p3);
		modelo.InsertarListBox(p4);
		
		vista.setComboBoxModel(modelo.getModeloCombobox());
		vista.setJListModel(modelo.getModeloList());
	}
	
	
	
}
