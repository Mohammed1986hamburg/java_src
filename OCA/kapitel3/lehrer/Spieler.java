package oca.api;

public class Spieler {
	private String name = "Hugo";
	private int level = 1;
	
	public Spieler() {}
	public Spieler(String name , int level) {
		this.name = name;
		this.level = level;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
