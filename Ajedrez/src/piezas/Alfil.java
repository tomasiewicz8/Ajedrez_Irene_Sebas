package piezas;

public class Alfil extends Queen {

	private String name;
	private boolean blanco;

	// constructor
	public Alfil(String name, boolean blanco) {
		this.name = name;
		this.blanco = blanco;
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
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila,
			Piezas[][] tablero) {
		return super.mover(mover_fila, mover_columna, seleccionar_columna, seleccionar_fila, tablero);
	}

	
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero, Piezas Vacio) {
		
	// Movimiento del alfil en diagonal hacia arriba y hacia la derecha
		for (int i = 1; i < 8; i++) {
			if (tablero[seleccionar_fila - i][seleccionar_columna + i] != Vacio) { // Comprueba si hay una pieza del mismo color en la casilla
				// El movimiento no es válido
				break;
			} else if (tablero[seleccionar_fila - i][seleccionar_columna + i] != Vacio) { // Comprueba si hay una pieza de distinto color en la casilla
				// El movimiento es válido, pero no puede avanzar más allá
				break;
			}
			// La casilla está vacía, el movimiento es válido
		}

		// Movimiento del alfil en diagonal hacia arriba y hacia la izquierda
		for (int i = 1; i < 8; i++) {
			if (seleccionar_fila - i >= 0 && seleccionar_columna - i >= 0) {
				if (tablero[seleccionar_fila - i][seleccionar_columna - i] != Vacio) {
					break;
				} else if (tablero[seleccionar_fila - i][seleccionar_columna - i] != Vacio) {
					break;
				}
			}
		}

		// Movimiento del alfil en diagonal hacia abajo y hacia la derecha
		for (int i = 1; i < 8; i++) {
			if (seleccionar_fila + i < 8 && seleccionar_columna + i < 8) {
				if (tablero[seleccionar_fila + i][seleccionar_columna + i] != Vacio) {
					break;
				} else if (tablero[seleccionar_fila + i][seleccionar_columna + i] != Vacio) {
					break;
				}
			}
		}

		// Movimiento del alfil en diagonal hacia abajo y hacia la izquierda
		for (int i = 1; i < 8; i++) {
			if (seleccionar_fila + i < 8 && seleccionar_columna - i >= 0) {
				if (tablero[seleccionar_fila + i][seleccionar_columna - i] != Vacio) {
					break;
				} else if (tablero[seleccionar_fila + i][seleccionar_columna - i] != Vacio) {
					break;
				}
			}
		}

		return super.mover(mover_fila, mover_columna, seleccionar_columna, seleccionar_fila, tablero, Vacio);
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

}
