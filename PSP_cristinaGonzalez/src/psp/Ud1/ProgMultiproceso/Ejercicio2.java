package psp.Ud1.ProgMultiproceso;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio2 {
	/*
	 * Crea una clase Java cuyo método main liste los ficheros del directorio actual
	 * y los pinte por pantalla.
	 */
	public static void main(String[] args) {
		Runtime rt= Runtime.getRuntime();//Ejecucion
		
		String comandoListar="ls --help";
		Process proceso= null;
		
		try {
			proceso= rt.exec(comandoListar);
			
			InputStream is= proceso.getInputStream();//devuelve entrada de flujo de bytes
			BufferedReader filtroLectura= new BufferedReader(new InputStreamReader(is));
			
			String linea;
			
			while((linea=filtroLectura.readLine())!=null) {
				System.out.println(linea);
			}
		}catch(IOException e) {
			System.out.println("Error al ejecutar"+e.getMessage());
		}
	}
}
