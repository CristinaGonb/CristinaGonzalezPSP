package psp.Ud1.ProgMultiproceso;

import java.io.IOException;
/*
 * Crea una clase Java cuyo método main lance la aplicación de Firefox.
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		Runtime rt= Runtime.getRuntime(); //constructor privado
		Process p=null;
		try {
			p= rt.exec("firefox");
			/*
			 * Para window (Ejemplo instalación)
			 * rt.exec("ruta absoluta-propiedades firefox");
			 */
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("prueba");
		}
	}//getinput stream devuelve un flujo byte del ls

}
