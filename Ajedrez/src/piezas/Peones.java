package piezas;

public class Peones extends King{
	
	private static int maxC;
	private static int maxF;
	private static int minF;
	private static int minC;
	private String name;
	private boolean blanco;
	private int fija;

	//constructor
	public Peones(String name, boolean blanco, int fija) {
		super(name, blanco, blanco, maxC, maxF, minF, minC);
		this.name = name;
		this.blanco = blanco;
		this.fija = fija;
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


	
	
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {

		if (tablero[mover_fila][mover_columna].isBlanco() != blanco) {
			
			fija = seleccionar_columna;
			
			//fila tiene que ser una posicion de más
			for (int i = seleccionar_fila ; i <= mover_fila ; i++) {
				
				if (!tablero[i][fija].equals(Vacio)) {
		            bien = false;
				}	
			}
			System.out.print("Hay piezas por el camino, ");
			
			
		}
	   
	}
		
		
		
		/*
		
		if (tablero[mover_fila][mover_columna].isBlanco() != blanco) {
		
	    for para ver si hay pieza pero seria desde seleccionar fila hasta mover fila sin más porque siempre va para arriba, de uno en uno
			
			if (si selecionar es la inicial fila y columna) {
				if (en ese caso, comprobar que mover fila sea igual a 2 o 1 posicion o que ) {
					
				}
			} else {
				comprobar que mover fila sea igual a 2 o 1 posicion o que
		}
	    
	    si hay piezas del oponente en su diagonal se puede mover
			
			*/
		


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
