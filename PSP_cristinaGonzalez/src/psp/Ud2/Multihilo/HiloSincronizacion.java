package psp.Ud2.Multihilo;
//3 hilos main,A,B
public class HiloSincronizacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contador cont = new Contador(100);
		HiloA a = new HiloA("HiloA", cont);
		HiloB b = new HiloB("HiloB", cont);
		a.start();
		b.start();
		
		//main espera a q se ejecute el join
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//microprocesador pilla a y b a la vez
	static class Contador {
		private int c = 0; // atributo contador

		Contador(int c) {
			this.c = c;
		}

		public void incrementa() {
			c = c + 1;
		}

		public void decrementa() {
			c = c - 1;
		}

		public int getValor() {
			return c;
		}
	}

	static class HiloA extends Thread {
		private Contador contador;

		public HiloA(String n, Contador c) {
			setName(n);
			contador = c;
		}

		//synchronized garantiza q todo se haga de una vez
		public void run() {
			// el codigo entra en este bucle sin que ningun hilo esté usandolo
			// obj bloqueo pregunta si no hay ningun hilo,si lo hay bloquea
			//y ejecuta primero este, y luego el otro(manera atomica)
			synchronized (contador) {
				for (int j = 0; j < 100; j++) {
					contador.incrementa(); // incrementa el contador
//					try {
//						sleep(100);
//					} catch (InterruptedException e) {
//					}
				}

				System.out.println(getName() + " contador vale " + contador.getValor());
			} //el syso se mete en el synchronized xra q termine el hilo de ejecutar y lo imprima terminado
			//si no le da tiempo de restar 1 cuando ejecuta el siguiente
		}
	}

	static class HiloB extends Thread {
		private Contador contador;

		public HiloB(String n, Contador c) {
			setName(n);
			contador = c;
		}

		public void run() {
			synchronized (contador) {
				for (int j = 0; j < 100; j++) {
					contador.decrementa(); // decrementa el contador
//					try {
//						sleep(100);
//					} catch (InterruptedException e) {
//					}
				}
				System.out.println(getName() + " contador vale " + contador.getValor());
			}
		}
	}
}
