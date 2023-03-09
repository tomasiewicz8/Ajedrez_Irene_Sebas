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
