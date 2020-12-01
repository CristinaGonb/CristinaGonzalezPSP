package psp.Ud1.ProgMultiproceso;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * 	Realizar una clase Java cuyo método main cree un ProcessBuilder con un
	List de String realizando un listado del directorio src.

	Las salidas estándar y de error deben ser redirigidas a un fichero cuyo
	nombre sea salida_ejercicio9.txt y log_ejercicio9.txt respectivamente.

	Además, por pantalla debe indicarnos un mensaje sobre qué fichero
	consultar en función de si la ejecución del proceso ha sido o no errónea.
 */
public class Ejercicio9 {

	public static void main(String[] args) {

		List<String> command = new ArrayList<String>();// command devuelve un list string con listado directorio
		command.add("ls");// comando
		command.add("srrc");// argumento
		Process proceso = null;
		int resultado=-1;// cuando proceso finaliza proceso es un int (0 bn, 1 mal)

		ProcessBuilder pb = new ProcessBuilder(command);

		// Proceso me escribe los errores en un archivo y la salida en otro fichero
		pb.redirectError(new File("log_ejercicio9.txt"));
		pb.redirectOutput(new File("salida_ejercicio9.txt"));
		
		try {
			proceso = pb.start();
			resultado = proceso.waitFor();// parate hasta q el prceso termine, y cuando lo haga recoge el valor devuelto
			System.out.println("El comando " + command + " ha resultado " + resultado);

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		if (resultado == 0) {
			System.out.println("Si esta ok,consulta el fichero de salida");
		} else {
			System.out.println("Si da error,consulta el fichero de log");
		}

	}

}
