package ejercicioFinalN9;

import java.util.Scanner;

/* Programa de una tienda de cervezas en JAVA 1.8
 * Este programa puede:
 * -Registrar Producto.
 * -realizar una copia en un archivo de texto.
 * -Buscar Producto.
 * -Borrar Producto.
 * -Imprimir Productos*/


public class Main {

	public static void main(String[] args) {
		
		//se implementa el menu con las respectivas opciones:
		Scanner teclado = new Scanner(System.in);
		
		int opcion = 0;
		do {
			System.out.println("\n\t\tMENU TIENDA DE CERVEZAS");
			System.out.println("\t\t---- ------ -- -------\n");
			System.out.println("[1] -- Registrar Producto");
			System.out.println("[2] -- Buscar Producto");
			System.out.println("[3] -- Borrar Producto");
			System.out.println("[4] -- Imprimir Lista Productos");
			System.out.println("[5] -- SALIR");
			System.out.print("Opcion: ");
			opcion = Integer.parseInt(teclado.nextLine());
			
			//En cada caso se instancia la funcion de la clase metodos:
			
			switch(opcion) {
			case 1:
				Metodos.registrar();
				break;
			case 2:
				Metodos.buscar();
				break;
			case 3:
				Metodos.borrar();
				break;
			case 4:
				Metodos.imprimir();
				break;
			case 5:
				System.out.println("\n\t\tFIN DE PROGRAMA");
				break;
			default:
				System.out.println("\nOpcion equivocada");
			}
		} while (opcion != 5);

	}
	
}
	
