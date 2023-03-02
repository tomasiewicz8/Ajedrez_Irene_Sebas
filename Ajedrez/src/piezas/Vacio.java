package piezas;

public class Vacio extends Queen{

	private String name;

	//constructor
	public Vacio(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		name = " *";
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
