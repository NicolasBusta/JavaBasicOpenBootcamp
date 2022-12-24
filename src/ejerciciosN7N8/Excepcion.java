package ejerciciosN7N8;



public class Excepcion {
	
	public static void main(String[] args) {
	
		/* Crea una función DividePorCero. Esta, debe generar una excepción ("throws") 
		 * a su llamante del tipo ArithmeticException que será capturada por su llamante 
		 * (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje 
		 * "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
		 * */
		
		//instanciamos el la funcion:
		float resultado = DividePorCero(0,0);
		System.out.println("el resultado es:"+resultado);
	}
	
	
	//Creamos la funcion para dividir:
	
	private static float DividePorCero(int num1,int num2){
		
		//se declaran las variables:
		int numeroA = num1;
		int numeroB = num2;
		float division =0;
		
		//se crea el try:
		try{	
		division = numeroA/numeroB;
		}
		//se lanza la excepcion:
		catch(ArithmeticException e){
			
			 System.out.println("No se puede dividir:"+e.getMessage());     
		}
		//devuelve el resultado:
		return division;
		
	}
	
	
	
}
