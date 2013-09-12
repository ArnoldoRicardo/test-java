package paquete;

import javax.swing.*;
//import java.awt.BorderLayout;//bordes
import java.awt.GridLayout;//tabla
/*import java.awt.FlowLayout;//fluido por defecto*/

public class Ventana extends JFrame {
	
	private JPanel panel;
	private JLabel texto;
	private JButton boton;
	
	public Ventana(){
		panel = new JPanel();
		texto = new JLabel();
		boton = new JButton();
		panel.setLayout(new GridLayout(3, 3, 5, 10));
		
		this.add(panel);
		panel.add(texto);
		panel.add(boton);
		
		texto.setText("hola mundo");
		boton.setText("oprime");
	}
}
