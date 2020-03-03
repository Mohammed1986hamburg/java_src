package oca.uebungInterface;

public abstract interface Lesen {
	

	String wasWirdgelesen(Lesen objekt);
	
	int lesedauer(Lesen objekt);
	
	default void beenden() {
		System.out.println("Zu ende gelesen");
	}
}
