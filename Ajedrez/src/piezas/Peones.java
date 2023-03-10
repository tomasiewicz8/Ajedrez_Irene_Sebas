package piezas;

public class Peones extends King {

	/**
	 * En el super nos recoge aquellos parametros que se heredan del padre, en este
	 * caso King. En este constructor recogemos los siguientes parametros:
	 * 
	 * @param colorFicha..       guardamos el color de la ficha que primero juega,
	 *                           en este caso blanco y en el else el negro
	 * @param name...            le guardamos la ficha que está en cada caso del if
	 * @param movimientoValido.. boobleano que nos devuelve true o false dependiendo
	 *                           si el movimiento es valido
	 */

	// constructor
	public Peones(String name, String colorFicha, boolean movimientoValido) {
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
			setName("pB");
			return getName();
		} else {
			setName("pN");
			return getName();
		}

	}

	/**
	 * Este metodo nos hace el movimiento de los peones, la cual se mueve por
	 * primera vez o una o dos posiciones hacia delante, luego de una en una solo
	 * para delante tambien y para comer en diagonal obligatoriamente, si al
	 * recorrerla hay pieza por el camino no se mueve
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

		int dif_fila;
		int dif_colum;

		if (tablero[seleccionar_fila][seleccionar_columna].getColorFicha().equals("Blanco")) {

			dif_fila = mover_fila - seleccionar_fila;
			dif_colum = mover_columna - seleccionar_columna;

			// iria la columna recta
			if (seleccionar_columna == mover_columna) {

				if (seleccionar_fila == 2) {
					if (dif_fila == 1 || dif_fila == 2) {

						if (seleccionar_fila + 1 == mover_fila) {

							if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")) {

								setMovimientoValido(true);

							} else {
								setMovimientoValido(false);
							}
						} else {
							if (seleccionar_fila + 2 == mover_fila) {

								if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")
										&& tablero[mover_fila - 1][mover_columna].getColorFicha().equals(" *")) {

									setMovimientoValido(true);

								} else {
									setMovimientoValido(false);
								}
							}
						}
					} else {
						setMovimientoValido(false);
					}
				} else {

					if (seleccionar_fila > 2) {

						if (dif_fila == 1) {

							if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")) {

								setMovimientoValido(true);

							} else {
								setMovimientoValido(false);
							}
						} else {
							setMovimientoValido(false);
						}
					} else {
						setMovimientoValido(false);
					}
				}

			} else {

				if (dif_fila == 1 && (dif_colum == 1 || dif_colum == -1)) {
					if ((tablero[seleccionar_fila + 1][seleccionar_columna - 1].getColorFicha().equals("Negro"))
							|| (tablero[seleccionar_fila + 1][seleccionar_columna + 1].getColorFicha()
									.equals("Negro"))) {

						setMovimientoValido(true);

					} else {
						System.out.println("no hay ninguna pieza para comer");
						setMovimientoValido(false);
					}
				} else {
					setMovimientoValido(false);
				}
			}

		} else {

			if (tablero[seleccionar_fila][seleccionar_columna].getColorFicha().equals("Negro")) {

				dif_fila = seleccionar_fila - mover_fila;
				dif_colum = seleccionar_columna - mover_columna;

				// iria la columna recta
				if (seleccionar_columna == mover_columna) {

					if (seleccionar_fila == 7) {
						if (dif_fila == 1 || dif_fila == 2) {

							if (seleccionar_fila - 1 == mover_fila) {

								if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")) {

									setMovimientoValido(true);

								} else {
									setMovimientoValido(false);
								}
							} else {
								if (seleccionar_fila - 2 == mover_fila) {

									if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")
											&& tablero[mover_fila + 1][mover_columna].getColorFicha().equals(" *")) {

										setMovimientoValido(true);

									} else {
										setMovimientoValido(false);
									}
								}
							}
						} else {
							setMovimientoValido(false);
						}
					} else {

						if (seleccionar_fila < 7) {

							if (dif_fila == 1) {

								if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")) {

									setMovimientoValido(true);

								} else {
									setMovimientoValido(false);
								}
							} else {
								setMovimientoValido(false);
							}
						} else {
							setMovimientoValido(false);
						}
					}

				} else {

					if (dif_fila == 1 && (dif_colum == 1 || dif_colum == -1)) {
						if ((tablero[seleccionar_fila - 1][seleccionar_columna - 1].getColorFicha().equals("Blanco"))
								|| (tablero[seleccionar_fila - 1][seleccionar_columna + 1].getColorFicha()
										.equals("Blanco"))) {

							setMovimientoValido(true);

						} else {
							System.out.println("no hay ninguna pieza para comer");
							setMovimientoValido(false);
						}
					} else {
						setMovimientoValido(false);
					}
				}

			} else {
				setMovimientoValido(false);
			}
		}

		return isMovimientoValido();
	}

}
