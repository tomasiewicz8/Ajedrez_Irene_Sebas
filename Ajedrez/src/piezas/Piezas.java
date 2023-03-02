package piezas;

public interface Piezas {

	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, int posicion_futura, Piezas[][] tablero);
	
	public String getName();
	public void setName(String name);
	
	public boolean isBlanco();
	public void setBlanco(boolean blanco);
	
	public boolean isBien();
	public void setBien(boolean bien);

}
