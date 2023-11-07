package Presentacion;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class POpcionesT extends JPanel{
	private String opcionSeleccionada = null;
	private JTextField tamañoT;
	private String matriz;
	
	public POpcionesT() {
		this.setLayout(new GridLayout(1,2,3,3));
		JLabel tam = new JLabel("Tamaño:");
		tam.setFont(new Font(tam.getFont().getFontName(),Font.BOLD,tam.getFont().getSize()));
		this.tamañoT = new JTextField();
		JPanel tamaño = new JPanel();
		tamaño.setLayout(new GridLayout(1,2,2,2));
		tamaño.add(tam);
		tamaño.add(tamañoT);
		add(tamaño);
		JLabel dif = new JLabel("Dificultad:");
		dif.setFont(new Font(dif.getFont().getFontName(),Font.BOLD,dif.getFont().getSize()));
		add(dif);
		JRadioButton facil = new JRadioButton("Fácil");
        JRadioButton medio = new JRadioButton("Medio");
        JRadioButton dificil = new JRadioButton("Dificil");
        ButtonGroup group = new ButtonGroup();
        group.add(facil);
        group.add(medio);
        group.add(dificil);
        ActionListener dificultad = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (facil.isSelected()) {
                    opcionSeleccionada = "Fácil";
                } else if (medio.isSelected()) {
                    opcionSeleccionada = "Medio";
                } else if (dificil.isSelected()) {
                    opcionSeleccionada = "Difícil";
                }
				
			}
        	
        };
        facil.addActionListener(dificultad);
        medio.addActionListener(dificultad);
        dificil.addActionListener(dificultad);
        
        add(facil);
        add(medio);
        add(dificil);
        
	}

	public String getMatriz() {
		return matriz;
	}

	public String getOpcionSeleccionada() {
		return opcionSeleccionada;
	}

	public void setOpcionSeleccionada(String opcionSeleccionada) {
		this.opcionSeleccionada = opcionSeleccionada;
	}

	public JTextField getTamañoT() {
		return tamañoT;
	}

	public void setTamañoT(JTextField tamañoT) {
		this.tamañoT = tamañoT;
	}
	
}
