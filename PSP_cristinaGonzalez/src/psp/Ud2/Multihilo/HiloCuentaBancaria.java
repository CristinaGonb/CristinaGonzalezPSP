package psp.Ud2.Multihilo;

public class HiloCuentaBancaria {

	public static void main(String[] args) {
		
		Cuenta c = new Cuenta(40);
		SacarDinero hAna = new SacarDinero("Ana", c);
		SacarDinero hJuan = new SacarDinero("Juan", c);
		
		hAna.start();
		hJuan.start();

		//con el join para la ejecución del hilo principal
		try {	
			hAna.join();
			hJuan.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fin del hilo principal.");
	}

	static class Cuenta {
		private int saldo;

		Cuenta(int s) {
			saldo = s;
		} // inicializa saldo actual

		int getSaldo() {
			return saldo;
		} // devuelve el saldo

		void restar(int cantidad) { // se resta la cantidad al saldo
			saldo = saldo - cantidad;
		}

		// si una persona retira dinero, la otra no puede hasta que la otra persona haya
		// terminado (atomica)
		// synchronized
		// Hilo invoca a synchronized, toma el bloqueo del hilo al que pertenece
		synchronized void retirarDinero(int cant, String nom) {
			//synchronized (this){
			if (getSaldo() >= cant) {
				System.out.println("SE VA A RETIRAR SALDO (ACTUAL ES: " + getSaldo() + ")");
				try {
					Thread.sleep(500);
				} catch (InterruptedException ex) {
				}
				restar(cant);
				System.out.println(nom + " retira => " + cant + " ACTUAL(" + getSaldo() + ")");
			} else {
				System.out.println(nom + " No puede retirar dinero, NO HAY SALDO (" + getSaldo() + ")");
			}
			if (getSaldo() < 0) {
				System.out.println("SALDO NEGATIVO => " + getSaldo());
			}
			//} (synchronized)
		}// RetirarDinero
	}// Cuenta

	static class SacarDinero extends Thread {
		private Cuenta c;
		String nom;

		public SacarDinero(String n, Cuenta c) {
			super(n);
			this.c = c;
		}

		public void run() {
			for (int x = 1; x <= 4; x++) {
				c.retirarDinero(10, getName());
			}
		} // run
	}
}
