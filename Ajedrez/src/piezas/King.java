package piezas;

public class King extends Queen {


	// constructor
	
	/**
	 * En el super nos recoge aquellos parametros que se heredan del padre, en este caso Queen. En este constructor recogemos los siguientes parametros:
	 * @param colorFicha.. guardamos el color de la ficha que primero juega, en este caso blanco y en el else el negro
	 * @param name... le guardamos la ficha que está en cada caso del if
	 * @param movimientoValido.. boobleano que nos devuelve true o false dependiendo si el movimiento es valido
	 */

	public King(String name, String colorFicha, boolean movimientoValido) {
		super(name, colorFicha, movimientoValido);
	}

	/**
	 * En este metodo se recogen los parametros del super, es decir, del padre, que hace que le indiquemos que ficha es negra o cual es blanca
	 * @param getColorFicha.. guardamos el color de la ficha que primero juega, en este caso blanco y en el else el negro
	 * @param setName... le guardamos la ficha que está en cada caso del if
	 * @return el nombre de la pieza
	 */
	
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

	/**
	 * Este metodo nos hace el movimiento del rey, el cual, solo puede moverse en una posicion tanto en diagonal, horizontal y vertical, y verifica si al recorrerla hay pieza por el camino, no se mueve
	 * @param mover_fila.. es la posicion que el usuario introduce para que mueva en fila solamente
	 * @param mover_columna.. es la posicion que el usuario introduce para que mueva en columna solamente
	 * @param seleccionar_columna.. el la posicion de la columna que el usuario elije para mover, es decir, la eleccion de su pieza 
	 * @param seleccionar_fila.. el la posicion de la fila que el usuario elije para mover, es decir, la eleccion de su pieza
	 * @param tablero.. es un array bidimensional donde guardamos todas las posiciones de las fichas y en la cual, se mueven a eleccion del usuario
	 * @return un booleano que dependiendo si es true o false, si hay pieza por el camino o no u se ha movido bien o mal
	 */
	
	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila,
			Piezas[][] tablero) {

		int dif_fila = Math.abs(mover_fila - seleccionar_fila);
		int dif_columna = Math.abs(mover_columna - seleccionar_columna);

		// El rey se puede mover una casilla en cualquier dirección.
		if (dif_fila <= 1 && dif_columna <= 1) {
			
			setMovimientoValido(true);

		} else {
			System.out.println("no entra porque no son los parametros");
			setMovimientoValido(false);
		}

		return isMovimientoValido();
	}

	

}
