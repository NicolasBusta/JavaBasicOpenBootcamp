package ejercicioFinalN9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

// Se realiza aqui toda la logica de negocio, con la gestion de cada funcion:

public class Metodos {
	
	// Se instancia para todos los metodos :
	private static ArrayList<Cervezas> productos = new ArrayList<Cervezas>();
	private static Scanner teclado = new Scanner(System.in);
	
	//Funcion para registrar y copiar el pedido en un archivo de texto:
	
	public static void registrar() {
		
		System.out.println("\nNUEVO PRODUCTO");
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Precio: ");
		int precio = Integer.parseInt(teclado.nextLine());
		System.out.print("Marca: ");
		String marca = teclado.nextLine();
		System.out.print("Tipo: ");
		String tipo = teclado.nextLine();
		
		Cervezas nuevo = new Cervezas(nombre, precio, marca, tipo);
		
		//Se guarda tembien el pedido en un archivo de texto:
		 try {
	         System.out.print("Guardando pedido en el fichero... ");
	         ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
	                 new FileOutputStream("prueba.txt")); //Aqui se especifica el documento. 
	         escribiendoFichero.writeObject(nuevo); 
	         escribiendoFichero.close();
	         System.out.println("ok!");
	     } catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
		
		//Mientras ya exista un la lista un producto con el mismo ID..
		while (productos.contains(nuevo))
			nuevo.asignaID(); //...le asignamos un nuevo ID, hasta obtener uno que no exista en la lista
		
		//Ya tenemos producto con un ID único
		productos.add(nuevo);
		System.out.println("\nNuevo Producto registrado...");
	   	
	}
	
	//Funcion para buscar por ID
	public static void buscar() {
		
		System.out.println("\n\t--BUSCAR PRODUCTO--");
		System.out.print("ID producto: ");
		int id = Integer.parseInt(teclado.nextLine());

		Cervezas buscado = null;
		for (int i = 0; i < productos.size(); i++)
			if (productos.get(i).getId() == id)
				buscado = productos.get(i);
				

		if (buscado != null)
			System.out.println("Producto:"+""+buscado);
		else {
			System.out.println("\nProducto no existe");
		}
	}
	
	//Funcion para borrar por ID
	public static void borrar() {
		
		System.out.println("\n\t--ELIMINAR PRODUCTO--");
		System.out.print("ID producto: ");
		int id = Integer.parseInt(teclado.nextLine());

		Cervezas buscado = null;
		for (int i = 0; i < productos.size(); i++)
			if (productos.get(i).getId() == id)
				buscado = productos.get(i);

		if (buscado == null)
			System.out.println("\nNo existe producto con el ID: " + id);
		else {
			productos.remove(buscado);
			System.out.println("\nProducto eliminado");
		}
	}
	
	//Funcion para imprimir los productos guardados:
	
	public static void imprimir() {
		System.out.println("\nPRODUCTOS REGISTRADOS");
		if (productos.isEmpty())
			System.out.println("No hay Productos registrados.");
		else
			for (Cervezas prd: productos) {
				System.out.println("\n*********************************");
				System.out.println(prd);
				
				
			}	
	}
	
}
