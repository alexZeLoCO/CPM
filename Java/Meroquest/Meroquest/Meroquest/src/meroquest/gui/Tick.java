/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827 
 */
public class Tick extends JPanel {

	private boolean tick;
	public Color color;

	/**
	 * Crea nuevo Tick.
	 */
	public Tick () {
		super();
		this.color = Color.GREEN;
		this.tick = true;
		System.out.println("Creando tick");
	}

	/**
	 * Asigna el color del Tick.
	 * 
	 * @param c Color.
	 */
	public void setColor (Color c) {
		this.color = c;
	}

	/**
	 * Retorna el color con el que se dibujará el siguiente Tick.
	 * 
	 * @return Color del siguiente Tick.
	 */
	public Color getColor () {
		return this.color;
	}

	/**
	 * Cambia el Tick por una Cruz.
	 */
	public void switchDrawing () {
		System.out.println("Alternando dibujo de tick");
		this.tick = !this.tick;
	}

	@Override
	public void paint (Graphics g) {
		super.paint(g);
		System.out.println("Pintando tick");
		g.drawImage((new ImageIcon (ClassLoader.getSystemResource("jeroquest/gui/images/barbarian.gif"))).getImage(), 0, 0, null);
		if (this.tick) {
			g.setColor(this.color);
			g.drawLine(0, this.getHeight()/2, this.getWidth()/2, this.getHeight());
			g.drawLine(this.getWidth()/2, this.getHeight(), this.getWidth(), 0);
		} else {
			g.setColor(Color.RED);
			g.drawLine(0, 0, this.getWidth(), this.getHeight());
			g.drawLine(0,this.getHeight(), this.getWidth(), 0);
		}
	}
}
