package piezas;

/**
 * 
 * @author USUARIO CCC
 *
 */
public class Caballo implements Piezas {

	private String name;

	// constructor
	public Caballo(String name) {
		this.name = name;
	}

	public String toString() {
		name = "cA";
		return name;
	}

	// getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// poner los metodos de los movimientos

	@Override
	public void mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, int posicion_futura, Piezas tablero) {

		if (mover_fila >= 1 && mover_fila <= 8 && mover_columna <= 8 && mover_columna >= 1) {
			System.out.println("esta dentro del tablero");

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
		    							}
		    						}
		    					}
		    				}
		    			}
		    		}
		    	}
		    }
		   

		} else {
			System.out.println("pavo tus cordenadas estan fuera del tablero");
		}
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return null;
	}

}
