package psp.Ud2.Hilos.Ejemplo1Runnable;

public class SeatIbiza extends Coche implements Runnable{

	public SeatIbiza(int km) {
		super(km);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") SeatIbiza con km " + super.getKilometro());
		}
		
	}

}
