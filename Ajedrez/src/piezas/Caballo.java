package piezas;

/**
 * 
 * @author USUARIO CCC
 *
 */
public class Caballo implements Piezas {

	private String name;
	private String colorFicha;
	private boolean bien = true;

	//constructor
	public Caballo(String name, String colorFicha, boolean bien) {
		this.name = name;
		this.colorFicha = colorFicha;
		this.bien = bien;
	}
	
	@Override
	public String toString() {
		if (colorFicha == "Blanco") {
			name = "cB";
			return name;
		} else {
			name = "cN";
			return name;
		}
		
	}
	
	
	// poner los metodos de los movimientos
	
	@Override
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero) {
		if (mover_columna == seleccionar_columna-2 && mover_fila == seleccionar_fila-1) {
		        
		    } else {
		    	if (mover_columna == seleccionar_columna-2 && mover_fila == seleccionar_fila+1) {
			        
		    	} else {
		    		if (mover_columna == seleccionar_columna+2 && mover_fila == seleccionar_fila-1) {

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
	

	public boolean isBien() {
		return bien;
	}

	public void setBien(boolean bien) {
		this.bien = bien;
	}

	@Override
	public String getColorFicha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setColorFicha(String colorFicha) {
		// TODO Auto-generated method stub
		
	}
	

}
