package ejercicioN4;


//Clase padre:

public  class SmartDevice {
	
	//Atributos generales:
	
	public int id;
	public String nombre;
	public String marca;
	public String modelo;
	public String color;
	public double memoriaInterna;
	
	
	//Constructor vacio:
	
			public SmartDevice(){
				
			}
		
	//Constructor con los atributos:
	
	public SmartDevice(int idDispositivo,String nombreDispositivo,String marcaDispositivo,String modeloDispositivo,String colorDispositivo,double memoriaDispositivo ) {
		
		id = idDispositivo;
		nombre = nombreDispositivo;
		marca = marcaDispositivo;
		modelo = modeloDispositivo;
		color = colorDispositivo;
		memoriaInterna = memoriaDispositivo;
	}

	//Getters y Setters:
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMemoria() {
		return memoriaInterna;
	}

	public void setMemoria(double memoria) {
		this.memoriaInterna = memoria;
	}
	
	//se hace un metodo para traer todos los atributos de la clase en un String:
	
	@Override
	public String toString(){

	    return "Id: '" + this.id + "', Nombre: '" + this.nombre + "', Marca: '"+this.marca +"', Modelo: '"+this.modelo + "', Color: '" + this.color + "', Mermoria: '" + this.memoriaInterna+"'" ;

	}
	
	
	
	
	
	
	
}
