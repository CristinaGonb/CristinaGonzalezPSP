package psp.Ud0.EjercicioProcImpresion;

import psp.Ud0.EjercicioProcImpresion.Planificador;
import psp.Ud0.EjercicioProcImpresion.PlanificadorSTF;
import psp.Ud0.EjercicioProcImpresion.ProcesoImpresion;

public class Main {
/*
 * 
 */
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		//Creamos 5 procesos
		//cambio
		ProcesoImpresion proceso1 =new ProcesoImpresion((int) Math.floor(Math.random()*4+1)*1000);
		
		ProcesoImpresion proceso2 =new ProcesoImpresion((int) Math.floor(Math.random()*4+1)*1000);
		
		ProcesoImpresion proceso3 =new ProcesoImpresion((int) Math.floor(Math.random()*4+1)*1000);
		ProcesoImpresion proceso4 =new ProcesoImpresion((int) Math.floor(Math.random()*4+1)*1000);
		ProcesoImpresion proceso5 =new ProcesoImpresion((int) Math.floor(Math.random()*4+1)*1000);
		planificador(proceso1,proceso2,proceso3,proceso4,proceso5);
		planificadorSTF(proceso1,proceso2,proceso3,proceso4,proceso5);
		
	}

	private static void planificadorSTF(ProcesoImpresion proceso1, ProcesoImpresion proceso2, ProcesoImpresion proceso3, ProcesoImpresion proceso4,
			ProcesoImpresion proceso5) throws InterruptedException {
		///Creamos planificador
		PlanificadorSTF planificador= new PlanificadorSTF();
		//Añadimos los procesos
		planificador.put(proceso1);
		planificador.put(proceso2);
		planificador.put(proceso3);
		planificador.put(proceso4);
		planificador.put(proceso5);
		//Ordenamos por tiempo
		planificador.ordenar();
		//"Ejecutamos" el planificador
		planificador.sirve();
		
		
	}

	private static void planificador(ProcesoImpresion proceso1, ProcesoImpresion proceso2, ProcesoImpresion proceso3, ProcesoImpresion proceso4,
			ProcesoImpresion proceso5) throws InterruptedException {
		///Creamos planificador
		Planificador planificador= new Planificador();
		//Añadimos los procesos
		planificador.put(proceso1);
		planificador.put(proceso2);
		planificador.put(proceso3);
		planificador.put(proceso4);
		planificador.put(proceso5);
		//"Ejecutamos" el planificador
		planificador.sirve();
		
	}
	
	
}