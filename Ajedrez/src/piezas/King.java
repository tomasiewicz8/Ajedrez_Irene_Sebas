package piezas;

public class King extends Queen{
	
	private String name;

	//constructor
	public King(String name) {
		this.name = name;
	}
	public King() {}
	
	
	//getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
