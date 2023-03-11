package piezas;

public class Vacio extends Queen{

	private String name;


	/**
	 * En este constructor recogemos el siguiente parametro:
	 * @param string 
	 * @param name... en esta clase, en el name guardamos lo que va a haber dentro de name
	 */
	//constructor
	public Vacio(String name) {
		this.name = name;
	}
	
	/**
	 * En este metodo recogemos el siguiente parametro:
	 * @param name... name guarda " *" que es una pieza vacia de nuestro ajedrez
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

}
