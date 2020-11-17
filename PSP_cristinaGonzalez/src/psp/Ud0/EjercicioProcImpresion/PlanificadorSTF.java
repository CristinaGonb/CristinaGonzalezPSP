package psp.Ud0.EjercicioProcImpresion;

//coleccion(linkelist)
/*
 * metodo put para insertar los elementos del linkelist(procesos) en mi coleccion
 * metodo q prepara el microprocesador y lo ordena de menor a mayor(menos dure y mas dure)(collection.sort()())
 * ordenar array con met burbuja
 * metodo sirve coge procesos y los sirve(dormir el hilo tb tanto seg como dura)(los coge y los duerme)
 * 
 */
//Planificación shorter time first

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

import psp.Ud0.EjercicioProcImpresion.ProcesoImpresion;


public class PlanificadorSTF {

	ArrayList<ProcesoImpresion> procesos = new ArrayList<ProcesoImpresion>(); // Create an ArrayList object
	ProcesoImpresion procesoEnEjecucion;

	public PlanificadorSTF() {
	}

	public void put(ProcesoImpresion procesoAIntroducir) {

		procesos.add(procesoAIntroducir);

	}

	public void ordenar() {
		Collections.sort(procesos);
	}

	public void sirve() throws InterruptedException {
		ProcesoImpresion procesoPorPantalla;
		for (int i = 0; i < procesos.size(); i++) {
			procesoPorPantalla = procesos.get(i);
			System.out.println(
					"Proceso " + procesoPorPantalla.getNombre() + " duracion " + procesoPorPantalla.getDuracion());
			Thread.sleep(procesoPorPantalla.getDuracion());
			System.out.println("Fin de proceso");
			procesos.remove(i);

		}
	}

}