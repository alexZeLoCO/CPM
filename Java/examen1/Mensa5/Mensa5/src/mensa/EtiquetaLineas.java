/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensa;

import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author aleja
 */
public class EtiquetaLineas extends JLabel {
	
	private boolean subrayada;
	private boolean tachada;

	public EtiquetaLineas () {
		super();
		this.subrayada = false;
		this.tachada = false;
	}

	public void setSubrayada (boolean b) {
		this.subrayada = b;
	}

	public void setTachada (boolean b) {
		this.tachada = b;
	}

	@Override
	public void paint (Graphics g) {
		super.paint(g);
		if (this.subrayada) {
			g.drawLine(0, (int) (this.getHeight() * 0.8), this.getWidth(), (int)(this.getHeight() * 0.8));
		}
		if (this.tachada) {
			g.drawLine(0, (int) (this.getHeight() * 0.55), this.getWidth(), (int)(this.getHeight() * 0.55));
		}
	}
}
