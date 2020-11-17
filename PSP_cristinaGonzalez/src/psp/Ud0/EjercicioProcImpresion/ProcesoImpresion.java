package psp.Ud0.EjercicioProcImpresion;

public class ProcesoImpresion implements Comparable<ProcesoImpresion> {

	private String nombre;
	private int duracion;
	private static int contadorNombre = 0;

	public ProcesoImpresion(int duracion) {
		this.duracion = duracion;
		this.nombre = "P_" + contadorNombre;
		// Incluyo una variable estatica que pondra automaticamente el nombre a los
		// procesos
		contadorNombre++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "ProcesoImpresion [nombre=" + nombre + ", duracion=" + duracion + "]";
	}

	@Override
	public int compareTo(ProcesoImpresion p) {

		if (p.getDuracion() > duracion) {
			return -1;
		} else if (p.getDuracion() == duracion) {
			return 0;
		} else
			return 1;
	}

}
