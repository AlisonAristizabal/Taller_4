package Presentacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;

public class PBotones extends JPanel{
	private Tablero tablero;
	private PTop10 top;
	public PBotones() {
		this.tablero = new Tablero(5);
		this.setLayout(new GridLayout(4,1,20,20));
		JButton bNuevo = new JButton("Nuevo");
		add(bNuevo);
		bNuevo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tablero = new Tablero(5);
			}
		});
		JButton bReiniciar = new JButton("Reiniciar");
		add(bReiniciar);
		bReiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tablero.reiniciar();
				
			}
		});
		JButton bTop = new JButton("Top-10");
		add(bTop);
		bTop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				top = new PTop10();
				
			}
		});
		JButton bCambiarJugador = new JButton("Cambiar Jugador");
		add(bCambiarJugador);
		bCambiarJugador.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
}
