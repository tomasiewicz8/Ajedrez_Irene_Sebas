package piezas;

public class Queen implements Piezas{

	
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
	public Queen(String name) {
		this.name = name;
	}
	
	public Queen() {}
	
	
	//getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
