package piezas;

import java.util.Scanner;

public class Torre extends Queen {
	
	private String name;

	//constructor
	public Torre(String name) {
		this.name = name;
	}
	
	public String toString() {
		name = "tB";
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
