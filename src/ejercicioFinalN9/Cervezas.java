package ejercicioFinalN9;



//Se realiza la calse por vender, en este caso la cerveza:

public class Cervezas {

		private static int nuevoID = 1; //Para obtener id's únicos, de 1 en adelante
	
	//Atributos generales:
		
		private int id;
		public String nombre;
		public int precio;
		public String marca;
		public String tipo;
		
		
		//Constructor vacio:
		
				public Cervezas(){
					
				}

		//Constructor con los atributos:
				
		public Cervezas(String nombre, int precio, String marca, String tipo) {
			
			asignaID();
			this.nombre = nombre;
			this.precio = precio;
			this.marca = marca;
			this.tipo = tipo;
			
			}
		
		public void asignaID() {
			id = nuevoID++; //Se asigna nuevoID actual y se incrementa para que proximo producto su ID sea distinto
		}
		
		
		//Getters y Setters:
		
		public int getId() {
			return id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		//para pasar todo a String:
		@Override
		public String toString() {
			return "Cervezas [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + ", tipo="
					+ tipo + "]";
		}
		
		@Override
		public boolean equals(Object objeto) {
			if (objeto instanceof Cervezas) {
				Cervezas otroProducto = (Cervezas) objeto;
				return id == otroProducto.id; //Dos productos son iguales sin tiene el mismo ID
			}
			else
				return false;
		}

	
					
}
