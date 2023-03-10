package piezas;

public class Caballo implements Piezas {

	private String name;
	private String colorFicha;
	private boolean bien = true;

	//constructor
	public Caballo(String name, String colorFicha, boolean bien) {
		this.name = name;
		this.colorFicha = colorFicha;
		this.bien = bien;
	}
	
	@Override
	public String toString() {
		if (colorFicha == "Blanco") {
			name = "cB";
			return name;
		} else {
			name = "cN";
			return name;
		}
		
	}
	
	
	// poner los metodos de los movimientos
	/**
	 * Este metodo nos hace el movimiento del caballo, la cual se mueve en L y puede saltar otras piezas, y verifica si al recorrerla hay pieza por el camino, no se mueve
	 * @param mover_fila.. es la posicion que el usuario introduce para que mueva en fila solamente
	 * @param mover_columna.. es la posicion que el usuario introduce para que mueva en columna solamente
	 * @param seleccionar_columna.. el la posicion de la columna que el usuario elije para mover, es decir, la eleccion de su pieza 
	 * @param seleccionar_fila.. el la posicion de la fila que el usuario elije para mover, es decir, la eleccion de su pieza
	 * @param tablero.. es un array bidimensional donde guardamos todas las posiciones de las fichas y en la cual, se mueven a eleccion del usuario
	 * @return un booleano que dependiendo si es true o false, si hay pieza por el camino o no u se ha movido bien o mal
	 */
	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {
		if (mover_columna == seleccionar_columna-2 && mover_fila == seleccionar_fila-1) {
		        
			setBien(true);
			
		    } else {
		    	if (mover_columna == seleccionar_columna-2 && mover_fila == seleccionar_fila+1) {
		    		
		    		setBien(true);
			        
		    	} else {
		    		if (mover_columna == seleccionar_columna+2 && mover_fila == seleccionar_fila-1) {
		    			
		    			setBien(true);

		    		} else {
		    			if (mover_columna == seleccionar_columna+2 && mover_fila == seleccionar_fila+1) {
		    				
		    				setBien(true);
		    				
		    			} else {
		    				if (mover_columna == seleccionar_columna-1 && mover_fila == seleccionar_fila-2) {
		    					
		    					setBien(true);
		    					
		    				} else {
		    					if (mover_columna == seleccionar_columna+1 && mover_fila == seleccionar_fila-2) {
		    						
		    						setBien(true);
		    						
		    					} else {
		    						if (mover_columna == seleccionar_columna-1 && mover_fila == seleccionar_fila+2) {
		    							
		    							setBien(true);
		    							
		    						} else {
		    							if (mover_columna == seleccionar_columna+1 && mover_fila == seleccionar_fila+2) {
		    								
		    								setBien(true);
		    								
		    							} else {
		    								System.out.println(" primo asi no mueve el caballo");
		    								bien = false;
		    							}
		    						}
		    					}
		    				}
		    			}
		    		}
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
	

	public boolean isBien() {
		return bien;
	}

	public void setBien(boolean bien) {
		this.bien = bien;
	}

	public String getColorFicha() {
		return colorFicha;
	}

	
	public void setColorFicha(String colorFicha) {	
	}
	

}
