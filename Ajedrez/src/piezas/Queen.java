package piezas;

public class Queen implements Piezas{

	
	//poner los metodos de los movimientos
	
	private String name;
	private boolean blanco;
	private boolean bien;

	//constructor
	public Queen(String name, boolean blanco, boolean bien) {
		this.name = name;
		this.blanco=blanco;
		this.bien=bien;
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
	
	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {
		return bien;
	}
	
	
	
	//getters y setters
	
	public boolean isBien() {
		return bien;
	}

	public void setBien(boolean bien) {
		this.bien = bien;
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
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila,
			Piezas[][] tablero) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
