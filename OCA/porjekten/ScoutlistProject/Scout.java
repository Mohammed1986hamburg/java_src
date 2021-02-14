package ScoutlistProject;

import java.util.ArrayList;

public class Scout {
	
	private String name;
	private char gender;
	private float weight;
	private ArrayList<Tool> invent = new ArrayList<Tool>();
	


	public Scout(String name, char gender, float weight) {
		this.name = name;
		this.gender = gender;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}

	public ArrayList<Tool> getInvent() {
		return invent;
	}

	public void setInvent(ArrayList<Tool> invent) {
		this.invent = invent;
	}
	
	public void addTool(Tool tool) {
		this.invent.add(tool);
	}

	@Override
	public String toString() {
		return "Hi I'm "+this.name+" !";
	}
	
	public String toolsAndWeight() {
		String text = "";
		for (Tool tool : invent) {
			text += tool.getName()+", ";
		}
		
		return text += getWeight();
	}
	
	public float calcTollWeight() {
		float weight = this.weight;
		for (Tool tool : invent) {
			weight += tool.getWeight();
		}
		
		return weight;
	}
	
	
	

}
