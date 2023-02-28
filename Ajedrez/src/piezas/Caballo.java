package piezas;

/**
 * 
 * @author USUARIO CCC
 *
 */
public class Caballo implements Piezas{

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
	
	private String name;

	//constructor
	public Caballo(String name) {
		this.name = name;
	}
	
	
	//getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
