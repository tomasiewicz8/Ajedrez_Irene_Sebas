package piezas;

public class Alfil extends Queen{
	
	private String name;
	private boolean blanco;

	//constructor
	public Alfil(String name, boolean blanco) {
		this.name = name;
		this.blanco = blanco;
	}
	
	@Override
	public String toString() {
		if (blanco == true) {
			name = "aB";
			return name;
		} else {
			name = "aN";
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
