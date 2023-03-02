package piezas;

public interface Piezas {

	public void mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, int posicion_futura, Piezas tablero);
	public String comer();
	
	public String getName();
	public void setName(String name);
	
	public boolean isBlanco();
	public void setBlanco(boolean blanco);

}
