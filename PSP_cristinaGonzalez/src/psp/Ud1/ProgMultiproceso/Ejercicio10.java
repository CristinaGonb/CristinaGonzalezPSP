package psp.Ud1.ProgMultiproceso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/*
 * Crea una clase java cuyo método main añada la variable de entorno MI_NOMBRE
con vuestro nombre de pila. A continuación ha de obtener del sistema el
contenido de la variable y pintarlo por pantalla:
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		List<String> comandLinux= new ArrayList<String>();
		comandLinux.add("/bin/bash");
		comandLinux.add("-c");
		comandLinux.add("echo $PATH");


		List<String> comandWindows= new ArrayList<String>();
		comandWindows.add("CMD");
		comandWindows.add("/C");
		comandWindows.add("echo");
		comandWindows.add("%MI_NOMBRE%");
		
		List <String> command = null;
		//os.name es el nombre del sistema
		if( System.getProperty("os.name").contains("Windows")) {
			command=comandWindows;
		}else {
			command=comandLinux;
		}
		
		ProcessBuilder proces= new ProcessBuilder(command);
		
		 Map<String,String> vEnt= proces.environment();
		 vEnt.put("CLASSPATH","CRIS");
		 System.out.println("Entorno" +vEnt);
		 
		//proces.environment().put("MI_NOMBRE", "CRIS");//devuelve var en
		proces.inheritIO();//pinta x salida estandar valor variable mi nombre
		
		try {
			proces.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
