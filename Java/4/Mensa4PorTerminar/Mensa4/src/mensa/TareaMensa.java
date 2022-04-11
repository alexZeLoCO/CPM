/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensa;

/**
 *
 * @author Rodriguez Lopez, Alejandro // UO281827 
 */
public class TareaMensa extends Tarea {

	Envio vM;	
	private boolean isStopped;

	public TareaMensa (Envio vM) {
		this.vM = vM;
	}

	@Override
	public void Start() {
		this.isStopped = false;
	}

	@Override
	public void Finish(float ImporteTotal) {
		this.vM.bCalcularImporte.setEnabled(true);
		this.vM.bPararCalculo.setEnabled(false);
	}

	@Override
	public void DetalleDeCalculo(String Msg) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void InicioCalculo() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void FinCalculo() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void ProporcionCalculo(float P) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void DetalleDeImporte(String Msg) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public boolean Stop() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
}
