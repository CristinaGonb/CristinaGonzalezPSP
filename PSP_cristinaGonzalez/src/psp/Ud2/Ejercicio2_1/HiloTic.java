package psp.Ud2.Ejercicio2_1;

public class HiloTic extends Thread {

	public void run() {
		while (true) {
			System.out.println("Tic...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
