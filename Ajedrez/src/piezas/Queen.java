package piezas;

public class Queen implements Piezas{

	
	//poner los metodos de los movimientos
	
	private String name;
	private String colorFicha;
	private boolean bien;

	//constructor
	public Queen(String name, String colorFicha, boolean bien) {
		this.name = name;
		this.colorFicha = colorFicha;
		this.bien=bien;
	}
	
	public Queen() {}
	
	public String toString() {
		if (colorFicha == "Blanco") {
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


	//getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColorFicha() {
		return colorFicha;
	}

	public void setColorFicha(String colorFicha) {
		this.colorFicha = colorFicha;
	}

	
}
