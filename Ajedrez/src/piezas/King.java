package piezas;

public class King extends Queen{
	
	private String name;
	private boolean blanco;
	public boolean bien = true;
	public int minC;
	public int minF;
	public int maxC;
	public int maxF;
	public static Piezas Vacio = new Vacio(" *","verde");

	//constructor
	public King(String name, String colorFicha, boolean bien, int minC, int minF, int maxC, int maxF) {
		super(name, colorFicha, bien);
		this.name = name;
		this.colorFicha = colorFicha;
		this.bien = bien;
		this.minC = minC;
		this.minF = minF;
		this.maxC = maxC;
		this.maxF = maxF;
	}

	@Override
	public String toString() {
		if (blanco == true) {
			name = "kB";
			return name;
		} else {
			name = "kN";
			return name;
		}
		
	}
	
	
	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {
	    
		if (!tablero[mover_fila][mover_columna].getColorFicha().equals(blanco)) {

		int dif_fila = mover_fila - seleccionar_fila;
		int dif_columna = mover_columna - seleccionar_columna;
	    
		    // El rey se puede mover una casilla en cualquier dirección.
		    if (dif_fila <= 1 && dif_columna <= 1) {
		        
		    } else {
		    	System.out.println("no entra porque no son los parametros");
		    	bien = false;
		    }
	    
	  
		}
		
		  return bien; 
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



	public static Piezas getVacio() {
		return Vacio;
	}

	public static void setVacio(Piezas vacio) {
		Vacio = vacio;
	}
	
	

}
