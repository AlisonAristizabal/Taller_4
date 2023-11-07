package Presentacion;


import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FPrincipal extends JFrame{
	private POpcionesT opcionesJ;
	private PTablero tablero;
	private PBotones botones;

	
	public FPrincipal() {
		this.setTitle("LightsOut");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.opcionesJ = new POpcionesT();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(this.opcionesJ,BorderLayout.NORTH);
		this.botones = new PBotones();
		this.add(this.botones,BorderLayout.EAST);
		//this.tablero = new PTablero(opcionesJ);
		//this.add(this.tablero,BorderLayout.WEST);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new FPrincipal();
	}
}
