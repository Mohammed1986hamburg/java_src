package lottoProject;

import java.util.Arrays;

public class SechsAusNeundvierzig extends Lottosystem {
	
	public static void main(String[] args) {
		SechsAusNeundvierzig spiel = new SechsAusNeundvierzig();
		
		System.out.println(Arrays.toString(spiel.zahlenGenerator(6, 49)));
		
//		Lottosystem lotto = new Lottosystem();    // can not beacuse class Lottosystem is abstract
		
		Lottosystem lotto = new SechsAusNeundvierzig();
		System.out.println(Arrays.toString(lotto.zahlenGenerator(3, 30)));
		
	}
	
	@Override
	boolean checkDoppeltewerte(int[] zahlen) {
		return true;
	}

}
