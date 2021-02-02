package psp.Ud2.Hilos.Ejemplo1Runnable;

public class FordFiesta extends Coche implements Runnable{

	public FordFiesta(int km) {
		super(km);
		// TODO Auto-generated constructor stub
	}
	//Implemento metodo run 
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") El FordFiesta con km " + super.getKilometro());
		}
		
	}

}
