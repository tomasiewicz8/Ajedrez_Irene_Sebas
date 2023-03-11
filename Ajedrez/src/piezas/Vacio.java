package piezas;

public class Vacio extends Queen{

	private String name;
	private String colorFicha;


	/**
	 * En este constructor recogemos los siguientes parametros:
	 * @param colorFicha.. guardamos el color de la ficha que primero juega, en este caso blanco y en el else el negro
	 * @param name... le guardamos la ficha que está en cada caso del if
	 */
	//constructor
	public Vacio(String name, String colorFicha) {
		this.name = name;
		this.colorFicha = colorFicha;
	}
	
	/**
	 * En este metodo recogemos el siguiente parametro:
	 * @param name... name guarda " *" que es una pieza vacia de nuestro ajedrez
	 * @return el nombre de la pieza
	 */
	
	@Override
	public String toString() {
		name = " *";
		return name;
	}
	
	//getters y setters
	
	/**
	 * Nos devuelve el valor name porque era privado
	 * @return nos devuelve el name que es donde estará guardada nuestra pieza
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * Con el set nos deja modificar la variable name porque era privado
	 * @param name: en el se encuentra el nombre de nuestra ficha
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Nos devuelve el ColorFicha porque era privado
	 * @return nos devuelve el ColorFicha que es donde estará guardada el color de la ficha
	 */
	
	public String getColorFicha() {
		return colorFicha;
	}
	
	/**
	 * Con el set nos deja modificar la variable colorFicha porque era privado
	 * @param colorFicha: en el se encuentra color de nuestra ficha
	 */

	public void setColorFicha(String colorFicha) {
		this.colorFicha = colorFicha;
	}

}
