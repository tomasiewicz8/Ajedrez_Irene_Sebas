package piezas;

public class Queen implements Piezas{

	
	//poner los metodos de los movimientos
	
	
	@Override
	public void mover() {
		
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
	
	public String toString() {
		name = "qN";
		return name;
	}
	
	
	//getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
