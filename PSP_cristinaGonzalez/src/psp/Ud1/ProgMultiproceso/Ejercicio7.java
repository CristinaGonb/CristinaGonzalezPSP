package psp.Ud1.ProgMultiproceso;

import java.io.IOException;

public class Ejercicio7 {

	public static void main(String[] args) {
		Process proceso = null;
		String comando="firefox";
		try {
			//iniciamos proceso
			ProcessBuilder pb = new ProcessBuilder(comando, "www.iescristobaldemonroy.es/wordpress/");
			proceso=pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
