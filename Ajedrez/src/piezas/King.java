package piezas;

public class King extends Queen{
	
	public int minC;
	public int minF;
	public int maxC;
	public int maxF;

	//constructor
	public King(String name, String colorFicha, boolean bien, int minC, int minF, int maxC, int maxF) {
		super(name, colorFicha, bien);
		this.minC = minC;
		this.minF = minF;
		this.maxC = maxC;
		this.maxF = maxF;
	}
	
	public King(String name, String colorFicha, boolean bien) {
		super(name, colorFicha, bien);
	}

	@Override
	public String toString() {
		if (getColorFicha() == "Blanco") {
			setName("kB");
			return getName();
		} else {
			setName("kN");
			return getName();
		}
		
	}
	
	
	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {
	    
		if (!tablero[mover_fila][mover_columna].getColorFicha().equals("Blanco")) {

		int dif_fila = mover_fila - seleccionar_fila;
		int dif_columna = mover_columna - seleccionar_columna;
	    
		    // El rey se puede mover una casilla en cualquier dirección.
		    if (dif_fila <= 1 && dif_columna <= 1) {
		        
		    } else {
		    	System.out.println("no entra porque no son los parametros");
		    	setBien(false);
		    }
	    
	  
		}
		
		  return isBien(); 
	}
	
	
	//getters y setters


}
