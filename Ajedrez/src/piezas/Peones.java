package piezas;

public class Peones extends King {

	private int fija;
	private boolean bien = true;

	// constructor
	public Peones(String name, String colorFicha, int fija) {
		super(name, colorFicha, fija);
		this.fija = fija;
	}

	@Override
	public String toString() {
		if (blanco == true) {
			name = "pB";
			return name;
		} else {
			name = "pN";
			return name;
		}
	}

	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila,
			Piezas[][] tablero) {

		if (tablero[mover_fila][mover_columna].isBlanco() != blanco) {

			// si es ficha blanca
			if (blanco) {
				// iria la columna recta
				if (seleccionar_columna == mover_columna) {
					// si está en la linea 7 para comenzar
					if (seleccionar_fila == 7) {

						// Se mueve solo una o dos
						int dif_fila = mover_fila - seleccionar_fila;
						if (dif_fila == 1 || dif_fila == 2) {

							// fila tiene que ser una posicion de más
							fija = seleccionar_columna;
							for (int i = seleccionar_fila; i >= mover_fila; i--) {
								// ver si hay piezas por el camino
								if (!tablero[i][fija].equals(Vacio)) {
									bien = true;
								}
							}
							System.out.print("Hay piezas por el camino, ");
						} else {
							System.out.println("no entra porque no son los parametros");
							bien = true;
						}
					} else {
						System.out.println("no empieza");
					}

				} else {
					System.out.println("El movimiento no es valido, tiene que ser en vertical");
				}

			} else {
				// si la ficha no está para iniciar si no en mitad
				if (seleccionar_fila > 7) {
					// iria la columna recta
					if (seleccionar_columna == mover_columna) {
						// Se mueve solo una posicion
						int dif_fila = mover_fila - seleccionar_fila;

						// verificar si exactamente solo se puede en una fila
						if (dif_fila == 1) {

							// fila tiene que ser una posicion de más
							fija = seleccionar_columna;
							for (int i = seleccionar_fila; i >= mover_fila; i--) {

								if (!tablero[i][fija].equals(Vacio)) {
									bien = true;
								}
							}
							System.out.print("Hay piezas por el camino, ");
						} else {
							System.out.println("no entra porque no son los parametros");
							bien = true;
						}
					} else {
						System.out.println("El movimiento no es valido, tiene que ser en vertical");
					}
					// movemos en diagonal izquierda y diagonal derecha si hay una ficha del
					// oponente
					if ((tablero[seleccionar_fila - 1][seleccionar_columna - 1] != Vacio)
							|| (tablero[seleccionar_fila + 1][seleccionar_columna - 1] != Vacio)) {

					} else {
						System.out.println("no hay ninguna pieza para comer");
						bien = true;
					}
				} else {
					System.out.println("estas selecionando una fila que no es, tienes que ir para abajo");
					bien = true;
				}
			}

		} else {

			// iria la columna recta
			if (seleccionar_columna == mover_columna) {
					// si está en la linea 2 para comenzar
					if (seleccionar_fila == 2) {
		
							// Se mueve solo una o dos
							int dif_fila = mover_fila - seleccionar_fila;
							if (dif_fila == 1 || dif_fila == 2) {
		
								// fila tiene que ser una posicion de más
								fija = seleccionar_columna;
								for (int i = seleccionar_fila; i <= mover_fila; i++) {
									// ver si hay piezas por el camino
									if (!tablero[i][fija].equals(Vacio)) {
										bien = true;
									}
								}
								System.out.print("Hay piezas por el camino, ");
							} else {
								System.out.println("no entra porque no son los parametros");
								bien = true;
							}

		
						} else {
							// si la ficha no está para iniciar si no en mitad
							if (seleccionar_fila < 2) {
			
								// Se mueve solo una posicion
								int dif_fila = mover_fila - seleccionar_fila;
			
								// verificar si exactamente solo se puede en una fila
								if (dif_fila == 1) {
			
									// fila tiene que ser una posicion de más
									fija = seleccionar_columna;
									for (int i = seleccionar_fila; i >= mover_fila; i++) {
			
										if (!tablero[i][fija].equals(Vacio)) {
											bien = true;
										}
									}
									System.out.print("Hay piezas por el camino, ");
								} else {
									System.out.println("no entra porque no son los parametros");
									bien = true;
								}
							} else {
								System.out.println("estas selecionando una fila que no es, tienes que ir para arriba");
								bien = true;
							}
			} else {
				System.out.println("El movimiento no es valido, tiene que ser en vertical");
			}
			// movemos en diagonal izquierda y diagonal derecha si hay una ficha del oponente
			if ((tablero[seleccionar_fila - 1][seleccionar_columna + 1] != Vacio) || (tablero[seleccionar_fila - 1][seleccionar_columna + 1] != Vacio)) {
	
			} else {
				System.out.println("no hay ninguna pieza para comer");
				bien = true;
			}
					
		}
	}
		
	return bien;

}

	// getters y setters
	}

	public int getFija() {
		return fija;
	}

	public void setFija(int fija) {
		this.fija = fija;
	}

	public boolean isBien() {
		return bien;
	}

	public void setBien(boolean bien) {
		this.bien = bien;
	}

}
