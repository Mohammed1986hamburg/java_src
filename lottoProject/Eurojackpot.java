package lottoProject;

import java.util.Arrays;

public class Eurojackpot extends Lottosystem {
	int[] gewinnZahlen;
	
	public  Eurojackpot() {
		this(5,50);
	}
	
	private Eurojackpot(int zhal, int werteBereich) {
		gewinnZahlen = this.zahlenGenerator(zhal, werteBereich);
	}
	
	public Eurojackpot(int zahl) {
		this();
	}
	
	public static void main(String[] args) {
		Eurojackpot euro = new Eurojackpot();
		System.out.println(Arrays.toString(euro.gewinnZahlen));
	}
	
	@Override
	boolean checkDoppeltewerte(int[] zahlen) {
		return false;
	}

}
