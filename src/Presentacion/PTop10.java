package Presentacion;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Top10;

public class PTop10 extends JPanel{
	private Top10 top10;

    public PTop10() {
        this.top10 = new Top10(); 

        StringBuilder top10Info = new StringBuilder("<html><h2>Top 10 Jugadores</h2><br>");

        for (RegistroTop10 registro : top10.darRegistros()) {
        	top10Info.append(registro.darNombre()).append(" - Puntaje: ").append(registro.darPuntos()).append("<br>");
        }

        JOptionPane.showMessageDialog(null, top10Info.toString(), "Top 10 Jugadores", JOptionPane.INFORMATION_MESSAGE);
    }
}

