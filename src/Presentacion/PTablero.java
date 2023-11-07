package Presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;

public class PTablero extends JPanel{
	private int[][] vecesOprimido;
    private Tablero tablero;

    public PTablero() {
        this.tablero = new Tablero(5); // Tamaño por defecto
        this.vecesOprimido = new int[tablero.darTablero().length][tablero.darTablero().length];

        setPreferredSize(new Dimension(500, 500)); // Tamaño del tablero

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = e.getY() * tablero.darTablero().length / getHeight();
                int columna = e.getX() * tablero.darTablero().length / getWidth();
                tablero.jugar(fila, columna);
                aumentarVecesOprimido(fila, columna);
                repaint();
            }
        });
    }

    public void nuevoTablero(int tamano) {
        this.tablero = new Tablero(tamano);
        this.vecesOprimido = new int[tamano][tamano];
        repaint();
    }
    public void reiniciar() {
    	this.tablero.reiniciar();
        repaint();
    }
    private void aumentarVecesOprimido(int fila, int columna) {
        vecesOprimido[fila][columna]++;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        boolean[][] matrizTablero = tablero.darTablero();

        Graphics2D g2d = (Graphics2D) g;
        int celdaSize = getWidth() / matrizTablero.length;

        for (int i = 0; i < matrizTablero.length; i++) {
            for (int j = 0; j < matrizTablero[i].length; j++) {
                Rectangle rect = new Rectangle(j * celdaSize, i * celdaSize, celdaSize, celdaSize);
                g2d.setColor(matrizTablero[i][j] ? Color.BLACK : Color.darkGray);
                g2d.fill(rect);

                g2d.setColor(Color.WHITE);
                g2d.drawString(String.valueOf(vecesOprimido[i][j]), j * celdaSize + celdaSize / 2, i * celdaSize + celdaSize / 2);
            }
        }
    }
}