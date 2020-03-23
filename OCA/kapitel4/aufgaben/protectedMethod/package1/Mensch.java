package kapitel4.aufgaben.protectedMethod.package1;

public class Mensch {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected String arbriten(Mensch name) {
		return name.getName()+" arbeitet ".concat(dauer())+ " Stunden";
	}
	
	public String gehen() {
		return "Ich gehe";
	}
	
	private String dauer() {
		return "8";
	}

}
