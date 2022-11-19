package ejercicioN3;


public class EstructurasDeControl {
	
	public static void main(String[] args) {
		
	/*En este ejercicio tenéis que crear un bucle que permita 
	 	concatenar textos e imprima el resultado final por consola.
		Tened en cuenta que los textos pueden venir de un array de tipo String. */
		
		//se crea el array:
		String[] nombres = {"nicolas","alberto","carlos","andres"};
		
		//se utiliza un ciclo for each, con el metodo de concat para agregar los espacios y por ultimo se imprime
		//print para que salga en una linea.
		
		for(String nombre : nombres){
			System.out.print(nombre.concat(", "));
		};
		
	
	}
}
