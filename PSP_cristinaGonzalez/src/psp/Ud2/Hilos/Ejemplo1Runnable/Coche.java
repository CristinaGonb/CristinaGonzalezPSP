package psp.Ud2.Hilos.Ejemplo1Runnable;

public abstract class Coche {

	private int kilometro;

	public Coche(int km) {
		this.kilometro = km;
	}

	public int getKilometro() {
		return kilometro;
	}

	public void setKilometro(int kilometro) {
		this.kilometro = kilometro;
	}

	@Override
	public String toString() {
		return "Coche [kilometro=" + kilometro + "]";
	}


}
