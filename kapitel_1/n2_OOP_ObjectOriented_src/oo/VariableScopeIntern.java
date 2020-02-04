package oca.basis;

public class VariableScopeIntern {
	
	static int alter = 1;
	int zahl = 5;

	public static void main(String[] args) {
		int alter = 2;
		
		if (alter == 2) alter = 3;
		else alter = 0;
		

		System.out.println(alter);
		
		VariableScopeIntern obj = new VariableScopeIntern();
		obj.showScope(obj);

	}
	
	void showScope(VariableScopeIntern obj) {

		int zahl = 3;
		
		if (zahl == alter) System.out.println(alter = 5);
		else System.out.println(obj.zahl + 10);
	}

}
