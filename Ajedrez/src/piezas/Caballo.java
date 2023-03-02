package piezas;

/**
 * 
 * @author USUARIO CCC
 *
 */
public class Caballo implements Piezas {

	private String name;
	private boolean blanco;
	private boolean bien;

	//constructor
	public Caballo(String name, boolean blanco) {
		this.name = name;
		this.blanco = blanco;
	}
	
	public String toString() {
		if (blanco == true) {
			name = "cB";
			return name;
		} else {
			name = "cN";
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

	// poner los metodos de los movimientos

	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, int posicion_futura, int[][] tablero) {

		if (mover_columna == seleccionar_columna-2 && mover_fila == seleccionar_fila-1) {
		        posicion_futura = tablero[mover_fila][mover_columna];
		    } else {
		    	if (mover_columna == seleccionar_columna-2 && mover_fila == seleccionar_fila+1) {
			        posicion_futura = tablero[mover_fila][mover_columna];
		    	} else {
		    		if (mover_columna == seleccionar_columna+2 && mover_fila == seleccionar_fila-1) {
		    			 posicion_futura = tablero[mover_fila][mover_columna];
		    		} else {
		    			if (mover_columna == seleccionar_columna+2 && mover_fila == seleccionar_fila+1) {
		    				posicion_futura = tablero[mover_fila][mover_columna];
		    			} else {
		    				if (mover_columna == seleccionar_columna-1 && mover_fila == seleccionar_fila-2) {
		    					posicion_futura = tablero[mover_fila][mover_columna];
		    				} else {
		    					if (mover_columna == seleccionar_columna+1 && mover_fila == seleccionar_fila-2) {
		    						posicion_futura = tablero[mover_fila][mover_columna];
		    					} else {
		    						if (mover_columna == seleccionar_columna-1 && mover_fila == seleccionar_fila+2) {
		    							posicion_futura = tablero[mover_fila][mover_columna];
		    						} else {
		    							if (mover_columna == seleccionar_columna+1 && mover_fila == seleccionar_fila+2) {
		    								posicion_futura = tablero[mover_fila][mover_columna];
		    							} else {
		    								System.out.println("primo asi no mueve el caballo");
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

}
