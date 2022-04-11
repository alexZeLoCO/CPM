/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensa;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.awt.Point;
import java.util.Iterator;

/**
 *
 * @author quevedo
 */
public class LienzoFirma extends javax.swing.JPanel{
    LienzoFirma(){
        super();
        puntos=new LinkedList<>();
	this.c = Color.BLACK;
	this.r = 10;
    }
    
    public void addPunto (Point p) {
	    this.puntos.add(p);
    }

    public void setRadio (int r) {
	    this.r = Math.abs(r);
    }

    public void setColor (Color c) {
	    this.c =c;
	    this.repaint();
    }

    public void clear () {
	    this.puntos.clear();
	    this.repaint();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
	g.setColor(this.c);
        Iterator<Point> i=puntos.iterator();
        while(i.hasNext()){
            Point p=i.next();
            // Pintar el punto p con el color y radio indicados
	   int x = (int) p.getX();
	   int y = (int) p.getY();
	   g.fillOval(x, y, this.r * 2, this.r * 2);
        }
            
    }
    
    public void insertaPunto(Point p){
           puntos.add(p);
    }
    
    public void borra(){
        puntos.clear();
    }
    
    private final LinkedList<Point> puntos; // Puntos que forman el trazo

    private Color c;
    private int r;
}
