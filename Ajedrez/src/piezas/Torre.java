package piezas;

import java.util.Scanner;

public class Torre extends Queen {
	
	private String name;
	private boolean blanco;
	private int min;
	private int max;
	private int fija;
	private boolean camVacio = true;
	public boolean bien = true;
	public static Piezas Vacio = new Vacio(" *");


	//constructores
	public Torre(String name, boolean blanco, boolean bien, int min, int max, int fija,
			boolean camVacio) {
		super(name, blanco, bien);
		this.name = name;
		this.blanco = blanco;
		this.min = min;
		this.max = max;
		this.fija = fija;
		this.camVacio = camVacio;
	}

	
	@Override
	public String toString() {
		if (blanco == true) {
			name = "tB";
			return name;
		} else {
			name = "tN";
			return name;
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
			
			
			for (int i = min; i < max; i++) {
			    if (!tablero[fija][i].equals(Vacio)) {
			            bien = false;
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
				
				for (int i = min ; i < max ; i++) {
					
					if (!tablero[i][fija].equals(Vacio)) {
						//if que compruebe si hay ficha por el camino
							bien = false;
					}	
					
				}
<<<<<<< .merge_file_euUr1v
=======
				
				System.out.print("Hay piezas por el camino, ");
>>>>>>> .merge_file_NIyoZV

				
				
			} else {
				System.out.println("no es ni horizontal ni vertical");
				bien = false;
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
