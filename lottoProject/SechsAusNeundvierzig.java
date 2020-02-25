package oca.lottoProject;

import java.util.Arrays;

public class SechsAusNeundvierzig extends Lottosystem {

	int zusatzzahl ;
	int[] _6Aus49 ;
	
	public SechsAusNeundvierzig(){
		
		}
	
	public SechsAusNeundvierzig(int zahl, int bereich) {
		super(zahl,bereich);
		_6Aus49 = super.getGewinnZahlen();
	
	}
	public SechsAusNeundvierzig(int zahl) {
		super(zahl);
		this.zusatzzahl = zahl;
	}
	
	
	
	public static void main(String[] args) {
		SechsAusNeundvierzig spiel =  new SechsAusNeundvierzig();

		
		System.out.println(Arrays.toString(spiel.getGewinnZahlen()));
		
	}


//	boolean checkDoppelteWerte(int[] zahlen) {return false;}

	
}
