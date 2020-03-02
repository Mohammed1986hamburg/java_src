package oca.interfaces;


public class PKWBSP   implements Check{
	private int kmStand = 14999;
	private boolean gecheckt;
	
	public void setGecheckt(boolean check) {
		this.gecheckt = check;
	}
	public static void main(String[] args) {
		Check pkw =  new PKWBSP();
		PKWBSP p = (PKWBSP) pkw;
	
		
		
//		PKWBSP p = new PKWBSP();
			
		p.check();
	    
		p.setGecheckt(p.checked(p));
		
		System.out.println(p.checkin(p));
		p.checkout(p);
		
		System.out.println(p.gecheckt);

		int wert = Check.valueToBeChecked(p);
		System.out.println(wert);
	}

	@Override
	public void check() {
	PKWBSP a = 	new PKWBSP();
		String s = check(a);
		System.out.println(s);
		}
	private String check(PKWBSP p) {
		return "Dauert noch..";
	}
	
	@Override
	public String ergebnisCheck() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checked(Check c) {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public int zaehlen() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
