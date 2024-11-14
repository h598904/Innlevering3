package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	// Deklarering av objektvariable
	private int id;
	private String bruker;
	private String dato;
	private int likes;

	public Innlegg(int id, String bruker, String dato) {
		// Initialiserer variabler, setter likes til 0 som standard		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		// Initialiserer variabler med gitt likes-verdi
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	// Gettere og Settere
	public String getBruker() {
		return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;
	}

	public int getLikes() {
		return likes;
	}
	
	// Metode for å øke likes
	public void doLike() {
		likes++;
	}
	
	// Metode for å sjekke om to innlegg er like
	public boolean erLik(Innlegg innlegg) {
		return this.id == innlegg.getId();
	}
	
	// toString-metode
	@Override
	public String toString() {
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		// Implementation not provided as it is optional
		throw new UnsupportedOperationException(TODO.method());
	}
}
