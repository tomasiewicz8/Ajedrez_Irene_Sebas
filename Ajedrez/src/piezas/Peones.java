package piezas;

public class Peones extends King {

	private int fija;
	private static Piezas Vacio;
	int dif_fila;
	int dif_colum;
	

	// constructor
	public Peones(String name, String colorFicha, boolean bien, int fija) {
		super(name, colorFicha, bien);
		this.fija = fija;
	}

	@Override
	public String toString() {
		if (getColorFicha() == "Blanco") {
			setName("pB");
			return getName();
		} else {
			setName("pN");
			return getName();
		}

	}

	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila,
			Piezas[][] tablero) {

		// se crea aqui el atributo??
		

		if (tablero[seleccionar_fila][seleccionar_columna].getColorFicha().equals("Blanco")) {
			
			dif_fila = mover_fila - seleccionar_fila;
			dif_colum = mover_columna - seleccionar_columna;

			// iria la columna recta
			if (seleccionar_columna == mover_columna) {
				
				if (seleccionar_fila == 2) {
					if (dif_fila == 1 || dif_fila == 2) {
						
						if (seleccionar_fila + 1 == mover_fila) {
							
							if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")) {
								
								setBien(true);
								
							} else {
								setBien(false);
							}
						} else {
							if (seleccionar_fila + 2 == mover_fila) {
								
								if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")&&
										tablero[mover_fila-1][mover_columna].getColorFicha().equals(" *")) {
									
									setBien(true);
									
								} else {
									setBien(false);
								}
							}
						}
					} else {
						setBien(false);
					}
				} else {
					
					if (seleccionar_fila > 2) {
						
						if (dif_fila == 1) {
							
							if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")) {
								
								setBien(true);
								
							} else {
								setBien(false);
							}
						} else {
							setBien(false);
						}
					} else {
						setBien(false);
					}
				}

			} else {

				if (dif_fila == 1 && (dif_colum == 1 || dif_colum == -1)) {
					if ((tablero[seleccionar_fila + 1][seleccionar_columna - 1].getColorFicha().equals("Negro"))
							|| (tablero[seleccionar_fila + 1][seleccionar_columna + 1].getColorFicha().equals("Negro"))) {
						
						setBien(true);
						
					} else {
						System.out.println("no hay ninguna pieza para comer");
						setBien(false);
					}
				} else {
					setBien(false);
				}
			}

		} else {
			
			if (tablero[seleccionar_fila][seleccionar_columna].getColorFicha().equals("Negro")) {
				
				
				dif_fila = seleccionar_fila - mover_fila;
				dif_colum = seleccionar_columna - mover_columna;
				
				// iria la columna recta
				if (seleccionar_columna == mover_columna) {
					
					if (seleccionar_fila == 7) {
						if (dif_fila == 1 || dif_fila == 2) {
							
							if (seleccionar_fila - 1  == mover_fila) {
								
								if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")) {
									
									setBien(true);
									
								} else {
									setBien(false);
								}
							} else {
								if (seleccionar_fila - 2  == mover_fila) {
									
									if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")&&
											tablero[mover_fila+1][mover_columna].getColorFicha().equals(" *")) {
										
										setBien(true);
										
									} else {
										setBien(false);
									}
								}
							}
						} else {
							setBien(false);
						}
					} else {
						
						if (seleccionar_fila < 7) {
							
							if (dif_fila == 1) {
								
								if (tablero[mover_fila][mover_columna].getColorFicha().equals(" *")) {
									
									setBien(true);
									
								} else {
									setBien(false);
								}
							} else {
								setBien(false);
							}
						} else {
							setBien(false);
						}
					}

				} else {

					if (dif_fila == 1 && (dif_colum == 1 || dif_colum == -1)) {
						if ((tablero[seleccionar_fila - 1][seleccionar_columna - 1].getColorFicha().equals("Blanco"))
								|| (tablero[seleccionar_fila - 1][seleccionar_columna + 1].getColorFicha().equals("Blanco"))) {
							
							setBien(true);
							
						} else {
							System.out.println("no hay ninguna pieza para comer");
							setBien(false);
						}
					}
				}

			} else {
				setBien(false);
			}
		}

		return isBien();
	}

	// getters y setters

	public int getFija() {
		return fija;
	}

	public void setFija(int fija) {
		this.fija = fija;
	}

}
