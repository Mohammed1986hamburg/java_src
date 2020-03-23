package oca.lottoProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

   abstract class Lottosystem {
	private  int[] gewinnZahlen ;
	
	public int[] getGewinnZahlen() {
		return Arrays.copyOfRange(gewinnZahlen, 0,gewinnZahlen.length);
	}
	// Konstruktoren
	 public Lottosystem() {};
	  
	 public Lottosystem(int anzahlZahlen,int anzahlWerteBereich) {
		  gewinnZahlen = zahlenGenerator(anzahlZahlen, anzahlWerteBereich);
	  }
	 public Lottosystem(int wert) {
		  
	  }
	  
	
	  // Methoden
	  public int[] zahlenGenerator(int anzahlZahlen, int zahlenBereich) {
		int [] zahlen = new int [anzahlZahlen];
		Random rd = new Random();
		
		for(int i = 0 ; i <zahlen.length ; i++ ) {
			zahlen[i] = rd.nextInt(zahlenBereich )+1;
		}
		
		return zahlen;
		
	}
	
//	 abstract boolean checkDoppelteWerte(int[] zahlen);
	 
	
}
