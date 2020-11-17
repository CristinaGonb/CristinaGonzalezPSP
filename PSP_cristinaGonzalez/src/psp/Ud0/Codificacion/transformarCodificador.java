package psp.Ud0.Codificacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class transformarCodificador {

	public static void main(String[] args) {
		File archivo = new File("original.txt");

		leerYTransformarCodifica(archivo);
		leerYTransformarDescodificar(archivo);
	}

	private static void leerYTransformarCodifica(File archivo) {
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(archivo));
				BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("originalCodificado.txt"))) {

			String texto;

			texto = filtroLectura.readLine();
			while (texto != null) {
				//codifico texto y lo escribo dentro del documento
				filtroEscritura.write(Codificador.codifica(texto) + "\n");

				texto = filtroLectura.readLine();
			}
			filtroEscritura.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error al leer el fichero" + e.getMessage());
		}
	}
	
	private static void leerYTransformarDescodificar(File archivo) {
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(archivo));
				BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("originalDescodificado.txt"))) {

			String texto;

			texto = filtroLectura.readLine();
			while (texto != null) {
				//decodifico texto y lo escribo dentro del documento
				filtroEscritura.write(Codificador.decodifica(texto) + "\n");

				texto = filtroLectura.readLine();
			}
			filtroEscritura.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error al leer el fichero" + e.getMessage());
		}
	}
}
