package it.polito.tdp.bar.model;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;

import it.polito.tdp.bar.model.Evento.TipoEvento;

public class Simulatore {
	
	private PriorityQueue<Evento> queue = new PriorityQueue<Evento>();
	
	private int numeroTavoli;
	private int nEventi;
	private Map<Integer, GruppoPersone> mappaGruppi;
	
	//statistiche
	
	private int nClientiInsoddisfatti;
	private int nClientiSoddisfatti;
	private int nClientiTotali;
	
	Random rand = new Random();
	
	public Simulatore() {
		mappaGruppi = new HashMap<Integer, GruppoPersone>();
	}
	
	public void init() {
		
		
	
		this.nEventi = 0;
		this.queue.clear();
		this.numeroTavoli = 15;
		
		this.nClientiInsoddisfatti = 0;
		this.nClientiSoddisfatti = 0;
		this.nClientiTotali = 0;
		
		Evento e = new Evento(TipoEvento.ARRIVO_GRUPPO_CLIENTI, LocalTime.of(8, 0), rand.nextInt(10) + 1, Duration.of((long) (Math.random()*60+60), ChronoUnit.MINUTES), rand.nextFloat());
		GruppoPersone g = new GruppoPersone(e.getNumeroPersone(), e.getTolleranza(), false);
		mappaGruppi.put(g.getId(), g);
		queue.add(e);
		System.out.println(e.toString());
		
		
	}
	
	public void run() {
		
		
		
		while(!queue.isEmpty()) {
			Evento e = queue.poll();
			System.out.println(e.toString());
			
			switch(e.getTipo()) {
			
			case ARRIVO_GRUPPO_CLIENTI:
				if(nEventi<=10) {
					Evento ev = new Evento(TipoEvento.ARRIVO_GRUPPO_CLIENTI, e.getTempo().plus(rand.nextInt(10)+1, ChronoUnit.MINUTES),rand.nextInt(10) + 1, Duration.ofMinutes((long)(Math.random()*60+60)), rand.nextFloat());
					GruppoPersone g = new GruppoPersone(ev.getNumeroPersone(), ev.getTolleranza(), false);
					mappaGruppi.put(g.getId(), g);
					queue.add(ev);
					nEventi++;
					
					
				}
				
			}
		}
		
		for(Map.Entry<Integer, GruppoPersone> it : mappaGruppi.entrySet()) {
			System.out.println(it.getKey()+" "+it.getValue());
		}
		
	}
	

}
