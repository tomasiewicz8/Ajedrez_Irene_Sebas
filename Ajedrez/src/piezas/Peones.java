package piezas;

public class Peones extends King{
	
	private String name;

	//constructor
	public Peones(String name) {
		this.name = name;
	}
	
	public String toString() {
		name = "pN";
		return name;
	}
	
	
	//getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
