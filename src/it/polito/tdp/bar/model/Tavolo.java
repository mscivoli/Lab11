package it.polito.tdp.bar.model;

public class Tavolo {

	private int dimensioni;
	private boolean libero;
	private int numeroMinimo;
	private int idClienti;
	
	public Tavolo(int dimensioni, boolean libero) {
		super();
		this.dimensioni = dimensioni;
		this.libero = libero;
		this.numeroMinimo = dimensioni/2;
	}
	public int getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	public boolean isLibero() {
		return libero;
	}
	public void setLibero(boolean libero) {
		this.libero = libero;
	}
	public int getNumeroMinimo() {
		return numeroMinimo;
	}
	public void setNumeroMinimo(int numeroMinimo) {
		this.numeroMinimo = numeroMinimo;
	}
	
	
	
}
