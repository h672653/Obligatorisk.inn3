package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
	this.innleggtabell = new Innlegg[20];
	
	}

	public Blogg(int lengde) {
this.innleggtabell = new Innlegg[lengde];
this.nesteledig = 0;
}

	public int getAntall() {
return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
return this.innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
for (int i = 0; i< innleggtabell.length; i++) {
	if(innleggtabell[i] == null) {
		return -1;
	}
	if (innleggtabell[i].erLik(innlegg)) {
		return i;
	}
}
return -1;
}

	public boolean finnes(Innlegg innlegg) {
for (int i = 0; i < innleggtabell.length; i++) {
	if(innleggtabell[i] == null) {
		return false;
	}
	
	if(innlegg.getId() == innleggtabell[i].getId()) {
		return true;
	}
}
return false;
	}

	public boolean ledigPlass() {
if(nesteledig < innleggtabell.length) {
	return true;
}
return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
if(finnes(innlegg)) {
	return false;
}else {
	innleggtabell[nesteledig] = innlegg;
	nesteledig++;
	return true;
}
	}
	
	public String toString() {
String tabelltekst = "" + nesteledig + "\n";


for (int i = 0; i < innleggtabell.length; i++) {
	tabelltekst += innleggtabell[i].toString();
}

return tabelltekst;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}