package oca.methods;

public class Mensch {

	private String name ;
	
	// getter
	public String getName() { return name; }

	// setter
	public void setName(String name) { 	this.name = name;}

	// methods
	protected String arbeiten(Mensch name) {
		return (name.getName() + " arbeite ".concat(dauer()) + " Stunden");
	}
	
	public String gehen() {
		return "Ich gehe";
	}
	
	private String dauer() {
		return "8";
	}
}
