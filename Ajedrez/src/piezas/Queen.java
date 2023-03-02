package piezas;

public class Queen implements Piezas{

	
	//poner los metodos de los movimientos
	
	private String name;
	private boolean blanco;
	private boolean bien;

	//constructor
	public Queen(String name, boolean blanco) {
		this.name = name;
		this.blanco=blanco;
	}
	
	public Queen() {}
	
	public String toString() {
		if (blanco == true) {
			name = "qB";
			return name;
		} else {
			name = "qN";
			return name;
		}
		
	}
	
	
	public boolean isBlanco() {
		return blanco;
	}

	public void setBlanco(boolean blanco) {
		this.blanco = blanco;
	}

	//getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, int posicion_futura, int [][] tablero) {
		return bien;
	}
}
