package ejercicioN5;

public class Main {
	
	public static void main(String[] args) {
	
	/*
		Crear una interfaz CocheCRUD.

		Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

		Como métodos de CocheCRUD podemos poner:

		save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

		Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
		  
	*/
		
		//Se crea el objeto el cual vamos a instanciar:
		
		CocheCRUDImpl cocheCRUDImpl = new CocheCRUDImpl();
		
		//Se Instancian los metodos correspondientes:
		
		cocheCRUDImpl.save(cocheCRUDImpl);
		cocheCRUDImpl.findAll();
		cocheCRUDImpl.delete();
	}
}
