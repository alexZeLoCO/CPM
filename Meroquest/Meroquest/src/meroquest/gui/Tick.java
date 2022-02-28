/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827 
 */
public class Tick extends JPanel {

	private boolean tick;

	public Tick () {
		super();
		this.tick = true;
	}

	public void switchDrawing () {
		this.tick = !this.tick;
	}

	@Override
	public void paint (Graphics g) {
		super.paint(g);
		if (this.tick) {
			g.setColor(Color.GREEN);
			g.drawLine(0, this.getHeight()/2, this.getWidth()/2, this.getHeight());
			g.drawLine(this.getWidth()/2, this.getHeight(), this.getWidth(), 0);
		} else {
			g.setColor(Color.RED);
			g.drawLine(0, 0, this.getWidth(), this.getHeight());
			g.drawLine(0,this.getHeight(), this.getWidth(), 0);
		}
	}
}
