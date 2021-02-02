package psp.Ud2.Hilos.Ejemplo1Runnable;

public class Principal {

	public static void main(String[] args) {

		FordFiesta ff = new FordFiesta(4);
		SeatIbiza sl = new SeatIbiza(6);
		System.out.println("***********");

		Thread hilo1 = new Thread(ff);
		hilo1.start();
		System.out.println("Inicio hilo1");

		Thread hilo2 = new Thread(sl);
		hilo2.start();
		System.out.println("Inicio hilo2");

		// Se ejecuta uno por uno, (en algun momento,se entrelazan los procesos) 
		// se resuelve esa ejecución de forma aleatoria

	}

}
