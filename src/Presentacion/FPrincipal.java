package Presentacion;


import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FPrincipal extends JFrame{
	private POpcionesT opcionesJ;
	
	public FPrincipal() {
		this.setTitle("LightsOut");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.opcionesJ = new POpcionesT();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(this.opcionesJ,BorderLayout.NORTH);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new FPrincipal();
	}
}
