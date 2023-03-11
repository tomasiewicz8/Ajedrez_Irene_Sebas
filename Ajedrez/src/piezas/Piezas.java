package piezas;

public interface Piezas {

	/**
	 * Piezas es la interfaz donde vamos a heredar aquellas acciones a nuestras clases padres y hijas
	 * @return mover, getName, getColorFicha y isMovimiendoValido
	 */
	
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero);
	
	public String getName();
	public void setName(String name);
	
	public String getColorFicha();
	public void setColorFicha(String colorFicha);
	
	public boolean isMovimientoValido();
	public void setMovimientoValido(boolean movimientoValido);

}
