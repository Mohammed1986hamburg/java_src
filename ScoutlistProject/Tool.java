package ScoutlistProject;

public class Tool {
	
	private String name;
	private float  weight;
	
	public Tool(String name, float weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Tool [name=" + name + ", weight=" + weight + "]";
	}
	
	
	
	

}
