package psp.Ud2.Multihilo;

public class TestingDaemonThread {

	public static void main(String[] args) {
		//new EjemploDaemonThread().start();

		try {
			Thread.sleep(7500);
		} catch (InterruptedException e) {
			// Código de interrupción.
		}
		System.out.println("Hilo principal (main) finalizado.");
	}
}
