/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pintar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Rodriguez Lopez, Alejandro // UO281827 
 */
public class PaintPanel extends JPanel {
	
	private int c;
	private Color color;

	private int r = 20;
	private int x;
	private int y;

	public PaintPanel () {
		super();
		this.color = Color.BLUE;
		this.c = 0;
		this.x = 0;
		this.y = 0;
	}

	public void setX (int x) {
		if (x < 0) {
			throw new IllegalArgumentException();
		}		
		this.x = x;
	}

	public void setY (int y) {
		if (y < 0) {
			throw new IllegalArgumentException();
		}
		this.y = y;
	}

	public void setColor (Color c) {
		this.color = c;
	}

	public Color getColor () {
		return this.color;
	}

	@Override
	public void paint (Graphics g) {
		// paint (Graphics) se llama muy frecuentemente, por lo que es necesario que el contenido
		// no tenga calculos.
		super.paint(g);
		g.setColor(this.getColor());
		g.drawLine(0, 0, this.x, this.y);
		g.drawLine(this.getWidth(), 0, this.x, this.y);
		g.drawLine(0, this.getHeight(), this.x, this.y);
		g.drawLine(this.getWidth(), this.getHeight(), this.x, this.y);
		g.drawOval(this.x - this.r, this.y - this.r, this.r*2, this.r*2);
	}	
}
