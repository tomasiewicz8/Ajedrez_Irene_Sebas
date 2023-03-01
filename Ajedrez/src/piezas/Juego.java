package piezas;

import java.util.Arrays;
import java.util.Scanner;

public class Juego {

	public static Piezas[][] tablero;
	public static boolean finBla = true;
	public static boolean finNeg = true;
	public static boolean posBuena = false;
	public static int seleccionar_fila;
	public static int seleccionar_columna;
	public static int mover_fila;
	public static int mover_columna;
	public static Piezas Vacio;

	
	/**
	 * Rellena piezas del tablero
	 * @param tablero
	 */
	public static void inicializarTablero() {
		// creamos todas las fichas Blancas
		Piezas qB = new Queen("qB");
		Piezas kB = new King("kB");
		Piezas aB = new Alfil("aB");
		Piezas cB = new Caballo("cB");
		Piezas tB = new Torre("tB");
		Piezas pB = new Peones("pB");
		
		//creamos las posiciones en blanco
		Piezas vacio = new Vacio(" *");

		// creamos todas las fichas Negras
		Piezas qN = new Queen("qN");
		Piezas kN = new King("kN");
		Piezas aN = new Alfil("aN");
		Piezas cN = new Caballo("cN");
		Piezas tN = new Torre("tN");
		Piezas pN = new Peones("pN");

		
		

		// Colocamos las figuras Blancas
		tablero[1][1] = tB;
		tablero[1][2] = cB;
		tablero[1][3] = aB;
		tablero[1][4] = qB;
		tablero[1][5] = kB;
		tablero[1][6] = tB;
		tablero[1][7] = cB;
		tablero[1][8] = aB;

		// Colocamos los peones Blancos
		tablero[2][1] = pB;
		tablero[2][2] = pB;
		tablero[2][3] = pB;
		tablero[2][4] = pB;
		tablero[2][5] = pB;
		tablero[2][6] = pB;
		tablero[2][7] = pB;
		tablero[2][8] = pB;

		// Colocamos las figuras Negras
		tablero[8][1] = tN;
		tablero[8][2] = cN;
		tablero[8][3] = aN;
		tablero[8][4] = qN;
		tablero[8][5] = kN;
		tablero[8][6] = tN;
		tablero[8][7] = cN;
		tablero[8][8] = aN;

		// colocamos los peones Negros
		tablero[7][1] = pN;
		tablero[7][2] = pN;
		tablero[7][3] = pN;
		tablero[7][4] = pN;
		tablero[7][5] = pN;
		tablero[7][6] = pN;
		tablero[7][7] = pN;
		tablero[7][8] = pN;

		

		// bucle para rellenar los espacios en blanco
		for (int i = 3; i <= 6; i++) {
			for (int s = 1; s <= 8; s++) {
				tablero[i][s] = vacio;
			}
		}

	}

