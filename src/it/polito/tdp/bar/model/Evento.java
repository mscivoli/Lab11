package it.polito.tdp.bar.model;

import java.time.Duration;
import java.time.LocalTime;

public class Evento {
	
	public enum TipoEvento{
		ARRIVO_GRUPPO_CLIENTI,
		CLIENTI_SPARISCONO
	}
	
	private TipoEvento tipo;
	private LocalTime tempo;
	private int numeroPersone;
	private Duration durata;
	private float tolleranza;
	
	public Evento(TipoEvento tipo, LocalTime tempo, int numeroPersone, Duration durata, float tolleranza) {
		super();
		this.tipo = tipo;
		this.tempo = tempo;
		this.numeroPersone = numeroPersone;
		this.durata = durata;
		this.tolleranza = tolleranza;
	}
	
	public TipoEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
	}

	public LocalTime getTempo() {
		return tempo;
	}
	public void setTempo(LocalTime tempo) {
		this.tempo = tempo;
	}
	public int getNumeroPersone() {
		return numeroPersone;
	}
	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}
	public Duration getDurata() {
		return durata;
	}
	public void setDurata(Duration durata) {
		this.durata = durata;
	}
	public float getTolleranza() {
		return tolleranza;
	}
	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}

	@Override
	public String toString() {
		return "Evento [tipo=" + tipo + ", tempo=" + tempo + ", numeroPersone=" + numeroPersone + ", durata=" + durata.toMinutes()
				+ ", tolleranza=" + tolleranza + "]";
	}
	
	
	

}
