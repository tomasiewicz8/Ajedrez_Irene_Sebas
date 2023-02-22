package piezas;

import java.util.Arrays;
import java.util.Scanner;

public class Juego {
	public static void main(String[] args) {

		// creamos el tablero, escaner y las variables
		String[][] tablero = new String[9][9];
		Scanner reader = new Scanner(System.in);
		int mover_fila;
		int mover_columna;
		int seleccionar_fila = 0;
		int seleccionar_columna = 0;
		String posicion_reemplazada;
		boolean condicion = true;
		boolean finBla = true;
		boolean finNeg = true;
		boolean posBuena = false;
		String posicion_actual = tablero[0][0];
		String posicion_futura = tablero[0][0];

		// creamos todas las fichas Blancas
		String tB = "tB";
		String cB = "cB";
		String aB = "aB";
		String qB = "qB";
		String kB = "kB";
		String pB = "pB";

		// creamos todas las fichas Negras
		String tN = "tN";
		String cN = "cN";
		String aN = "aN";
		String qN = "qN";
		String kN = "kN";
		String pN = "pN";

		// Creamos las letras de los bordes
		String T = "A/1 ";
		String A = "A ";
		String B = "B ";
		String C = "C ";
		String D = "D ";
		String E = "E ";
		String F = "F ";
		String G = "G ";
		String H = "H ";

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

		// Colocamos las letras y los numeros del borde
		tablero[0][0] = T;
		tablero[0][1] = A;
		tablero[0][2] = B;
		tablero[0][3] = C;
		tablero[0][4] = D;
		tablero[0][5] = E;
		tablero[0][6] = F;
		tablero[0][7] = G;
		tablero[0][8] = H;

		tablero[1][0] = " 1 ";
		tablero[2][0] = " 2 ";
		tablero[3][0] = " 3 ";
		tablero[4][0] = " 4 ";
		tablero[5][0] = " 5 ";
		tablero[6][0] = " 6 ";
		tablero[7][0] = " 7 ";
		tablero[8][0] = " 8 ";

		// bucle para rellenar los espacios en blanco
		for (int i = 3; i <= 6; i++) {
			for (int s = 1; s <= 8; s++) {
				tablero[i][s] = " *";
			}
		}

		// Imprimimos todo
		for (int i = 0; i <= 8; i++) {
			for (int s = 0; s <= 8; s++) {

				System.out.print(tablero[i][s] + "  ");

			}

			System.out.println();

		}

		System.out.println();

		/*
		 * Elegimos la ficha que queremos mover con sus posiciones y lo hacemos con un
		 * bucle por si elige una ficha del rival o un espacio sin ficha
		 */

		while (finBla) {
			while (condicion) {
				System.out.println("jugador blanco elige fila para seleccionar pieza: ");
				seleccionar_fila = reader.nextInt();
				System.out.println("jugador blanco elige columna para seleccionar pieza: ");
				seleccionar_columna = reader.nextInt();

				// verificamos que las coordenadas sean validas
				if (seleccionar_fila >= 1 && seleccionar_columna >= 1 && seleccionar_fila <= 8
						&& seleccionar_columna <= 8) {
					posicion_actual = tablero[seleccionar_fila][seleccionar_columna];
					System.out.print("has elegido mover " + posicion_actual);

					// hacemos un if si la posicion actual es nuestra ficha o no, si contiene un B
					// de blanca
					if (posicion_actual.contains("B")) {
						condicion = false;
					} else {
						System.out.print(" no se puede mover, no es tu ficha, ");

					}
				} else {
					System.out.print("las coordenadas elegidas se salen del tablero, ");
				}
			}

			System.out.println();

			/*
			 * vemos donde la queremos mover y creamos un bucle por si elige moverse a una
			 * posicion que no puede, en ese caso le preguntaremos de nuevo a donde quiere
			 * moverse
			 */

			while (condicion == false) {
				System.out.println("jugador blanco elige la fila a la que quieres moverte: ");
				mover_fila = reader.nextInt();
				System.out.println("jugador blanco elige la columna a la que quieres moverte: ");
				mover_columna = reader.nextInt();

				// verificamos que las coordenadas sean validas
				if (mover_fila >= 1 && mover_columna >= 1 && mover_fila <= 8
						&& mover_columna <= 8) {

					posicion_futura = tablero[mover_fila][mover_columna];
					System.out.println("has elegido mover hacia" + tablero[mover_fila][mover_columna]);

					// si ya hay una ficha nuestra, no nos va a dejar mover
					if (posicion_futura.contains("B")) {
						System.out.print(" pero no se puede mover ahi, es tu ficha, ");
					} else {
						posicion_futura = posicion_futura.replace(posicion_futura, posicion_actual);
						posicion_reemplazada = posicion_actual = " *";
						tablero[mover_fila][mover_columna] = posicion_futura;
						tablero[seleccionar_fila][seleccionar_columna] = posicion_actual;
						condicion = true;
						finNeg = false;
						finBla = false;

						// Imprimimos todo para ver el movimiento

						for (int i = 0; i <= 8; i++) {
							for (int s = 0; s <= 8; s++) {

								System.out.print(tablero[i][s] + "  ");

								if (tablero[i][s].contains("kN")) {
									finNeg = true;
								}

							}

							System.out.println();

						}

						System.out.println();
					}
				} else {
					System.out.print("las coordenadas elegidas se salen del tablero, ");
				}
			}

			// cambiamos la condicion de fin de partida que controlaremos de nuevo en el
			// siguiente bucle

			while (finNeg) {

				// turno del jugador Negro
				while (condicion) {
					System.out.println("jugador Negro elige fila para seleccionar pieza: ");
					seleccionar_fila = reader.nextInt();
					System.out.println("jugador Negro elige columna para seleccionar pieza: ");
					seleccionar_columna = reader.nextInt();

					// verificamos que las coordenadas sean validas
					if (seleccionar_fila >= 1 && seleccionar_columna >= 1 && seleccionar_fila <= 8
							&& seleccionar_columna <= 8) {

						posicion_actual = tablero[seleccionar_fila][seleccionar_columna];

						System.out.print("has elegido mover " + posicion_actual);

						// hacemos un if si la posicion actual es nuestra ficha o no, si contiene un B
						// de blanca
						if (posicion_actual.contains("N")) {
							condicion = false;
						} else {
							System.out.print("no se puede mover, no es tu ficha, ");
						}
					} else {
						System.out.print("las coordenadas elegidas se salen del tablero, ");
					}
				}

				System.out.println();

				/*
				 * vemos donde la queremos mover y creamos un bucle por si elige moverse a una
				 * posicion que no puede, en ese caso le preguntaremos de nuevo a donde quiere
				 * moverse
				 */

				while (condicion == false) {
					System.out.println("jugador negro elige la fila a la que quieres moverte: ");
					mover_fila = reader.nextInt();
					System.out.println("jugador negro elige la columna a la que quieres moverte: ");
					mover_columna = reader.nextInt();
					
					
					// verificamos que las coordenadas sean validas
					if (mover_fila >= 1 && mover_columna >= 1 && mover_fila <= 8
							&& mover_columna <= 8) {
					
					posicion_futura = tablero[mover_fila][mover_columna];
					System.out.println("has elegido mover hacia" + tablero[mover_fila][mover_columna]);

					// si ya hay una ficha nuestra, no nos va a dejar mover
					if (posicion_futura.contains("N")) {
						System.out.println(" pero no se puede mover ahi, es tu ficha, ");

					} else {
						posicion_futura = posicion_futura.replace(posicion_futura, posicion_actual);
						posicion_reemplazada = posicion_actual = " *";
						tablero[mover_fila][mover_columna] = posicion_futura;
						tablero[seleccionar_fila][seleccionar_columna] = posicion_actual;
						condicion = true;
						finBla = false;
						finNeg = false;

						// Imprimimos todo para ver el movimiento
						for (int i = 0; i <= 8; i++) {
							for (int s = 0; s <= 8; s++) {

								System.out.print(tablero[i][s] + "  ");

								if (tablero[i][s].contains("kB")) {
									finBla = true;
								}

							}

							System.out.println();

						}
					}
					} else {
						System.out.print("las coordenadas elegidas se salen del tablero, ");
					}
				}
			}
		}
	}

}
