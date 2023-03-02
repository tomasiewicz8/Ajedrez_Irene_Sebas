package piezas;

public class King extends Queen{
	
	private String name;
	private boolean blanco;

	//constructor
	public King(String name, boolean blanco) {
		this.name = name;
		this.blanco = blanco;
	}
	
	public String toString() {
		if (blanco == true) {
			name = "kB";
			return name;
		} else {
			name = "kN";
			return name;
		}
		
	}
	
	
	//getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBlanco() {
		return blanco;
	}

	public void setBlanco(boolean blanco) {
		this.blanco = blanco;
	}

}
