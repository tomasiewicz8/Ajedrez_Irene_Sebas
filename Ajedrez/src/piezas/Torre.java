package piezas;

import java.util.Scanner;

public class Torre extends Queen {

	/**
	 * En el super nos recoge aquellos parametros que se heredan del padre, en este
	 * caso Queen. En este constructor recogemos los siguientes parametros:
	 */

	// constructores
	public Torre(String name, String colorFicha, boolean movimientoValido) {
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
			setName("tB");
			return getName();
		} else {
			setName("tN");
			return getName();
		}

	}

	/**
	 * Este metodo nos hace el movimiento de la torre, la cual se recorre en
	 * horizontal o vertical y verifica si al recorrerla hay pieza por el camino, no
	 * se mueve
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

		int min;
		int max;
		int fija;

		if (seleccionar_fila == mover_fila && seleccionar_columna != mover_columna) {

			fija = seleccionar_fila;

			if (seleccionar_columna > mover_columna) {
				min = mover_columna;
				max = seleccionar_columna;
			} else {
				min = seleccionar_columna;
				max = mover_columna;
			}

			// falta comprobar la ultima posicion para ver si es de nuestro color o no para
			// comer y restar el max en el bucle
			for (int i = min + 1; i <= max - 1; i++) {
				if (!tablero[fija][i].getColorFicha().equals(" *")) {
					System.out.print(" Hay piezas por el camino, ");
					setMovimientoValido(false);
				}

			}

			setMovimientoValido(true);

		} else {
			if (seleccionar_fila != mover_fila && seleccionar_columna == mover_columna) {

				fija = seleccionar_columna;

				if (seleccionar_fila > mover_fila) {
					min = mover_fila;
					max = seleccionar_fila;

				} else {
					min = seleccionar_fila;
					max = mover_fila;
				}

				for (int i = min + 1; i <= max - 1; i++) {

					if (!tablero[i][fija].getColorFicha().equals(" *")) {
						// if que compruebe si hay ficha por el camino
						System.out.print(" Hay piezas por el camino, ");
						setMovimientoValido(false);
					}

				}
				setMovimientoValido(true);
			} else {
				System.out.println(" no es ni horizontal ni vertical");
				setMovimientoValido(false);
			}
		}
		return isMovimientoValido();
	}

}
