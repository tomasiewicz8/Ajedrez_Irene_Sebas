package piezas;

public interface Piezas {

	
	public boolean mover(int mover_fila, int mover_columna, int seleccionar_columna, int seleccionar_fila, Piezas[][] tablero);
	
	public String getName();
	public void setName(String name);
	
	public String getColorFicha();
	public void setColorFicha(String colorFicha);
	
	public boolean isBien();
	public void setBien(boolean bien);

}
