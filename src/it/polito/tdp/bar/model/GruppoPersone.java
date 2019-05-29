package it.polito.tdp.bar.model;

public class GruppoPersone {
	
	private int idNumeroGruppi = 0;
	private int id;
	private int numeroPersone;
	private float tolleranza;
	private boolean soddisfatti;
	
	public GruppoPersone(int numeroPersone, float tolleranza, boolean soddisfatti) {
		super();
		this.id = ++idNumeroGruppi;
		this.numeroPersone = numeroPersone;
		this.tolleranza = tolleranza;
		this.soddisfatti = soddisfatti;
	}

	public int getIdNumeroGruppi() {
		return idNumeroGruppi;
	}

	public void setIdNumeroGruppi(int idNumeroGruppi) {
		this.idNumeroGruppi = idNumeroGruppi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroPersone() {
		return numeroPersone;
	}

	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}

	public float getTolleranza() {
		return tolleranza;
	}

	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}

	public boolean isSoddisfatti() {
		return soddisfatti;
	}

	public void setSoddisfatti(boolean soddisfatti) {
		this.soddisfatti = soddisfatti;
	}

	@Override
	public String toString() {
		return "GruppoPersone [id=" + id + ", numeroPersone=" + numeroPersone + ", tolleranza=" + tolleranza
				+ ", soddisfatti=" + soddisfatti + "]";
	}
	
	
	

}
