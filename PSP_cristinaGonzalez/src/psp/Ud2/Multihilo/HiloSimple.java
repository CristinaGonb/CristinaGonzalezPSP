package psp.Ud2.Multihilo;

public class HiloSimple extends Thread {
public void run() {
	for (int i = 0; i < 5; i++) {
		System.out.println("En el hilo.....");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
//run llamo metodo de una clase