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
			setName("tB");
			return getName();
		} else {
			setName("tN");
			return getName();
		}
		
	}
	
	

	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {
		
		if (tablero[mover_fila][mover_columna].getColorFicha().equals("Blanco")) {

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

			for (int i = minC; i <= maxC; i++) {
				for (int s = minF; s <= maxF; s++) {

					if (tablero[seleccionar_fila - s][seleccionar_columna + i].getColorFicha().equals(" *")) {
						setBien(false);
					} else {
						if (tablero[seleccionar_fila - s][seleccionar_columna - i].getColorFicha().equals(" *")) {
							setBien(false);
						} else {
							if (tablero[seleccionar_fila + s][seleccionar_columna + i].getColorFicha().equals(" *")) {
								setBien(false);
							} else {
								if (tablero[seleccionar_fila + s][seleccionar_columna - i].getColorFicha().equals(" *")) {
									setBien(false);
								}
							}
						}

					}
				}

			}
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
