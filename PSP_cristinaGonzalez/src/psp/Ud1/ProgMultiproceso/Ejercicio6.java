package psp.Ud1.ProgMultiproceso;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {
//clase cadena mejora mantenimiento app
	public static void main(String[] args) {
		/*
		 * Crea una clase Java cuyo método main lance un comando que provoque errores y
		 * genere un fichero con la descripción del error.
		 */

		Runtime rt = Runtime.getRuntime();// Ejecuccion
		String comandoListar = "lsss -help";

		Process proceso = null;

		try {
			proceso = rt.exec(comandoListar);

		} catch (Exception e) {
			// como quiero un fichero q describa el error, hago el buffer dentro del catch q
			// es el q recoge el error
			try (BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("logComando.txt"))) {
				filtroEscritura.write(e.getMessage());
				filtroEscritura.newLine();
			} catch (IOException f) {
				System.out.println(f.getMessage());
			}
		}
	}

}
