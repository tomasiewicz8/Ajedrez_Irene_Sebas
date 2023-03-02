package piezas;

/**
 * 
 * @author USUARIO CCC
 *
 */
public class Caballo implements Piezas {

	private String name;
	private boolean blanco;
	private boolean bien = true;

	//constructor
	public Caballo(String name, boolean blanco, boolean bien) {
		this.name = name;
		this.blanco = blanco;
		this.bien = bien;
	}
	
	@Override
	public String toString() {
		if (blanco == true) {
			name = "cB";
			return name;
		} else {
			name = "cN";
			return name;
		}
		
	}
	
	
	// poner los metodos de los movimientos

	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, int posicion_futura, Piezas[][] tablero) {

		if (mover_columna == seleccionar_columna-2 && mover_fila == seleccionar_fila-1) {
		        
		    } else {
		    	if (mover_columna == seleccionar_columna-2 && mover_fila == seleccionar_fila+1) {
			        
		    	} else {
		    		if (mover_columna == seleccionar_columna+2 && mover_fila == seleccionar_fila-1) {
		    			 System.out.println("entra");
		    		} else {
		    			if (mover_columna == seleccionar_columna+2 && mover_fila == seleccionar_fila+1) {
		    				
		    			} else {
		    				if (mover_columna == seleccionar_columna-1 && mover_fila == seleccionar_fila-2) {
		    					
		    				} else {
		    					if (mover_columna == seleccionar_columna+1 && mover_fila == seleccionar_fila-2) {
		    						
		    					} else {
		    						if (mover_columna == seleccionar_columna-1 && mover_fila == seleccionar_fila+2) {
		    							
		    						} else {
		    							if (mover_columna == seleccionar_columna+1 && mover_fila == seleccionar_fila+2) {
		    								
		    							} else {
		    								System.out.println(" primo asi no mueve el caballo");
		    								bien = false;
		    							}
		    						}
		    					}
		    				}
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
	
	public boolean isBien() {
		return bien;
	}

	public void setBien(boolean bien) {
		this.bien = bien;
	}
	

}
