package psp.Ud1.ProgMultiproceso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//env  variable de entorno clave-valor
public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * 1.1 Cree un objeto ProcessBuilder a través del cual consultar las
			variables de entorno.
		 */
		
		ProcessBuilder pbE= new ProcessBuilder();
		Map<String,String> variables= pbE.environment();//environment para consultar var de entorno
		System.out.println(variables);
		
		/*
		 * 1.2 Cree un segundo objeto ProcessBuilder para lanzar un proceso que
				muestre la ayuda del sistema para el comando ls (ls --help). Antes de
				lanzarlo, deben listarse los argumentos de la llamada.
		 */
		List<String> command= new ArrayList<String>();
		command.add("ls");
		command.add("--help");

		//creamos pb 
		ProcessBuilder pb = new ProcessBuilder(command);
		System.out.println(pb.command());//command devuelve un list string con nombre y argumentos
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
