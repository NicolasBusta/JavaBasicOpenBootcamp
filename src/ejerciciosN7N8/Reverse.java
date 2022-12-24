package ejerciciosN7N8;


public class Reverse {

	public static void main(String[] args) {
		/*Escribe el código que devuelva una cadena al revés. 
		 * Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
		 * */

		// String is immutable
		String palabra = reverse("hola mundo");

		System.out.println("Tu palabra al reves es: " + palabra);
		
	}
	
	 public static String reverse(String texto) {
		
	        // traemos al string en su totalidad.
	        int frase = texto.length();
	 
	        // creamos un caracter array para la totalidad del string
	        char[] array = new char[frase];
	 
	        // se recorre la cadena de texto, luego se cuenta hacia atras el array.
	        for (int i = 0; i < frase; i++) {
	        	array[frase - i - 1] = texto.charAt(i);
	        }
	 
	        // se convierte el caracter del array en string.
	        return String.copyValueOf(array);
		 
	 }
	
}
