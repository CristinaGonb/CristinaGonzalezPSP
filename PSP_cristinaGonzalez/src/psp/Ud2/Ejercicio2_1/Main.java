package psp.Ud2.Ejercicio2_1;

public class Main {
	/*
	 * 2 clases hilos que extiendan de la clase thread. uno de los hilos visualiza un bucle infinito con TIC y otro con tAC
	 * Dentro del bucle utilizamos el metodo sleep() para q nos de tiempo a ver las palabras que se visualizan cuando lo ejecutemos
	 * añadimos bloque try-catch (excepcion InterrumpedException) 
	 * main que visualice hilos tic tac de forma ordenada
	 */

	public static void main(String[] args) {
		HiloTic tic= new HiloTic();
		HiloTac tac= new HiloTac();
		
		//proceso demonio proceso usuario
		tic.setDaemon(true);
		tac.setDaemon(true);
		//diferencia entre demonio y proceso del sistema
		//al tener el demonio a true una vez se duerma finaliza, si no se pone, aunque lo durmamos se sigue mostrando
		
		tic.start();
		tac.start();
		
		try {
			Thread.sleep(5000);//duerme 5 seg
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
