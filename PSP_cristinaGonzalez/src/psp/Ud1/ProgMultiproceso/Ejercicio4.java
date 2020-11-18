package psp.Ud1.ProgMultiproceso;

import java.io.IOException;

public class Ejercicio4 {
	/*
	 * Crea una clase Java cuyo método main lance un comando que provoque errores y
	 * muestre por pantalla el valor devuelto por el error.
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

		int valor;
		try {
			valor = proceso.waitFor();
			System.out.println("El comando " + comandoListar + " contiene los valores " + valor);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
