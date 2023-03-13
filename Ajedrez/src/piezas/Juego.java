package piezas;

import java.util.Arrays;
import java.util.Scanner;

public class Juego {

	private static Piezas Vacio;
	public static Piezas[][] tablero;
	public static boolean finBla = true;
	public static boolean finNeg = true;
	public static boolean posBuena = false;
	public static int seleccionar_fila;
	public static int seleccionar_columna;
	public static int mover_fila;
	public static int mover_columna;
	public static boolean buena = true;
	public static boolean condicion;
	public static String colorFicha;
	public static boolean finJuegoBlancas = true;
	public static boolean finJuegoNegras = true;

	/**
	 * Este metodo nos rellena piezas del tablero que se van rellenando mediante un
	 * for en cada pieza que se ha creado mediante un objeto y con los parametros de
	 * sus clases
	 */

	public static void inicializarTablero() {
		// creamos todas las fichas Blancas
		Piezas qB = new Queen("qB", "Blanco", true);
		Piezas kB = new King("kB", "Blanco", buena);
		Piezas aB = new Alfil("aB", "Blanco", buena, mover_columna, mover_columna, mover_columna, mover_columna);
		Piezas cB = new Caballo("cB", "Blanco", true);
		Piezas tB = new Torre("tB", "Blanco", buena, mover_columna, mover_columna, mover_columna);
		Piezas pB = new Peones("pB", "Blanco", buena);

		// creamos todas las fichas Negras
		Piezas qN = new Queen("qN", "Negro", true);
		Piezas kN = new King("kN", "Negro", buena);
		Piezas aN = new Alfil("aN", "Negro", buena, mover_columna, mover_columna, mover_columna, mover_columna);
		Piezas cN = new Caballo("cN", "Negro", true);
		Piezas tN = new Torre("tN", "Negro", buena, mover_columna, mover_columna, mover_columna);
		Piezas pN = new Peones("pN", "Negro", buena);
		Piezas vacio = new Vacio(" *", " *");

		// Colocamos las figuras Blancas
		tablero[1][1] = tB;
		tablero[1][2] = cB;
		tablero[1][3] = aB;
		tablero[1][4] = qB;
		tablero[1][5] = kB;
		tablero[1][6] = aB;
		tablero[1][7] = cB;
		tablero[1][8] = tB;

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
		tablero[8][6] = aN;
		tablero[8][7] = cN;
		tablero[8][8] = tN;

		// colocamos los peones Negros
		tablero[7][1] = pN;
		tablero[7][2] = pN;
		tablero[7][3] = pN;
		tablero[7][4] = kN;
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
	 * Mediante un for y un if imprimimos el tablero y nos comprueba si el rey de
	 * uno de los 2 colores está para que termine la partida
	 * 
	 * @param finJuegoBlancas.. es un boobleano del cual nos indica si sigue o no el
	 *                          rey blanco en la partida
	 * @param finJuegoNegras..  es un boobleano del cual nos indica si sigue o no el
	 *                          rey negro en la partida
	 */
	public static void imprimirTablero() {

		System.out.println("");
		System.out.println("////////////MASTER CHESS////////////");
		System.out.println("");
		String[] primeraFila = { "1/1 ", "1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 " };
		String[] lateral = { "1/1 ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 " };
		/* Creamos las letras de los bordes */

		for (int i = 0; i <= 8; i++) {
			for (int s = 0; s <= 8; s++) {
				if (i == 0) {
					System.out.print(primeraFila[s]);
					System.out.print("  ");
				} else {
					if (s == 0) {
						System.out.print(lateral[i]);
						System.out.print("  ");
					}
				}

				if (s != 0 && i != 0) {
					System.out.print(tablero[i][s] + "  ");

					if (tablero[i][s].getName().equals("kN")) {
						finJuegoBlancas = true;
					}

					if (tablero[i][s].getName().equals("kB")) {
						finJuegoNegras = true;
					}
				}

			}

			System.out.println();

		}

		System.out.println();
	}

	/**
	 * En este metodo validamos la ficha que hemos elegido y que queremos mover,
	 * mediante if comprobamos primero si se sale del tablero las coordenadas y si
	 * es nuestra ficha
	 * 
	 * @param seleccionar_fila..    se guarda la posicion de la fila que hemos
	 *                              seleccionado
	 * @param seleccionar_columna.. se guarda la posicion de la columna que hemos
	 *                              seleccionado
	 * @param fallo                 es un booleano que nos indica si es nuestra
	 *                              ficha o no
	 * @param posicion_actual..     nos indica la posicion que hemos seleccionado
	 * @param colorFicha..          se guarda el color de nuestra ficha
	 * @param jugador..             nos indica que turno que está jugando si negras
	 *                              o blancas
	 * @return nos devuelve si es nuestra ficha o no
	 */

	public static boolean validarFicha(int seleccionar_fila, int seleccionar_columna, Piezas posicion_actual,
			boolean fallo, String colorFicha, String jugador) {

		// verificamos que las coordenadas sean validas
		if (seleccionar_fila >= 1 && seleccionar_columna >= 1 && seleccionar_fila <= 8 && seleccionar_columna <= 8) {
			posicion_actual = tablero[seleccionar_fila][seleccionar_columna];
			System.out.print("has elegido mover " + posicion_actual);

			// hacemos un if si la posicion actual es nuestra ficha o no, si contiene un B
			// de blanca
			if (posicion_actual.getColorFicha().equals(jugador)) {
				fallo = false;
			} else {
				System.out.print(", no se puede mover, no es tu ficha, ");
				fallo = true;
			}
		} else {
			System.out.print("las coordenadas elegidas se salen del tablero, ");
		}
		return fallo;
	}

	/**
	 * En este metodo validamos la posicion a donde queremos mover, mediante if
	 * compribamos primero si se sale del tablero las coordenadas y hay una ficha
	 * nuestra, para que no pueda mover
	 * 
	 * @param seleccionar_fila..    se guarda la posicion de la fila que hemos
	 *                              seleccionado
	 * @param seleccionar_columna.. se guarda la posicion de la columna que hemos
	 *                              seleccionado
	 * @param fallo                 es un booleano que nos indica si es nuestra
	 *                              ficha o no
	 * @param posicion_futura..     nos indica la posicion a donde queremos mover
	 * @param posicion_actual..     nos indica la posicion que hemos seleccionado
	 * @param colorFicha..          se guarda el color de nuestra ficha
	 * @param jugador..             nos indica que turno que está jugando si negras
	 *                              o blancas
	 * @param finJuegoBlancas..     es un boobleano del cual nos indica si sigue o
	 *                              no el rey blanco en la partida
	 * @param finJuegoNegras..      es un boobleano del cual nos indica si sigue o
	 *                              no el rey negro en la partida
	 * @param mover_fila..          la fila donde se moverá la pieza
	 * @param mover_columna..       la columna donde se moverá la pieza
	 * @return nos devuelve si la ficha esta dentro del tablero y si es nuestra
	 *         pieza o no
	 */

	public static boolean validarPosicion(int mover_fila, int mover_columna, Piezas posicion_reemplazada,
			Piezas posicion_futura, Piezas posicion_actual, int seleccionar_fila, int seleccionar_columna,
			String colorFicha, boolean fallo, String jugador) {
		Piezas vacio = new Vacio(" *", " *");
		// verificamos que las coordenadas sean validas
		if (mover_fila >= 1 && mover_columna >= 1 && mover_fila <= 8 && mover_columna <= 8) {

			posicion_futura = tablero[mover_fila][mover_columna];
			System.out.print("has elegido mover hacia " + tablero[mover_fila][mover_columna]);

			// si ya hay una ficha nuestra, no nos va a dejar mover
			if (posicion_futura.getColorFicha().equals(jugador)) {

				System.out.print(" pero no se puede mover ahi, es tu ficha, ");
			} else {
				buena = tablero[seleccionar_fila][seleccionar_columna].mover(mover_fila, mover_columna,
						seleccionar_columna, seleccionar_fila, tablero);

				if (buena == true) {

					posicion_actual = tablero[seleccionar_fila][seleccionar_columna];
					tablero[seleccionar_fila][seleccionar_columna] = vacio;
					tablero[mover_fila][mover_columna] = posicion_actual;

					fallo = true;
					finNeg = true;
					finBla = false;

					// Imprimimos todo para ver el movimiento
					finJuegoNegras = false;
					finJuegoBlancas = false;
					System.out.println("");
					imprimirTablero();

				} else {
					System.out.print(", esta figura no puede mover a esa direccion, ");

				}
			}

		} else {
			System.out.print(" las coordenadas elegidas se salen del tablero, ");
		}
		return fallo;
	}

	/**
	 * En este metodo pedimos al usuario que nos introduzca la posicion de fila
	 * 
	 * @param seleccionar_fila.. se guarda la posicion de la fila que hemos
	 *                           seleccionado
	 * @return la posicion de seleccionar fila
	 */

	public static int select_fila(Scanner reader, String jugador) {
		System.out.println("jugador " + jugador + " elige fila para seleccionar pieza: ");
		seleccionar_fila = reader.nextInt();
		return seleccionar_fila;
	}

	/**
	 * En este metodo pedimos al usuario que nos introduzca la posicion de columna
	 * 
	 * @param seleccionar_columna.. se guarda la posicion de la columna que hemos
	 *                              seleccionado
	 * @return la posicion de seleccionar columna
	 */

	public static int select_columna(Scanner reader, String jugador) {
		System.out.println("jugador " + jugador + " elige columna para seleccionar pieza: ");
		seleccionar_columna = reader.nextInt();
		return seleccionar_columna;
	}

	/**
	 * En este metodo pedimos al usuario que nos indica a que fila quiere mover
	 * 
	 * @param mover_fila.. la fila donde se moverá la pieza
	 * @return la posicion de mover fila
	 */

	public static int mover_fila(Scanner reader, String jugador) {
		System.out.println("jugador " + jugador + " elige fila para mover pieza: ");
		mover_fila = reader.nextInt();
		return mover_fila;
	}

	/**
	 * En este metodo pedimos al usuario que nos indica a que columna quiere mover
	 * 
	 * @param mover_columna.. la columna donde se moverá la pieza
	 * @return la posicion de mover columna
	 */

	public static int mover_columna(Scanner reader, String jugador) {
		System.out.println("jugador " + jugador + " elige columna para mover pieza: ");
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
		boolean fallo = true;

		imprimirTablero();

		/*
		 * Elegimos la ficha que queremos mover con sus posiciones y lo hacemos con un
		 * bucle por si elige una ficha del rival o un espacio sin ficha
		 */

		while (finJuegoBlancas == true && finJuegoNegras == true) {

			while (finBla) {

				while (fallo) {

					jugador = "Blanco";

					seleccionar_fila = select_fila(reader, jugador);

					seleccionar_columna = select_columna(reader, jugador);

					fallo = validarFicha(seleccionar_fila, seleccionar_columna, posicion_actual, condicion, colorFicha,
							jugador);

				} // Fin primer while

				System.out.println();

				/*
				 * vemos donde la queremos mover y creamos un bucle por si elige moverse a una
				 * posicion que no puede, en ese caso le preguntaremos de nuevo a donde quiere
				 * moverse
				 */

				while (fallo == false) {

					jugador = "Blanco";

					mover_fila = mover_fila(reader, jugador);

					mover_columna = mover_columna(reader, jugador);

					fallo = validarPosicion(mover_fila, mover_columna, posicion_reemplazada, posicion_futura,
							posicion_actual, seleccionar_fila, seleccionar_columna, colorFicha, fallo, jugador);
				}
			}
			// cambiamos la condicion de fin de partida que controlaremos de nuevo en el
			// siguiente bucle

			if (finJuegoBlancas == true && finJuegoNegras == true) {

				while (finNeg) {

					// turno del jugador Negro
					while (fallo) {

						jugador = "Negro";

						seleccionar_fila = select_fila(reader, jugador);

						seleccionar_columna = select_columna(reader, jugador);

						fallo = validarFicha(seleccionar_fila, seleccionar_columna, posicion_actual, condicion,
								colorFicha, jugador);
					}

					System.out.println();

					/*
					 * vemos donde la queremos mover y creamos un bucle por si elige moverse a una
					 * posicion que no puede, en ese caso le preguntaremos de nuevo a donde quiere
					 * moverse
					 */

					while (fallo == false) {

						jugador = "Negro";

						mover_fila = mover_fila(reader, jugador);

						mover_columna = mover_columna(reader, jugador);

						fallo = validarPosicion(mover_fila, mover_columna, posicion_reemplazada, posicion_futura,
								posicion_actual, seleccionar_fila, seleccionar_columna, colorFicha, fallo, jugador);
					}

					if (fallo == true) {
						finNeg = false;
						finBla = true;
					}
				}
			}

		}

		System.out.println("El rey a muerto,  partida finalizada");

	}

}
