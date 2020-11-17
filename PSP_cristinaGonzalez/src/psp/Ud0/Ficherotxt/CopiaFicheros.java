package psp.Ud0.Ficherotxt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaFicheros {

	public static void main(String[] args) {

		File archivo = new File("original.txt");

		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(archivo));
				BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("originalCopia.txt"))) {

			String linea;

			// Leemos la lineas del fichero de texto
			linea = filtroLectura.readLine();
			while (linea != null) {
				//escribimos
				filtroEscritura.write(linea +"\n");
				linea = filtroLectura.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error al leer el fichero " + e.getMessage());
		}
	}

}
