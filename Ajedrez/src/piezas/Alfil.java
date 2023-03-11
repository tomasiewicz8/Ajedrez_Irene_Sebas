package piezas;

public class Alfil extends Queen {

	private int minC;
	private int minF;
	private int maxC;
	private int maxF;

	/**
	 * En el super nos recoge aquellos parametros que se heredan del padre, en este caso Queen. En este constructor recogemos los siguientes parametros:
	 * @param minC.. es una variable donde se guarda el valor minimo de la columna comparado en un if, recogerá el valor o de seleccionar o de mover para despues, tomarlo como rango para recorrerlo en el bucle
	 * @param minF.. es una variable donde se guarda el valor minimo de la fila comparado en un if, recogerá el valor o de seleccionar o de mover para despues, tomarlo como rango para recorrerlo en el bucle
	 * @param maxC.. es una variable donde se guarda el valor maximo de la columna comparado en un if, recogerá el valor o de seleccionar o de mover para despues, tomarlo como rango para recorrerlo en el bucle
	 * @param maxF.. es una variable donde se guarda el valor maximo de la fila comparado en un if, recogerá el valor o de seleccionar o de mover para despues, tomarlo como rango para recorrerlo en el bucle
	 */
	
	// constructor
	public Alfil(String name, String colorFicha, boolean movimientoValido, int minC, int maxC, int minF, int maxF) {
		super(name, colorFicha, movimientoValido);
		this.minC = minC;
		this.minF = minF;
		this.maxC = maxC;
		this.maxF = maxF;
	}
	
	/**
	 * En este metodo se recogen los parametros del super, es decir, del padre, que hace que le indiquemos que ficha es negra o cual es blanca
	 * @param getColorFicha.. guardamos el color de la ficha que primero juega, en este caso blanco y en el else el negro
	 * @param setName... le guardamos la ficha que está en cada caso del if
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
	 * Este metodo nos hace el movimiento del alfil, la cual se mueve en diagonal, si al recorrerla hay pieza por el camino no se mueve
	 * @param mover_fila.. es la posicion que el usuario introduce para que mueva en fila solamente
	 * @param mover_columna.. es la posicion que el usuario introduce para que mueva en columna solamente
	 * @param seleccionar_columna.. el la posicion de la columna que el usuario elije para mover, es decir, la eleccion de su pieza 
	 * @param seleccionar_fila.. el la posicion de la fila que el usuario elije para mover, es decir, la eleccion de su pieza
	 * @param tablero.. es un array bidimensional donde guardamos todas las posiciones de las fichas y en la cual, se mueven a eleccion del usuario
	 * @param movimientoValido.. boobleano que nos devuelve true o false dependiendo si el movimiento es valido 
	 * @return un booleano que dependiendo si es true o false, si hay pieza por el camino o no u se ha movido bien o mal
	 */
	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila,
			Piezas[][] tablero) {

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

					System.out.println(minF + " " + minC + " " + maxF + " " + maxC);
					System.out.println((seleccionar_fila - s) + "," + (seleccionar_columna + i));

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

	// getters y setters

	/**
	 * Nos devuelve el valor min de columna porque era privado
	 * @return nos devuelve el min de columna tanto de seleccionar como mover
	 */
	public int getMinC() {
		return minC;
	}
	
	/**
	 * Con el set nos deja modificar la variable min de columna porque era privado
	 * @param minC: en el se encuentra la posicion minima de la columna
	 */

	public void setMinC(int minC) {
		this.minC = minC;
	}

	/**
	 * Nos devuelve el valor min de fila porque era privado
	 * @return nos devuelve el min de columna tanto de seleccionar como mover
	 */
	
	public int getMinF() {
		return minF;
	}
	
	/**
	 * Con el set nos deja modificar la variable min de fila porque era privado
	 * @param minF: en el se encuentra la posicion minima de la fila
	 */

	public void setMinF(int minF) {
		this.minF = minF;
	}
	
	/**
	 * Nos devuelve el valor maximo de columna porque era privado
	 * @return nos devuelve el min de columna tanto de seleccionar como mover
	 */

	public int getMaxC() {
		return maxC;
	}
	
	/**
	 * Con el set nos deja modificar la variable max de columna porque era privado
	 * @param maxC: en el se encuentra la posicion maxima de la columna
	 */

	public void setMaxC(int maxC) {
		this.maxC = maxC;
	}
	
	/**
	 * Nos devuelve el valor maximo de fila porque era privado
	 * @return nos devuelve el min de columna tanto de seleccionar como mover
	 */

	public int getMaxF() {
		return maxF;
	}
	
	/**
	 * Con el set nos deja modificar la variable max de fila porque era privado
	 * @param maxF: en el se encuentra la posicion maxima de la fila
	 */

	public void setMaxF(int maxF) {
		this.maxF = maxF;
	}

}
