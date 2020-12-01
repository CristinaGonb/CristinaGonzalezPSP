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
			valor = proceso.waitFor();//comenta stado proceso para el hilo hasta q finaliza proceso
			System.out.println("El comando " + comandoListar + " contiene los valores " + valor);
			//cuando devuelve 0 es xq es correcto
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
