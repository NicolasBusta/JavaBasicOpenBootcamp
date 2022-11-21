package ejercicioN5;

import java.util.List;

//se Instancian los metodos de la interfaz, asosciandolos con la palabra implements:
public class CocheCRUDImpl implements CocheCRUD {

//Se realizan las instancias de los metodos o su logica:
	
	@Override
	public void save(CocheCRUDImpl cocheImplemen) {
		System.out.println("se agrega coche");
		
	}

	@Override
	public List<CocheCRUDImpl> findAll() {
		System.out.println("se muestran todos los coches");
		return null;
	}

	@Override
	public List<CocheCRUDImpl> delete() {
		System.out.println("se elimino el coche");
		return null;
	}
	
	
}
