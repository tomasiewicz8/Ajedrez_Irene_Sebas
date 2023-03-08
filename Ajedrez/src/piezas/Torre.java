package piezas;

import java.util.Scanner;

public class Torre extends Queen {
	
	private int min;
	private int max;
	private int fija;
	private boolean camVacio = true;


	//constructores
	public Torre(String name, String colorFicha, boolean bien, int min, int max, int fija, boolean camVacio) {
		super(name, colorFicha, bien);
		this.min = min;
		this.max = max;
		this.fija = fija;
		this.camVacio = camVacio;
	}

	
	@Override
	public String toString() {
		if (getColorFicha() == "Blanco") {
			setName("tB");
			return getName();
		} else {
			setName("tN");
			return getName();
		}
		
	}
	
	

	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {
		if (seleccionar_fila == mover_fila && seleccionar_columna != mover_columna) {
			
			fija = seleccionar_fila;
			
			if (seleccionar_columna > mover_columna) {
				min = mover_columna;
				max = seleccionar_columna;
			} else {
				min = seleccionar_columna;
				max = mover_columna;
			}
			
			//falta comprobar la ultima posicion para ver si es de nuestro color o no para comer y restar el max en el bucle
			for (int i = min + 1 ; i < max - 1; i++) {
			    if (!tablero[fija][i].getColorFicha().equals(" *")) {
			            setBien(false);
			    }
			    
			}
			
		    System.out.print("Hay piezas por el camino, ");

		} else {
			if (seleccionar_fila != mover_fila && seleccionar_columna == mover_columna) {
				
				fija = seleccionar_columna;
				
				if (seleccionar_fila > mover_fila) {
					min = mover_fila;
					max = seleccionar_fila;
					
				} else {
					min = seleccionar_fila;
					max = mover_fila;
				}
				
				for (int i = min + 1 ; i < max - 1 ; i++) {
					
					if (!tablero[i][fija].getColorFicha().equals(" *")) {
						//if que compruebe si hay ficha por el camino
						setBien(false);
					}	
					
				}

				
				System.out.print("Hay piezas por el camino, ");

				
				
			} else {
				System.out.println("no es ni horizontal ni vertical");
				setBien(false);
			}
		}
		return isBien();
	}
	

	
		// getters y setters

		public int getMin() {
			return min;
		}

		public void setMin(int min) {
			this.min = min;
		}

		public int getMax() {
			return max;
		}

		public void setMax(int max) {
			this.max = max;
		}

		public int getFija() {
			return fija;
		}

		public void setFija(int fija) {
			this.fija = fija;
		}

		public boolean isCamVacio() {
			return camVacio;
		}

		public void setCamVacio(boolean camVacio) {
			this.camVacio = camVacio;
		}

}
