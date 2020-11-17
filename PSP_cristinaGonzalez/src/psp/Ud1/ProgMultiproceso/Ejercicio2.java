package psp.Ud1.ProgMultiproceso;

import java.io.File;

public class Ejercicio2 {
	/*
	 * Crea una clase Java cuyo método main liste los ficheros del directorio actual
	 * y los pinte por pantalla.
	 */
	public static void main(String[] args) {
		// Referencia del directorio que queremos mostrar
		File directorioActual = new File("/home/cristina/git/Ficheros/Ficheros/PSP/UD01");

		System.out.println(directorioActual.getAbsolutePath());
		
		String[] ficheros = directorioActual.list();

		if (ficheros == null) {
			System.out.println("No hay ficheros en tu directorio actual");
		} else {
			for (int i = 0; i < ficheros.length; i++) {
				System.out.println(ficheros[i]);
			}
		}
	}
}
