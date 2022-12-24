package ejerciciosN7N8;


public class Arrays {
	
	public static void main(String[] args) {
	/*	1)Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
		2)Crea un array bidimensional de enteros y recórrelo, mostrando la posición y 
		el valor de cada elemento en ambas dimensiones.
		*/
		
		//1)creamos el array unidimensional con sus valores:
		String array[]= {"carlos","arturo","nicolas"};
		
		//recorremos el array con un for:
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//2)creamos el array bidimensional de enteros con su respectivo espacio:
		
		int enterosArray[][] = new int [2][5];
		
		//introducimos los valores: 
		
		//primera fila:
		enterosArray [0][0]=5; //primera columna
		enterosArray [0][1]=10;//segunda columna
		enterosArray [0][2]=15;//tercera columna
		enterosArray [0][3]=52;//cuarta columna
		enterosArray [0][4]=8;//quinta columna
		
		//segunda fila:
		enterosArray [1][0]=1;//primera columna
		enterosArray [1][1]=2;//segunda columna
		enterosArray [1][2]=3;//tercera columna
		enterosArray [1][3]=4;//cuarta columna
		enterosArray [1][4]=5;//quinta columna
		
		 /*otra manera de introducir valores que conocemso es:
		  
		 int enterosArray[][] = {
		 			{5,10,15,52,8},
		 			{1,2,3,4,5}
		 	};
		  */
		
		//recorremos el arry con un for:
		
		//for para las filas:
		for (int i = 0; i < enterosArray.length; i++) {
			System.out.println("fila:"+i);
			//for para las columnas:
			for (int j = 0; j < enterosArray[1].length; j++) {
				System.out.println("posicion i: "+ i +" ,posicion j="+j);
				System.out.println("valor:"+enterosArray[i][j]);
			}
		}
		
		
	}
}
