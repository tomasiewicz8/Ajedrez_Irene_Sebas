package piezas;

public class Queen implements Piezas {

	// poner los metodos de los movimientos

	private String name;
	private String colorFicha;
	private boolean movimientoValido;
	boolean buena;

	// constructor
	/**
	 * En este constructor recogemos los siguientes parametros:
	 * 
	 * @param colorFicha..       guardamos el color de la ficha que primero juega,
	 *                           en este caso blanco y en el else el negro
	 * @param name...            le guardamos la ficha que está en cada caso del if
	 * @param movimientoValido.. boobleano que nos devuelve true o false dependiendo
	 *                           si el movimiento es valido
	 */
	public Queen(String name, String colorFicha, boolean movimientoValido) {
		this.name = name;
		this.colorFicha = colorFicha;
		this.movimientoValido = movimientoValido;
	}

	public Queen() {

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
		if (colorFicha == "Blanco") {
			name = "qB";
			return name;
		} else {
			name = "qN";
			return name;
		}

	}

	/**
	 * Este metodo nos hace el movimiento de la reina, la cual, hereda los
	 * movimientos del alfil y la torre, es decir, se mueve en horizontal, vertical
	 * y en diagomal y verifica si al recorrerla hay pieza por el camino, no se
	 * mueve
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
	 * @return un booleano que dependiendo si es true o false, si hay pieza por el
	 *         camino o no u se ha movido bien o mal
	 */

	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila,
			Piezas[][] tablero) {

		Piezas a = new Alfil("aB", "Blanco", buena);
		Piezas t = new Torre("tB", "Blanco", buena);

		if (colorFicha == "Blanco") {
			a = new Alfil("aB", "Blanco", buena);
			t = new Torre("tB", "Blanco", buena);
			if (movimientoValido == a.mover(mover_fila, mover_columna, seleccionar_columna, seleccionar_fila,
					tablero)) {
				setMovimientoValido(true);
			} else {
				if (movimientoValido == t.mover(mover_fila, mover_columna, seleccionar_columna, seleccionar_fila,
						tablero)) {
					setMovimientoValido(true);
				} else {
					setMovimientoValido(false);
				}
			}
		} else {
			a = new Alfil("aN", "Negro", buena);
			t = new Torre("tN", "Negro", buena);
			if (movimientoValido == a.mover(mover_fila, mover_columna, seleccionar_columna, seleccionar_fila,
					tablero)) {
				setMovimientoValido(true);
			} else {
				if (movimientoValido == t.mover(mover_fila, mover_columna, seleccionar_columna, seleccionar_fila,
						tablero)) {
					setMovimientoValido(true);
				} else {
					setMovimientoValido(false);
				}
			}
		}

		return isMovimientoValido();
	}

	// getters y setters

	/**
	 * Nos devuelve el valor movimienvoValido porque era privado
	 * 
	 * @return nos devuelve el boobleano de movimientoValido para saber si el
	 *         movimiento es correcto o no
	 */

	public boolean isMovimientoValido() {
		return movimientoValido;
	}

	/**
	 * Con el set nos deja modificar la variable movimientoValido porque era privado
	 * 
	 * @param movimientoValiedo: en el se encuentra un booleano en el que nos dice
	 *                           si es un movimiento propio de esa pieza o no
	 */

	public void setMovimientoValido(boolean movimientoValido) {
		this.movimientoValido = movimientoValido;
	}

	/**
	 * Nos devuelve el valor name porque era privado
	 * 
	 * @return nos devuelve el name que es donde estará guardada nuestra pieza
	 */

	public String getName() {
		return name;
	}

	/**
	 * Con el set nos deja modificar la variable name porque era privado
	 * 
	 * @param name: en el se encuentra el nombre de nuestra ficha
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Nos devuelve el ColorFicha porque era privado
	 * 
	 * @return nos devuelve el ColorFicha que es donde estará guardada el color de
	 *         la ficha
	 */

	public String getColorFicha() {
		return colorFicha;
	}

	/**
	 * Con el set nos deja modificar la variable colorFicha porque era privado
	 * 
	 * @param colorFicha: en el se encuentra color de nuestra ficha
	 */

	public void setColorFicha(String colorFicha) {
		this.colorFicha = colorFicha;
	}

}
