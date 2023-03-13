package piezas;

public class Alfil extends Queen {

	/**
	 * En el super nos recoge aquellos parametros que se heredan del padre, en este
	 * caso Queen. En este constructor recogemos los siguientes parametros:
	 */

	// constructor
	public Alfil(String name, String colorFicha, boolean movimientoValido) {
		super(name, colorFicha, movimientoValido);
	}

	/**
	 * En este metodo se recogen los parametros del super, es decir, del padre, que
	 * hace que le indiquemos que ficha es negra o cual es blanca
	 * 
	 * @param getColorFicha.. guardamos el color de la ficha que primero juega, en
	 *                        este caso blanco y en el else el negro
	 * @param setName...      le guardamos la ficha que está en cada caso del if
	 * @return el nombre de la pieza
	 */

	@Override
	public String toString() {
		if (getColorFicha() == "Blanco") {
			setName("aB");
			return getName();
		} else {
			setName("aN");
			return getName();
		}

	}

	/**
	 * Este metodo nos hace el movimiento del alfil, la cual se mueve en diagonal,
	 * si al recorrerla hay pieza por el camino no se mueve
	 * 
	 * @param mover_fila..          es la posicion que el usuario introduce para que
	 *                              mueva en fila solamente
	 * @param mover_columna..       es la posicion que el usuario introduce para que
	 *                              mueva en columna solamente
	 * @param seleccionar_columna.. el la posicion de la columna que el usuario
	 *                              elije para mover, es decir, la eleccion de su
	 *                              pieza
	 * @param seleccionar_fila..    el la posicion de la fila que el usuario elije
	 *                              para mover, es decir, la eleccion de su pieza
	 * @param tablero..             es un array bidimensional donde guardamos todas
	 *                              las posiciones de las fichas y en la cual, se
	 *                              mueven a eleccion del usuario
	 * @param movimientoValido..    boobleano que nos devuelve true o false
	 *                              dependiendo si el movimiento es valido
	 * @return un booleano que dependiendo si es true o false, si hay pieza por el
	 *         camino o no u se ha movido bien o mal
	 */

	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila,
			Piezas[][] tablero) {

		int minC;
		int minF;
		int maxC;
		int maxF;

		if (seleccionar_columna > mover_columna) {
			minC = mover_columna;
			maxC = seleccionar_columna;
		} else {
			minC = seleccionar_columna;
			maxC = mover_columna;
		}

		if (seleccionar_fila > mover_fila) {
			minF = mover_fila;
			maxF = seleccionar_fila;

		} else {
			minF = seleccionar_fila;
			maxF = mover_fila;
		}

		int dif_columna = Math.abs(maxC - minC);
		int dif_fila = Math.abs(maxF - minF);

		if (dif_columna == dif_fila) {

			for (int i = minC + 1; i <= maxC - 1 && i >= 2 && i <= 7; i++) {
				for (int s = minF + 1; s <= maxF - 1 && s >= 2 && s <= 7; s++) {

					if (!tablero[s][i].getColorFicha().equals(" *")) {
						setMovimientoValido(false);

					}

				}
			}
			setMovimientoValido(true);
		} else {
			setMovimientoValido(false);
		}

		return isMovimientoValido();
	}

}