	/**
	 * 
	 */
	public static void imprimirTablero() {

		String[] primeraFila = {"A/1 ","A ","B ","C ","D ","F ","G ","H ","I "};
		String[] lateral = {"A/1 "," 1 "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "," 8 "};
		/* Creamos las letras de los bordes*/
		
		
		for (int i = 0; i <= 8; i++) {
			for (int s = 0; s <= 8; s++) {
				if(i==0 ) {
					System.out.print(primeraFila[s]);
					System.out.print("  ");
				} else {
				if(s==0 ) {
					System.out.print(lateral[i]);
					System.out.print("  ");
				}
				}
				
				
				
				if (s != 0 && i != 0) {
					System.out.print(tablero[i][s] + "  ");

					if (tablero[i][s].getName().equals("kN")) {
						finNeg = true;
					}

					if (tablero[i][s].equals("kB")) {
						finBla = true;
					}
				}
				

			}

			System.out.println();

		}

		System.out.println();
	}

	public static boolean validarFicha(int seleccionar_fila, int seleccionar_columna, Piezas posicion_actual,
			boolean condicion, String color) {
		// verificamos que las coordenadas sean validas
		if (seleccionar_fila >= 1 && seleccionar_columna >= 1 && seleccionar_fila <= 8 && seleccionar_columna <= 8) {
			posicion_actual = tablero[seleccionar_fila][seleccionar_columna];
			System.out.print("has elegido mover " + posicion_actual);

			// hacemos un if si la posicion actual es nuestra ficha o no, si contiene un B
			// de blanca
			if (posicion_actual.equals(color)) {
				condicion = false;
			} else {
				System.out.print(" no se puede mover, no es tu ficha, ");

			}
		} else {
			System.out.print("las coordenadas elegidas se salen del tablero, ");
		}
		return condicion;
	}

	public static boolean validarPosicion(int mover_fila, int mover_columna, Piezas posicion_reemplazada,
			Piezas posicion_futura, Piezas posicion_actual, int seleccionar_fila, int seleccionar_columna, String color,
			boolean fallo, Piezas Vacio) {
		
	

		// verificamos que las coordenadas sean validas
		if (mover_fila >= 1 && mover_columna >= 1 && mover_fila <= 8 && mover_columna <= 8) {

			posicion_futura = tablero[mover_fila][mover_columna];
			System.out.println("has elegido mover hacia" + tablero[mover_fila][mover_columna]);

			// si ya hay una ficha nuestra, no nos va a dejar mover
			if (posicion_futura.equals(color)) {
				System.out.print(" pero no se puede mover ahi, es tu ficha, ");
			} else {
				posicion_futura = posicion_actual;
				posicion_reemplazada = Vacio;
				tablero[mover_fila][mover_columna] = posicion_futura;
				tablero[seleccionar_fila][seleccionar_columna] = posicion_actual;
				fallo = true;
				finNeg = false;
				finBla = false;

				// Imprimimos todo para ver el movimiento
				imprimirTablero();
			}

		} else {
			System.out.print("las coordenadas elegidas se salen del tablero, ");
		}
		return fallo;
	}

	public static int select_fila(Scanner reader, String jugador) {
		System.out.println("jugador " + jugador + " elige fila para seleccionar pieza: ");
		seleccionar_fila = reader.nextInt();
		return seleccionar_fila;
	}

	public static int select_columna(Scanner reader, String jugador) {
		System.out.println("jugador " + jugador + " elige fila para seleccionar pieza: ");
		seleccionar_columna = reader.nextInt();
		return seleccionar_columna;
	}

	public static int mover_fila(Scanner reader, String jugador) {
		System.out.println("jugador " + jugador + " elige fila para mover pieza: ");
		mover_fila = reader.nextInt();
		return mover_fila;
	}

	public static int mover_columna(Scanner reader, String jugador) {
		System.out.println("jugador " + jugador + " elige fila para mover pieza: ");
		mover_columna = reader.nextInt();
		return mover_columna;
	}

	public static void main(String[] args) {

		// creamos el tablero, escaner y las variables
		tablero = new Piezas[9][9];
		Scanner reader = new Scanner(System.in);
		int mover_fila;
		int mover_columna;
		int seleccionar_fila = 0;
		int seleccionar_columna = 0;
		Piezas posicion_reemplazada = null;
		inicializarTablero();
		Piezas posicion_actual = tablero[0][0];
		Piezas posicion_futura = tablero[0][0];
		String jugador;
		
		imprimirTablero();
		
		/*
		 * Elegimos la ficha que queremos mover con sus posiciones y lo hacemos con un
		 * bucle por si elige una ficha del rival o un espacio sin ficha
		 */
		boolean fallo = true;

		while (finBla) {

			jugador = "Blanco";

			while (fallo) {

				seleccionar_fila = select_fila(reader, jugador);

				seleccionar_columna = select_columna(reader, jugador);

				fallo = validarFicha(seleccionar_fila, seleccionar_columna, posicion_actual, fallo, "B");

			} // Fin primer while

			System.out.println();

			/*
			 * vemos donde la queremos mover y creamos un bucle por si elige moverse a una
			 * posicion que no puede, en ese caso le preguntaremos de nuevo a donde quiere
			 * moverse
			 */

			while (fallo == false) {

				mover_fila = mover_fila(reader, jugador);

				mover_columna = mover_columna(reader, jugador);

				fallo = validarPosicion(mover_fila, mover_columna, posicion_reemplazada, posicion_futura,
						posicion_actual, seleccionar_fila, seleccionar_columna, "B", fallo, Vacio);
			}

			// cambiamos la condicion de fin de partida que controlaremos de nuevo en el
			// siguiente bucle

			jugador = "Negro";
			
			while (finNeg) {

				// turno del jugador Negro
				while (fallo) {

					seleccionar_fila = select_fila(reader, jugador);

					seleccionar_columna = select_columna(reader, jugador);

					fallo = validarFicha(seleccionar_fila, seleccionar_columna, posicion_actual, fallo, "N");
				}

				System.out.println();

				/*
				 * vemos donde la queremos mover y creamos un bucle por si elige moverse a una
				 * posicion que no puede, en ese caso le preguntaremos de nuevo a donde quiere
				 * moverse
				 */

				while (fallo == false) {

					mover_fila = mover_fila(reader, jugador);

					mover_columna = mover_columna(reader, jugador);

					fallo = validarPosicion(mover_fila, mover_columna, posicion_reemplazada, posicion_futura,
							posicion_actual, seleccionar_fila, seleccionar_columna, "N", fallo, Vacio);

				}
			}
		}
	}

}
