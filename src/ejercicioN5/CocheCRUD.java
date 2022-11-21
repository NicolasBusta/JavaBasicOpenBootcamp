package ejercicioN5;

import java.util.List;

//Se realiza la interfaz que servira para saber que metodos usar y luegpo isntanciarlos(CRUD):

public interface CocheCRUD {
	
	void save(CocheCRUDImpl  cocheImplemen );
	
	List<CocheCRUDImpl>findAll();
	
	List<CocheCRUDImpl>delete();
	
}
