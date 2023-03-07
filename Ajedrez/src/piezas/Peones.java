package piezas;

public class Peones extends King{
	
	private static int maxC;
	private static int maxF;
	private static int minF;
	private static int minC;
	private String name;
	private boolean blanco;
	private int fija;

	//constructor
	public Peones(String name, boolean blanco, int fija) {
		super(name, blanco, blanco, maxC, maxF, minF, minC);
		this.name = name;
		this.blanco = blanco;
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


	
	
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {

		if (tablero[mover_fila][mover_columna].isBlanco() != blanco) {
			
			//si es ficha blanca
			if (blanco) {
				//si está en la linea 2 para comenzar		
				if (seleccionar_fila== 2) {
					
					// Se mueve solo una o dos
					int dif_fila = mover_fila - seleccionar_fila;
				    if (dif_fila == 1 || dif_fila == 2) {
						
				    	//fila tiene que ser una posicion de más
				    	fija = seleccionar_columna;	
						for (int i = seleccionar_fila ; i <= mover_fila ; i++) {
							//ver si hay piezas por el camino
							if (!tablero[i][fija].equals(Vacio)) {
					            bien = false;
							}	
						}
						System.out.print("Hay piezas por el camino, ");
				    } else {
				    	System.out.println("no entra porque no son los parametros");
				    	bien = false;
				    }			
					
				} else {
					//si la ficha no está para iniciar si no en mitad
					if (seleccionar_fila > 2) {
						
						// Se mueve solo una posicion
						int dif_fila = mover_fila - seleccionar_fila;
					    
						//verificar si exactamente solo se puede en una fila
						if (dif_fila == 1) {
							
							//fila tiene que ser una posicion de más
					    	fija = seleccionar_columna;	
							for (int i = seleccionar_fila ; i <= mover_fila ; i++) {
								
								if (!tablero[i][fija].equals(Vacio)) {
						            bien = false;
								}	
							}
							System.out.print("Hay piezas por el camino, ");
						} else {
					    	System.out.println("no entra porque no son los parametros");
					    	bien = false;
					    }		
	
						//movemos en diagonal izquierda y diagonal derecha si hay una ficha del oponente
						if ((tablero[seleccionar_fila + 1][seleccionar_columna - 1] != Vacio) || (tablero[seleccionar_fila + 1][seleccionar_columna + 1] != Vacio)) {
							
						} else {
							System.out.println("no hay ninguna pieza para comer");
							bien = false;
						}  
					} else {
						System.out.println("estas selecionando una fila que no es, tienes que ir para arriba");
						bien = false;
					}
				}
				
			} else {
				//si está en la linea 8 para comenzar		
				if (seleccionar_fila== 8) {
					
					// Se mueve solo una o dos
					int dif_fila = mover_fila - seleccionar_fila;
				    if (dif_fila == 1 || dif_fila == 2) {
						
				    	//fila tiene que ser una posicion de más
				    	fija = seleccionar_columna;	
						for (int i = seleccionar_fila ; i >= mover_fila ; i--) {
							//ver si hay piezas por el camino
							if (!tablero[i][fija].equals(Vacio)) {
					            bien = false;
							}	
						}
						System.out.print("Hay piezas por el camino, ");
				    } else {
				    	System.out.println("no entra porque no son los parametros");
				    	bien = false;
				    }			
					
				} else {
					//si la ficha no está para iniciar si no en mitad
					if (seleccionar_fila < 8) {
						
						// Se mueve solo una posicion
						int dif_fila = mover_fila - seleccionar_fila;
					    
						//verificar si exactamente solo se puede en una fila
						if (dif_fila == 1) {
							
							//fila tiene que ser una posicion de más
					    	fija = seleccionar_columna;	
							for (int i = seleccionar_fila ; i >= mover_fila ; i--) {
								
								if (!tablero[i][fija].equals(Vacio)) {
						            bien = false;
								}	
							}
							System.out.print("Hay piezas por el camino, ");
						} else {
					    	System.out.println("no entra porque no son los parametros");
					    	bien = false;
					    }		
	
						//movemos en diagonal izquierda y diagonal derecha si hay una ficha del oponente
						if ((tablero[seleccionar_fila - 1][seleccionar_columna - 1] != Vacio) || (tablero[seleccionar_fila - 1][seleccionar_columna + 1] != Vacio)) {
							
						} else {
							System.out.println("no hay ninguna pieza para comer");
							bien = false;
						}  
					} else {
						System.out.println("estas selecionando una fila que no es, tienes que ir para arriba");
						bien = false;
					}
			}
			
			}
		}
		return bien;
	}
		


	//getters y setters
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


	public static int getMaxC() {
		return maxC;
	}


	public static void setMaxC(int maxC) {
		Peones.maxC = maxC;
	}


	public static int getMaxF() {
		return maxF;
	}


	public static void setMaxF(int maxF) {
		Peones.maxF = maxF;
	}


	public static int getMinF() {
		return minF;
	}


	public static void setMinF(int minF) {
		Peones.minF = minF;
	}


	public static int getMinC() {
		return minC;
	}


	public static void setMinC(int minC) {
		Peones.minC = minC;
	}


	public int getFija() {
		return fija;
	}


	public void setFija(int fija) {
		this.fija = fija;
	}
	
	

}
