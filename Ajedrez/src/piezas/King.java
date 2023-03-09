package piezas;

public class King extends Queen {

	public int minC;
	public int minF;
	public int maxC;
	public int maxF;

	// constructor
	public King(String name, String colorFicha, boolean bien, int minC, int minF, int maxC, int maxF) {
		super(name, colorFicha, bien);
		this.minC = minC;
		this.minF = minF;
		this.maxC = maxC;
		this.maxF = maxF;
	}

	public King(String name, String colorFicha, boolean bien) {
		super(name, colorFicha, bien);
	}

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

	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila,
			Piezas[][] tablero) {

		int dif_fila = Math.abs(mover_fila - seleccionar_fila);
		int dif_columna = Math.abs(mover_columna - seleccionar_columna);

		// El rey se puede mover una casilla en cualquier dirección.
		if (dif_fila <= 1 && dif_columna <= 1) {
			
			setBien(true);

		} else {
			System.out.println("no entra porque no son los parametros");
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
