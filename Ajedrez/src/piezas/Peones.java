package piezas;

public class Peones extends King{
	
	private static int maxC;
	private static int maxF;
	private static int minF;
	private static int minC;
	private String name;
	private boolean blanco;

	//constructor
	public Peones(String name, boolean blanco) {
		super(name, blanco, blanco, maxC, maxF, minF, minC);
		this.name = name;
		this.blanco = blanco;
	}
	
	
	@Override
	public String toString() {
		if (blanco == true) {
			name = "pB";
			return name;
		} else {
			name = "pN";
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
