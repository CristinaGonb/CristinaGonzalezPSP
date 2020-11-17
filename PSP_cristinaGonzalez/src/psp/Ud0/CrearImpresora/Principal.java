package psp.Ud0.CrearImpresora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImpresoraSingleton impresora1= ImpresoraSingleton.getInstancia();
		ImpresoraSingleton impresora2= ImpresoraSingleton.getInstancia();
		
		//devuelve el mismo objeto, 
		System.out.println("Referencia de la primera impresora "+impresora1);
		System.out.println("Referencia de la segunda impresora "+impresora2);

	}

}
