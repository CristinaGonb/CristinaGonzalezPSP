package psp.Ud1.ProgMultiproceso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * / Crea una clase Java cuyo método main liste los ficheros del directorio
		 * actual y los guarde en un fichero de texto.
		 */
		Runtime rt = Runtime.getRuntime();// Ejecucion

		String comandoListar = "ls --help";
		Process proceso = null;

		try {
			proceso = rt.exec(comandoListar);

			InputStream is = proceso.getInputStream();// devuelve entrada de flujo de bytes
			BufferedReader filtroLectura = new BufferedReader(new InputStreamReader(is));

			BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("salidaComando.txt"));
			String linea;

			while ((linea = filtroLectura.readLine()) != null) {
				filtroEscritura.write(linea);
				filtroEscritura.newLine();
			}
			filtroLectura.close();
			filtroEscritura.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
