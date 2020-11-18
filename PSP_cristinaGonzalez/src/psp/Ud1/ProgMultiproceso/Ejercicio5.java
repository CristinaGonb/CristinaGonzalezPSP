package psp.Ud1.ProgMultiproceso;

import java.io.IOException;

public class Ejercicio5 {

	/*
	 * Crea una clase Java cuyo método main lance un comando que provoque
	 * errores y pinte por pantalla la descripción del error.
	 */
	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();// Ejecuccion
		String comandoListar = "lsss";

		
		Process proceso = null;

		try {
			proceso = rt.exec(comandoListar);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
