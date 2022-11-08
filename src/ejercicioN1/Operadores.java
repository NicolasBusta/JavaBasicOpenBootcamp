package ejercicioN1;

public class Operadores {
	public static void main(String[] args) {
		
		//operadores aritmeticos(+,-,*,/,%):
		
		int numero1 = 18;
		int numero2 = 5;
		
		System.out.println(numero1+numero2);
		System.out.println(numero1-numero2);
		System.out.println(numero1*numero2);
		System.out.println(numero1/numero2);
		System.out.println(numero1%numero2);
		
		/*
        operadores de comparación:
        > mayor que
        < menor que
        >= mayor igual que
        <= menor igual que
        == igual que
        === IMPORTANTE: EN JAVA NO EXISTE!!!!
         */
		boolean resultadoT = numero1 > numero2;
		boolean resultadoF = numero1 < numero2;
		boolean resultadoI = numero1==numero2;
		System.out.println(resultadoT);
		System.out.println(resultadoF);
		System.out.println(resultadoI);
		
		/*
        operadores Lógicos:
        and &&
        or ||
         */
		int edad = 30;
	
		boolean resultadoMayorEdad = edad >= 18 && edad <=60 ;
		boolean resultadoAnciano = edad >=50 || edad >90;
		
		System.out.println("es usted mayor de edad:"+resultadoMayorEdad);
		System.out.println("es usted un anciano:"+resultadoAnciano);
		
		// operadores de
        // incremento ++
        // decremento --
		
		System.out.println(++edad);
		
	}

}
