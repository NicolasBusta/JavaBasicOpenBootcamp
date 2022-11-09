package ejercicioN2;

public class Funciones {

	public static void main(String[] args) {
		
	//Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido:
		
		//se almacena el resultado en una variable para imprimir:
		double ivaProducto = calcularIva(17000);//se introduce un valor a la funcion.
		System.out.println(ivaProducto);
	
	}
		//se crea la funcion con el parametro double:
	public static double calcularIva(double precio) {
		//se crea la variable del resultado y se multiplica por el iva:
		double resultado;
		resultado = precio * 0.21; //IVA en argentina 21%
		return resultado;
			
	}
}
