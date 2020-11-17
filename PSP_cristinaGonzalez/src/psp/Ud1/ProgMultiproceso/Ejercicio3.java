package psp.Ud1.ProgMultiproceso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * / Crea una clase Java cuyo método main liste los ficheros del directorio
		 * actual y los guarde en un fichero de texto.
		 */

		// Referencia del directorio que queremos mostrar

		File directorioActual = new File(
				"/home/cristina/Documentos/programacionServicios/PSP_cristinaGonzalez/src/psp/Ud1/ProgMultiproceso");

		File ficheroTexto= new File("ficheroEjercicio3Copia.txt");
		try(BufferedWriter filtroEscritura= new BufferedWriter(new FileWriter(ficheroTexto))){
			
			String[] ficheros = directorioActual.list();

			if (ficheros == null) {
				System.out.println("No hay ficheros en tu directorio actual");
			} else {
				for (int i = 0; i < ficheros.length; i++) {
					System.out.println(ficheros[i]);
					//Escribo fichero de txt
					filtroEscritura.write(ficheros[i]+"\n");
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
