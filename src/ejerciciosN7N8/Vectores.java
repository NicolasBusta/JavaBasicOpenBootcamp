package ejerciciosN7N8;
//IMPORTAMOS:
import java.util.Vector;

public class Vectores {
	
	public static void main(String[] args) {
	/*
	 * Crea un "Vector" del tipo de dato que prefieras,
	  y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.*/
		
		//creamos el vector:
		
		Vector<String> vectorNombres = new Vector();
		
		//adicionamos el contenido con el metodo add:
		
		vectorNombres.add("carlos");
		vectorNombres.add("nicolas");
		vectorNombres.add("jasmin");
		vectorNombres.add("carla");
		vectorNombres.add("alberto");
		
		System.out.println("los nombres son:"+vectorNombres);
		
		//eliminamos el 2o y 3er elemento:
		
		vectorNombres.remove(3);
		vectorNombres.remove(2);
		
		//mostramso el resultado:
		
		System.out.println("los nombres finales son:"+vectorNombres);
		
		/*Indica cuál es el problema de utilizar un Vector con la 
		capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.*/
		
		//Respuesta: al dejar el vector con capacidad por defecto y al tener tal volumen de almacenamiento,
		//duplicaria inecesariamente el uso de la memoria del dispositvo.
	}
}
