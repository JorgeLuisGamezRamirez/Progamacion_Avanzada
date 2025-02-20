package Tarea07;

import javax.swing.*;

public class Sintaxis_radio {
    public static void main(String[] args) {
        Marco_radio_sintaxis mimarco = new Marco_radio_sintaxis();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco_radio_sintaxis extends JFrame {
    public Marco_radio_sintaxis() {
        setVisible(true);
        setBounds(550, 500, 300, 300);
        Lamina_radio_sintaxis milamina = new Lamina_radio_sintaxis();
        add(milamina);
    }
}

class Lamina_radio_sintaxis extends JPanel {
    public Lamina_radio_sintaxis() {
        // Constructor code here
    	ButtonGroup migrupo1=new ButtonGroup();
    	ButtonGroup migrupo2=new ButtonGroup();
    	
    	JRadioButton boton1=new JRadioButton("Azul",false);
    	JRadioButton boton2=new JRadioButton("Rojo",true);
    	JRadioButton boton3=new JRadioButton("Verde",false);
    	JRadioButton boton4=new JRadioButton("Masculino",false);
    	JRadioButton boton5=new JRadioButton("Femenino",false);

    	migrupo1.add(boton1);
    	migrupo1.add(boton2);
    	migrupo1.add(boton3);
    	migrupo2.add(boton4);
    	migrupo2.add(boton5);

    	add(boton1);
    	add(boton2);
    	add(boton3);
    	add(boton4);
    	add(boton5);
    	

    }
}
