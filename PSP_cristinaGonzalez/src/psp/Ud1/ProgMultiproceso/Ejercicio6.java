package psp.Ud1.ProgMultiproceso;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Crea una clase Java cuyo método main lance un comando que provoque errores y
		 * genere un fichero con la descripción del error.
		 */

		Runtime rt = Runtime.getRuntime();// Ejecuccion
		String comandoListar = "lsss";

		Process proceso = null;

		try {
			proceso = rt.exec(comandoListar);
			
			//BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("logComando.txt"));
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
