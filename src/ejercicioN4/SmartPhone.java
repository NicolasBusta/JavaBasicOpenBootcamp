package ejercicioN4;

//Clase Hija1:

public class SmartPhone extends SmartDevice {
	//Atributos:
	
	String procesador;
	String sistemaOperativo;
	double camaraPrincipal;
	double camaraTrasera;
	int memoriaRam;
	
	//Constructor vacio:
	
		public SmartPhone(){
		
		}
	//Constructor con los atributos:
		
		public SmartPhone(int idDispositivoP,String nombreDispositivoP,String marcaDispositivoP,String modeloDispositivoP,String colorDispositivoP,double memoriaDispositivoP,String procesadorSmartPhone,String sistemaOperativoSmartPhone,double camaraPrincipalSmartPhone,double camaraTraseraSmartPhone,int memoriaRamSmartPhone){
			
			id = idDispositivoP;
			nombre = nombreDispositivoP;
			marca = marcaDispositivoP;
			modelo = modeloDispositivoP;
			color = colorDispositivoP;
			memoriaInterna = memoriaDispositivoP;
			procesador = procesadorSmartPhone;
			sistemaOperativo = sistemaOperativoSmartPhone;
			camaraPrincipal = camaraPrincipalSmartPhone;
			camaraTrasera = camaraTraseraSmartPhone;
			memoriaRam = memoriaRamSmartPhone;
		}

		//Getters y Setters:
		
		public String getProcesador() {
			return procesador;
		}

		public void setProcesador(String procesador) {
			this.procesador = procesador;
		}

		public String getSistemaOperativo() {
			return sistemaOperativo;
		}

		public void setSistemaOperativo(String sistemaOperativo) {
			this.sistemaOperativo = sistemaOperativo;
		}

		public double getCamaraPrincipal() {
			return camaraPrincipal;
		}

		public void setCamaraPrincipal(double camaraPrincipal) {
			this.camaraPrincipal = camaraPrincipal;
		}

		public double getCamaraTrasera() {
			return camaraTrasera;
		}

		public void setCamaraTrasera(double camaraTrasera) {
			this.camaraTrasera = camaraTrasera;
		}

		public int getMemoriaRam() {
			return memoriaRam;
		}

		public void setMemoriaRam(int memoriaRam) {
			this.memoriaRam = memoriaRam;
		}

		//se hace un metodo para traer todos los atributos de la clase en un String:
		
		@Override
		public String toString() {
			return "SmartPhone [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo
					+ ", color=" + color + ", memoriaInterna=" + memoriaInterna + ", procesador=" + procesador
					+ ", sistemaOperativo=" + sistemaOperativo + ", camaraPrincipal=" + camaraPrincipal
					+ ", camaraTrasera=" + camaraTrasera + ", memoriaRam=" + memoriaRam + "]";
		}

		

		
	
	
		
		
}
