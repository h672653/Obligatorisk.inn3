package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
	    try {
			PrintWriter skriver = new PrintWriter(mappe + "" + filnavn);
		skriver.println(samling.getAntall());
		for (int i = 0; i < samling.getAntall(); i++) {
			
			skriver.println(samling.getSamling()[i].toString());
		}
	
		skriver.close();
		}
		catch (FileNotFoundException e) {
		return false;	
		}
		return true;
	}
}
