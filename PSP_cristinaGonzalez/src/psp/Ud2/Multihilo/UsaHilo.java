package psp.Ud2.Multihilo;

public class UsaHilo {

	public static void main(String[] args) {

		HiloSimple hs= new HiloSimple();
		//el metodo start crea un nuevo hilo, intercala la ejecucion del for
		hs.start();
		//hs.run();
		for (int i = 0; i < 5; i++) {
			System.out.println("Fuera del hilo....");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
