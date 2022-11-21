package ejercicioN4;


//Clse Main:

public class Main {
	
	public static void main(String[] args) {

	/**
	* En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
	Agregaréis atributos tal cual tendrían esos objetos en la realidad.
	Crear constructor vacío y con todos los parámetros para cada clase.
	Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
	*/
		
		//Se crea nuevo dispositivo:
		SmartDevice smartDeviceHome = new SmartDevice(1, "Xiaomi Reproductor Multimedia", "Xiaomi", "Mi TV Box S 4K", "Negro", 64);
		
		//Se imprimen todos los atributos usando el metodo ToString:
		System.out.println(smartDeviceHome);
		
		//Forma de imprimirlos individualmente:
		
		System.out.println("Nombre:"+smartDeviceHome.getNombre());
		System.out.println("Marca:"+smartDeviceHome.getMarca());
		System.out.println("Modelo:"+smartDeviceHome.getModelo());
		System.out.println("Color:"+smartDeviceHome.getColor());
		System.out.println("Memoria:"+smartDeviceHome.getMemoria());
		
		//Se crea un nuevo dispositivo de la clase hija1:
		
		SmartPhone smartPhoneSamsung = new SmartPhone(2, "Samsung Galaxy", "Samsung", "A 22", "gris", 128,"MediaTek MT6833 Dimensity 700","Android 11",48,8, 4);

		//Se imprimen todos los atributos usando el metodo ToString:
		System.out.println(smartPhoneSamsung);
		
		//Forma de imprimirlos individualmente:
		System.out.println("Nombre:"+smartPhoneSamsung.getNombre());
		System.out.println("Marca:"+smartPhoneSamsung.getMarca());
		System.out.println("Modelo:"+smartPhoneSamsung.getModelo());
		System.out.println("Color:"+smartPhoneSamsung.getColor());
		System.out.println("Memoria:"+smartPhoneSamsung.getMemoria());
		System.out.println("Procesador:"+smartPhoneSamsung.getProcesador());
		System.out.println("Sistema Operativo:"+smartPhoneSamsung.getSistemaOperativo());
		System.out.println("Camara Principal:"+smartPhoneSamsung.getCamaraPrincipal());
		System.out.println("Camara Trasera:"+smartPhoneSamsung.getCamaraTrasera());
		System.out.println("Memoria Ram:"+smartPhoneSamsung.getMemoriaRam());
		
		//Se crea un nuevo dispositivo de la clase hija2:
		
		SmartWatch SmartWatchSamsung = new SmartWatch(3, "Samsung Galaxy Watch5", "Samsung", "Watch5 (Bluetooth)", "Negro", 7.5,true,"44");
		
		//Se imprimen todos los atributos usando el metodo ToString:
		System.out.println(SmartWatchSamsung);
		
		//Forma de imprimirlos individualmente:
		System.out.println("Nombre:"+SmartWatchSamsung.getNombre());
		System.out.println("Marca:"+SmartWatchSamsung.getMarca());
		System.out.println("Modelo:"+SmartWatchSamsung.getModelo());
		System.out.println("Color:"+SmartWatchSamsung.getColor());
		System.out.println("Memoria:"+SmartWatchSamsung.getMemoria());
		System.out.println("Resistente al Agua:"+SmartWatchSamsung.resistenteAlAgua);
		System.out.println("Tamaño de pantalla:"+SmartWatchSamsung.getTamañoDePantalla());
	}
}
