package piezas;

public class Alfil extends Queen {

	private String name;
	private boolean blanco;
	private int minC;
	private int minF;
	private int maxC;
	private int maxF;
	private boolean bien = true;
	public static Piezas Vacio = new Vacio(" *");

	// constructor
	public Alfil(String name, boolean blanco, boolean bien, int minC, int maxC, int minF, int maxF) {
		this.name = name;
		this.blanco = blanco;
		this.minC = minC;
		this.minF = minF;
		this.maxC = maxC;
		this.maxF = maxF;
	}

	@Override
	public String toString() {
		if (blanco == true) {
			name = "aB";
			return name;
		} else {
			name = "aN";
			return name;
		}

	}
	
	

	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {
		
		if (tablero[mover_fila][mover_columna].isBlanco() != blanco) {

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

					if (tablero[seleccionar_fila - s][seleccionar_columna + i] != Vacio) {
						bien = false;
					} else {
						if (tablero[seleccionar_fila - s][seleccionar_columna - i] != Vacio) {
							bien = false;
						} else {
							if (tablero[seleccionar_fila + s][seleccionar_columna + i] != Vacio) {
								bien = false;
							} else {
								if (tablero[seleccionar_fila + s][seleccionar_columna - i] != Vacio) {
									bien = false;
								}
							}
						}

					}
				}

			}
		}
		return bien; 
	}

	// getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBlanco() {
		return blanco;
	}

	public void setBlanco(boolean blanco) {
		this.blanco = blanco;
	}

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

	public boolean isBien() {
		return bien;
	}

	public void setBien(boolean bien) {
		this.bien = bien;
	}

	public static Piezas getVacio() {
		return Vacio;
	}

	public static void setVacio(Piezas vacio) {
		Vacio = vacio;
	}
	

}
