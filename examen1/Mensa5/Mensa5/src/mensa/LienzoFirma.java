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
import javax.swing.JLabel;

/**
 *
 * @author quevedo
 */
public class LienzoFirma extends javax.swing.JPanel{

	private boolean subrayada;
	private boolean tachada;

	private JLabel target;

    LienzoFirma(){
        super();
        puntos=new LinkedList<>();
        trazoRadio=4;
        trazoColor=Color.BLACK;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        int radio=trazoRadio;
        g.setColor(trazoColor);
        Iterator<Point> i=puntos.iterator();
        while(i.hasNext()){
            Point p=i.next();
            g.fillOval(p.x-radio,p.y-radio, radio*2, radio*2);
        }
 
    }

   public void insertaPunto(Point p){
           puntos.add(p);
    }
    
    public void setTrazoRadio(int trazoRadio){
        if(trazoRadio>=0)
            this.trazoRadio=trazoRadio;
    }
    
    public int getTrazoRadio(){
        return trazoRadio;
    }
    
    public void setTrazoColor(Color trazoColor){
        if(trazoColor!=null)
            this.trazoColor=trazoColor;
    }
    
    public Color getTrazoColor(){
        return trazoColor;
    }
    
    public void borra(){
        puntos.clear();
    }
    
    private int trazoRadio; // Grosor del trazo
    private Color trazoColor; // Color con el que se pintará el trazo
    private LinkedList<Point> puntos; // Puntos que forman el trazo
}
