package piezas;

public class Vacio extends Queen{

	private String name;
	private String colorFicha;



	//constructor
	public Vacio(String name, String colorFicha) {
		this.name = name;
		this.colorFicha = colorFicha;
	}
	
	@Override
	public String toString() {
		name = " *";
		return name;
	}
	
	//getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getColorFicha() {
		return colorFicha;
	}

	public void setColorFicha(String colorFicha) {
		this.colorFicha = colorFicha;
	}

}
