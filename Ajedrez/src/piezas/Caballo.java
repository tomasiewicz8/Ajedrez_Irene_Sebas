package piezas;

public class Caballo implements Piezas {

	private String name;
	private String colorFicha;
	private boolean movimientoValido = true;

	//constructor
	
	/**
	 * En este constructor recogemos los siguientes parametros:
	 * @param ColorFicha.. guardamos el color de la ficha que primero juega, en este caso blanco y en el else el negro
	 * @param Name... le guardamos la ficha que está en cada caso del if
	 * @param movimientoValido.. boobleano que nos devuelve true o false dependiendo si el movimiento es valido
	 */
	
	public Caballo(String name, String colorFicha, boolean movimientoValido) {
		this.name = name;
		this.colorFicha = colorFicha;
		this.movimientoValido = movimientoValido;
	}
	
	/**
	 * En este metodo se recogen los parametros del super, es decir, del padre, que hace que le indiquemos que ficha es negra o cual es blanca
	 * @param getColorFicha.. guardamos el color de la ficha que primero juega, en este caso blanco y en el else el negro
	 * @param setName... le guardamos la ficha que está en cada caso del if
	 * @return el nombre de la pieza
	 */
	
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
		        
			setMovimientoValido(true);
			
		    } else {
		    	if (mover_columna == seleccionar_columna-2 && mover_fila == seleccionar_fila+1) {
		    		
		    		setMovimientoValido(true);
			        
		    	} else {
		    		if (mover_columna == seleccionar_columna+2 && mover_fila == seleccionar_fila-1) {
		    			
		    			setMovimientoValido(true);

		    		} else {
		    			if (mover_columna == seleccionar_columna+2 && mover_fila == seleccionar_fila+1) {
		    				
		    				setMovimientoValido(true);
		    				
		    			} else {
		    				if (mover_columna == seleccionar_columna-1 && mover_fila == seleccionar_fila-2) {
		    					
		    					setMovimientoValido(true);
		    					
		    				} else {
		    					if (mover_columna == seleccionar_columna+1 && mover_fila == seleccionar_fila-2) {
		    						
		    						setMovimientoValido(true);
		    						
		    					} else {
		    						if (mover_columna == seleccionar_columna-1 && mover_fila == seleccionar_fila+2) {
		    							
		    							setMovimientoValido(true);
		    							
		    						} else {
		    							if (mover_columna == seleccionar_columna+1 && mover_fila == seleccionar_fila+2) {
		    								
		    								setMovimientoValido(true);
		    								
		    							} else {
		    								System.out.println(" primo asi no mueve el caballo");
		    								movimientoValido = false;
		    							}
		    						}
		    					}
		    				}
		    			}
		    		}
		    	}
		    }
		return movimientoValido;
	}
	

	
	
	//getters y setters
	
	/**
	 * Nos devuelve el valor name porque era privado
	 * @return nos devuelve el name que es donde estará guardada nuestra pieza
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * Con el set nos deja modificar la variable name porque era privado
	 * @param name: en el se encuentra el nombre de nuestra ficha
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Nos devuelve el valor movimienvoValido porque era privado
	 * @return nos devuelve el boobleano de movimientoValido para saber si el movimiento es correcto o no
	 */

	public boolean isMovimientoValido() {
		return movimientoValido;
	}
	
	/**
	 * Con el set nos deja modificar la variable movimientoValido porque era privado
	 * @param movimientoValiedo: en el se encuentra un booleano en el que nos dice si es un movimiento propio de esa pieza o no
	 */

	public void setMovimientoValido(boolean movimientoValido) {
		this.movimientoValido = movimientoValido;
	}
	
	/**
	 * Nos devuelve el ColorFicha porque era privado
	 * @return nos devuelve el ColorFicha que es donde estará guardada el color de la ficha
	 */

	public String getColorFicha() {
		return colorFicha;
	}

	/**
	 * Con el set nos deja modificar la variable colorFicha porque era privado
	 * @param colorFicha: en el se encuentra color de nuestra ficha
	 */
	
	public void setColorFicha(String colorFicha) {	
	}


	

}
