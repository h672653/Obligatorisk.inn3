package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	 protected int id;
	 protected int likes;
	 protected String Bruker;
	 protected String Dato;
	 
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.Bruker = bruker;
		this.Dato = dato;
		likes = 0;
		
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
this.id = id;
this.Bruker = bruker;
this.Dato = dato;
likes = 0;

	}
	
	public String getBruker() {
	
		return Bruker;
	}

	public void setBruker(String bruker) {
	
		this.Bruker = bruker;
	
	}

	public String getDato() {
	
		return Dato;
	}

	public void setDato(String dato) {

		this.Dato = dato;
	}

	public int getId() {
	
		return id;
	}

	public int getLikes() {

	return likes;
	}
	
	public void doLike () {

		likes +=1;
	}
	
	public boolean erLik(Innlegg innlegg) {
	
	if (id == innlegg.id) {
		return true;
	}else {
	return false;}
	}
	
	@Override
	public String toString() {
		

	
	
	return id + "\n" + Bruker + "\n" + Dato + "\n" + likes + "\n";
	}
	
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
