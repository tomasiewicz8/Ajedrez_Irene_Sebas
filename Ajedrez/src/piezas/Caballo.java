package piezas;

/**
 * 
 * @author USUARIO CCC
 *
 */
public class Caballo implements Piezas{
	
	private String name;

	//constructor
	public Caballo(String name) {
		this.name = name;
	}
	
	public String toString() {
		name = "cB";
		return name;
	}
	
	//getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//poner los metodos de los movimientos
	
	@Override
	public String mover() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
