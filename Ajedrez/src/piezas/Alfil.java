package piezas;

public class Alfil extends Queen {

	private int minC;
	private int minF;
	private int maxC;
	private int maxF;

	// constructor
	public Alfil(String name, String colorFicha, boolean bien, int minC, int maxC, int minF, int maxF) {
		super(name, colorFicha, bien);
		this.minC = minC;
		this.minF = minF;
		this.maxC = maxC;
		this.maxF = maxF;
	}

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
						setBien(false);

					} 

				}
			}
			setBien(true);
		} else {
			setBien(false);
		}

		return isBien();
	}

	// getters y setters

	public int getMinC() {
		return minC;
	}

	public void setMinC(int minC) {
		this.minC = minC;
	}

	public int getMinF() {
		return minF;
	}

	public void setMinF(int minF) {
		this.minF = minF;
	}

	public int getMaxC() {
		return maxC;
	}

	public void setMaxC(int maxC) {
		this.maxC = maxC;
	}

	public int getMaxF() {
		return maxF;
	}

	public void setMaxF(int maxF) {
		this.maxF = maxF;
	}

}
