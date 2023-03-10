package piezas;

public class Queen implements Piezas{

	
	//poner los metodos de los movimientos
	
	private String name;
	private String colorFicha;
	private boolean bien;
	boolean buena;

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
	/**
	 * Este metodo nos hace el movimiento de la reina, la cual, hereda los movimientos del alfil y la torre, es decir, se mueve en horizontal, vertical y en diagomal y verifica si al recorrerla hay pieza por el camino, no se mueve
	 * @param mover_fila.. es la posicion que el usuario introduce para que mueva en fila solamente
	 * @param mover_columna.. es la posicion que el usuario introduce para que mueva en columna solamente
	 * @param seleccionar_columna.. el la posicion de la columna que el usuario elije para mover, es decir, la eleccion de su pieza 
	 * @param seleccionar_fila.. el la posicion de la fila que el usuario elije para mover, es decir, la eleccion de su pieza
	 * @param tablero.. es un array bidimensional donde guardamos todas las posiciones de las fichas y en la cual, se mueven a eleccion del usuario
	 * @return un booleano que dependiendo si es true o false, si hay pieza por el camino o no u se ha movido bien o mal
	 */
	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {
		
		
		Piezas a = new Alfil("aB", "Blanco", buena, mover_columna, mover_columna, mover_columna, mover_columna);
		Piezas t = new Torre("tB", "Blanco", buena, mover_columna, mover_columna, mover_columna, buena);
		
		if (colorFicha == "Blanco") {
			a = new Alfil("aB", "Blanco", buena, mover_columna, mover_columna, mover_columna, mover_columna);
			t = new Torre("tB", "Blanco", buena, mover_columna, mover_columna, mover_columna, buena);
			if (bien == a.mover(mover_fila, mover_columna, seleccionar_columna, seleccionar_fila, tablero)) {
				setBien(true);
			} else {
				if (bien == t.mover(mover_fila, mover_columna, seleccionar_columna, seleccionar_fila, tablero)) {
					setBien(true);
				} else {
					setBien(false);
				}
			}
		} else {
			a = new Alfil("aN", "Negro", buena, mover_columna, mover_columna, mover_columna, mover_columna);
			t = new Torre("tN", "Negro", buena, mover_columna, mover_columna, mover_columna, buena);
			if (bien == a.mover(mover_fila, mover_columna, seleccionar_columna, seleccionar_fila, tablero)) {
				setBien(true);
			} else {
				if (bien == t.mover(mover_fila, mover_columna, seleccionar_columna, seleccionar_fila, tablero)) {
					setBien(true);
				} else {
					setBien(false);
				}
			}
		}
		
		
		return isBien();
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
