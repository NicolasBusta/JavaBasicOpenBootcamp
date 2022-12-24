package ejerciciosN7N8;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEjer {
	
	public static void main(String[] args) {
	
		/*
		 * 1)Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. 
		 * Recorre ambos mostrando únicamente el valor de cada elemento.
		 * 2)Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. 
		 * A continuación, con otro bucle, recórrelo y elimina los numeros pares. 
		 * Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, 
		 * puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
		 * */
		
		//1)creamos la arrayList:
		ArrayList<String> listaNombres = new ArrayList<String>();
		
		//agregamos los datos:
		listaNombres.add("Daniel");
		listaNombres.add("alberto");
		listaNombres.add("camus");
		listaNombres.add("luis");
		
		//se impimre el arrayList:
		System.out.println("los nombres del ArrayList son:"+listaNombres);
		
		//creamos el ArrayList:
		
		LinkedList<String>listaNombres1= new LinkedList<String>();
		
		//agregamos los datos:
			listaNombres1.add("Daniel");
			listaNombres1.add("alberto");
			listaNombres1.add("camus");
			listaNombres1.add("luis");
				
				//se impimre el arrayList:
				System.out.println("los nombres de la LinkedList son :"+listaNombres1);
				
		//2) creamos el array:
				
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//Se crea el for para rellenarlo automatiocamente con los numeros del 1 al 10:
		for (int i = 1; i <=10; i++) {
			numeros.add(i);
		//	numeros.removeIf(n -> (n%2 == 0)); //esta seria la forma mas sencilla
		}
		
		//se imrime por pantalla:
		System.out.println("Todos los numeros son:"+numeros);
		
		//se realiza el otro for para eliminar los numeros pares:
		for (int i = 0; i < numeros.size(); i++) {
			if(i%2 !=0) {
				System.out.print(i+" ");
			}
			
		}
	}
}
