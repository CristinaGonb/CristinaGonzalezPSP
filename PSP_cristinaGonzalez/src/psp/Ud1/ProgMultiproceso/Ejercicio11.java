package psp.Ud1.ProgMultiproceso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
* Realiza una clase Java cuyo método main lance un proceso ejecutando la
clase del Ejercicio10.
 *
 * @author cris
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		List<String> lCommand = new ArrayList<String>();
		lCommand.add("java");
		lCommand.add("psp/Ud1/ProgMultiproceso/Ejercicio10");

		ProcessBuilder pb = new ProcessBuilder(lCommand);
		//ctl + L o terminal pwd
		String classpath = "/home/cristina/Documentos/programacionServicios/PSP_cristinaGonzalez/bin";

		pb.environment().put("CLASSPATH", classpath);
		pb.inheritIO();

		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
