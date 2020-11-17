package psp.Ud0.CrearImpresora;
/*
 * Constructor privado donde solo puede crear un objeto(clase especifica)
 * No puede haber mas de una instancia en un objeto(procesos)
 * Ej no puede haber mas de una instancia de impresora en un obj
 * privatizar constructor para que nadie pueda construir
 * 
 */
public class ImpresoraSingleton {
	
	private static ImpresoraSingleton instancia;//acesible para los obj de la clase
	
	//Constructor vacio
	private ImpresoraSingleton() {
		
	}
	
	//get
	public static ImpresoraSingleton getInstancia() {
		//la primera vez q llame y sea nulo, me genera un obj y lo guardo
		if(instancia == null) {
			System.out.println("Pimera llamada por tanto creo la impresora");
			instancia= new ImpresoraSingleton();
		}
		else {
			System.out.println("La impresora ya existe, devuelvo la instancia ya creada");
		}
		return instancia;
		
	}
	//modificador de visibilidad
	public static void imprimir() {
		
	}
}
