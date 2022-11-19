package ejercicioN4;


//Clase Hija2:

public class SmartWatch extends SmartDevice {
	//Atributos:
	
	boolean resistenteAlAgua;
	String tamañoDePantalla;
	
	
	//Constructor vacio:
	
			public SmartWatch(){
			
			}
		//Constructor con los atributos:
			
			public SmartWatch(int idSmartWatch,String nombreSmartWatch,String marcaSmartWatch,String modeloSmartWatch,String colorSmartWatch,double memoriaSmartWatch,boolean resistenciaAlAguaSmartWatch,String tamañoDePantallaSmartWatch) {
				
				id = idSmartWatch;
				nombre = nombreSmartWatch;
				marca = marcaSmartWatch;
				modelo = modeloSmartWatch;
				color = colorSmartWatch;
				memoriaInterna = memoriaSmartWatch;
				resistenteAlAgua = resistenciaAlAguaSmartWatch;
				tamañoDePantalla = tamañoDePantallaSmartWatch;
				
			}
			
			//Getters y Setters:

			public boolean isResistenteAlAgua() {
				return resistenteAlAgua;
			}

			public void setResistenteAlAgua(boolean resistenteAlAgua) {
				this.resistenteAlAgua = resistenteAlAgua;
			}

			public String getTamañoDePantalla() {
				return tamañoDePantalla;
			}

			public void setTamañoDePantalla(String tamañoDePantalla) {
				this.tamañoDePantalla = tamañoDePantalla;
			}

			//se hace un metodo para traer todos los atributos de la clase en un String:
			
			@Override
			public String toString() {
				return "SmartWatch [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo
						+ ", color=" + color + ", memoriaInterna=" + memoriaInterna + ", resistenteAlAgua="
						+ resistenteAlAgua + ", tamañoDePantalla=" + tamañoDePantalla + "]";
			}
			
			
			
			
			
}
