package piezas;

import java.util.Scanner;

public class Torre extends Queen {

	public static void main(String[] args) {
		String[][] tablero = new String[9][9];
		Scanner reader = new Scanner(System.in);
		int mover_fila;
		int mover_columna;
		int seleccionar_fila = 0;
		int seleccionar_columna = 0;
		int min = 0;
		int max = 0;
		int fija = 0;
		System.out.println("jugador blanco elige fila para seleccionar pieza: ");
		seleccionar_fila = reader.nextInt();
		System.out.println("jugador blanco elige columna para seleccionar pieza: ");
		seleccionar_columna = reader.nextInt();

		System.out.println("jugador blanco elige la fila a la que quieres moverte: ");
		mover_fila = reader.nextInt();
		System.out.println("jugador blanco elige la columna a la que quieres moverte: ");
		mover_columna = reader.nextInt();

		
		
		if (mover_fila >= 1 && mover_fila <= 8 && mover_columna <= 8 && mover_columna >= 1) {
			System.out.println("esta dentro del tablero");
		
			if (seleccionar_fila == mover_fila && seleccionar_columna != mover_columna) {
				
				fija = mover_fila;
				
				if (seleccionar_columna > mover_columna) {
					min = mover_columna;
					max = seleccionar_columna;
				} else {
					min = seleccionar_columna;
					max = mover_columna;
				}
				
				for (int i = min ; i > max ; i++) {
					tablero[fija][i];
				}
	
			} else {
				if (seleccionar_fila != mover_fila && seleccionar_columna == mover_columna) {
					
					fija = mover_columna;
					
					if (seleccionar_fila > mover_fila) {
						min = mover_fila;
						max = seleccionar_fila;
						
					} else {
						min = seleccionar_fila;
						max = mover_fila;
					}
					
					for (int i = min ; i > max ; i++) {
						tablero[i][fija];
					}

					
					
				} else {
					System.out.println("no es ni horizontal ni vertical");
				}
			}
			
			

		} else {
			System.out.println("esta fuera del tablero");
		}

		
	}
}
