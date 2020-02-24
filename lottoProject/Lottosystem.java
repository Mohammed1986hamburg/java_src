package lottoProject;

import java.util.Random;

 abstract class Lottosystem {
	
	public int[] zahlenGenerator(int anzahlZahlen, int zahlenBereich) {
		
		int [] zahlen = new int[anzahlZahlen];
		Random rd = new Random();
		
		for (int i = 0; i < zahlen.length; i++) {
			
			 zahlen[i] = rd.nextInt(zahlenBereich)+1;
		}
		return zahlen;
			
	}

	abstract boolean checkDoppeltewerte(int[] zahlen);
}
