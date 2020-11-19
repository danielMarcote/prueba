import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);
	//Ejercicio1_1
	public static char[] ejer1_1() {
		char toret[] = new char[25];
		for(int i = 0; i < toret.length; i++) {
			toret[i] = 'x';
		}
		return toret;
	}
	
	//Ejercicio1_2
	public static void ejer1_2() {
		float toret[] = new float[8];
		for(int i = 0; i < toret.length; i++) {
			toret[i] = 0.9f;
			System.out.print(toret[i]);
		}
	}
	
	//Ejercicio1_3
	public static void ejer1_3() {
		int toret[] = new int[4];
		for(int i = 0; i < toret.length; i++) {
			toret[i] = 10;
			System.out.print(toret[i]);
		}
	}
	
	//Ejercicio2_1
	public static void ejer2_1() {
		int toret[] = new int[20];
		for(int i = 0; i < toret.length; i++) {
			toret[i] = i;
			System.out.print(toret[i]);
		}
	}
	
	//Ejercicio2_2
	public static void ejer2_2() {
		int toret[] = new int [20];
		int j = 0;
		for(int i = 19; i >= 0; i--) {
			toret[j] = i;
			System.out.print(toret[j]);
			j++;
		}
	}
	
	//Ejercicio2_3
	public static void ejer2_3() {
		boolean aux[] = new boolean[20];
		for(int i = 0; i < aux.length; i++) {
			if(i % 2 == 0) aux[i] = false;
			else aux[i] = true;
			System.out.println( "Posición " + i  + ":" + aux[i]);
		}
	}
	
	//Ejercicio2_4
	public enum Calificacion {
		SOBRESALIENTE, NOTABLE, APROBADO, SUSPENSO, NO_PRESENTADO
	}
	
	public static void ejer2_4() {
		String notas[][] = {{"Matemáticas","Química","Lengua","Historia","Economía"},{null,null,null,null,null}};
		String aux;
		for(int i = 0; i < notas[0].length;i++) {
			do {
				System.out.println("Introduzca la calificación para: " + notas[0][i]+
					".\n1. Sobresaliente.\n"
					+ "2. Notable.\n"
					+ "3. Aprobado.\n"
					+ "4. Suspenso.\n"
					+ "5. No Presentado.");
				aux = scan.next();
				switch(aux) {
				case "1":
					notas[1][i] = "Sobresaliente";
					break;
				case "2":
					notas[1][i] = "Notable";
					break;
				case "3":
					notas[1][i] = "Aprobado";
					break;
				case "4":
					notas[1][i] = "Suspenso";
					break;
				case "5":
					notas[1][i] = "NP";
					break;
				default:
					System.out.println("Entrada incorrecta.");
				}
			}while(notas[1][i] == null );
		}	
		for(int i = 0; i < notas[0].length; i++) {
			for(int j = 0; j < notas.length; j++) {
				System.out.println(notas[j][i]);
			}
		}
	}
	
	//Ejercicio 3
	//Para enteros
	public static int[] ejer3(int [] array) {
		 int aux;
		 for(int i = 0; i < array.length/2;i++) {
			 aux = array[i];
			 array[i] = array[array.length - i - 1];
			 array[array.length - i - 1] = aux;
		 }
		return array;
	}
	
	//Para chars
	public static char[] ejer3(char [] array) {
		 char aux;
		 for(int i = 0; i < array.length/2;i++) {
			 aux = array[i];
			 array[i] = array[array.length - i - 1];
			 array[array.length - i - 1] = aux;
		 }
		return array;
	}
	
	//Ejercicio 4
	public static int aleatorio(int max) {
		double toret = Math.random()*max;
		return (int) toret;
	}
	
	public static void urna() {
		int [] bola = new int[80];
		int cont = 0;
		for(int i = 0; i < bola.length; i++) bola [i] = 0;
		do {
			bola[aleatorio(79)]++;
			cont++;
		} while(bola[33] < 3);
		for(int i = 0; i < bola.length; i++) {
			if(bola[i] != 0) System.out.println("Bola " + i + " = " + bola[i] );
			else System.out.println("Bola " + i + " = no ha salido.");
		}
		System.out.println("Total de bolas que salieron: " + cont);
	}
	
	//Ejercicio 5
	public static int posValorMax(int[] array) {
		int pos = 0;
		int max;
		if(array.length > 0) max = array[0];
		else return -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				pos = i;
			}
		}
		return pos;
	}
	
	//Ejercicio 6_1 
	public static int [][] ejer6_1(int [][] matrizEntrada) {
		int [][] matrizSalida;
		System.out.println("Introduzca el numero de filas/columnas para su"
				+ " matriz cuadrada.");
		int numFil = scan.nextInt();
		matrizSalida = new int[numFil][numFil];
		for(int i = 0; i < matrizSalida.length; i++) {
			for(int j = 0; j < matrizSalida[i].length; j++) {
				matrizSalida[i][j] = matrizEntrada[i][j];
			}
		}
		return matrizSalida;
	}
	
	//Ejercicio6_2 nos vale también para mostrar cualquier matriz de entrada
	public static void ejer6_2(int [][] mEntrada) {
		for(int i = 0; i < mEntrada.length; i++) {
			System.out.print("\n");
			for(int j = 0; j < mEntrada[i].length; j++) {
				System.out.print("[" + mEntrada[i][j] + "], ");
			}
		}
		System.out.print("\n");
	}
	//Ejercicio6_3 Version procedimiento
	public static void ejer6_3(int mEntrada[][]) {
		int mayor = mEntrada[0][0];
		int menor = mEntrada[0][0];
		for(int x = 0; x < mEntrada.length; x++) {
			for(int y = 0; y < mEntrada[x].length; y++) {
				if(mEntrada[x][y] > mayor) mayor = mEntrada[x][y];
				else if (mEntrada[x][y] < menor) menor = mEntrada[x][y];
			}
		}
		System.out.println("El mayor es : " + mayor + " y el menor es : " + menor);
	}
	
	//Version funcion
	public static int[] ejer6_3_func(int mEntrada[][]) {
		int mayor = mEntrada[0][0];
		int menor = mEntrada[0][0];
		int[] toret = new int[2];
		for(int x = 0; x < mEntrada.length; x++) {
			for(int y = 0; y < mEntrada[x].length; y++) {
				if(mEntrada[x][y] > mayor) mayor = mEntrada[x][y];
				else if (mEntrada[x][y] < menor) menor = mEntrada[x][y];
			}
		}
		toret[0] = mayor;
		toret[1] = menor;
		System.out.println("El mayor es : " + toret[0] + " y el menor es : " + toret[1]);
		return toret;
	}
	
	//Ejercicio 7
	public static int ejer7_1(int mat[][]) {
		int toret = 0;
		for(int i = 0; i < mat[0].length; i++) {
			toret += mat[0][i];
		}
		return toret;
	}
	
	//Version 7_1 seleccionando el día para el calculo de más ausencias
	public static int ejer7_1plus(int dia, int mat[][]) {
		int toret = 0;
		for(int i = 0; i < mat[dia].length; i++) {
			toret += mat[dia][i];
		}
		return toret;
	}
	
	//Ejercicio 7_2
	
	public static String diaMasAusencias(int m[][]) {
		int pos = 0, max = 0, aux = 0;
		for(int dia = 0; dia < 5; dia++) {
			aux = ejer7_1plus(dia, m);
			if(aux > max) {
				max = aux;
				pos = dia;
			}
		}
		switch(pos) {
		case 0: return "Lunes";
		case 1: return "Martes";
		case 2: return "Miércoles";
		case 3: return "Jueves";
		case 4: return "Viernes";
		default: return "ERROR";
		}
	}
	
	//Ejercicio 7_3
	//Funcion para calcular la media total de todos los departamentos en conjunto
	public static double mediaTotalSemanal(int matriz[][]) {
		double toret = 0.0;
		
		return toret;
	}
	
	//Funcion para calcular la media de ausencias por departamento
	public static double[] mediaPorDepartamento(int matriz[][]) {
		double toret[];
		
		return toret[];
	}
	
	public static void absentismoPorDepart(int matriz[][]) {
		
	}
	
	//Función aux para rellenar matrices
	public static int [][] relleno(int col, int fil, int maxValue) {
		int toret [][] = new int[col][fil];
		for(int i = 0; i < toret.length; i++) {
			for(int j = 0; j < toret[i].length; j++) {
				toret[i][j] = (int) (Math.random() * maxValue);
			}
		}
		return toret;
	}
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//Ejercicio1_1
//		System.out.println(ejer1_1());
//		//Ejercicio1_2
//		ejer1_2();
//		System.out.println();
//		//Ejercicio1_3
//		ejer1_3();
//		System.out.println();
//		//Ejercicio2_1
//		ejer2_1();
//		System.out.println();
//		//Ejercicio2_2
//		ejer2_2();
//		System.out.println();
//		//Ejercicio2_3
//		ejer2_3();
		//Ejercicio2_4
//		ejer2_4();
		//Ejercicio 3
//		int [] entrada = {1,34,6,8,11};
//		entrada = ejer3(entrada);
//		for (int i = 0; i < entrada.length; i++) System.out.print(entrada[i]+",");
//		System.out.println();
//		char [] entradaChar = {'a','b','c','d','e'};
//		System.out.print(ejer3(entradaChar));
//		System.out.println();
//		for (int i = 0; i < entradaChar.length; i++) System.out.print(entradaChar[i]+",");
		//Ejercicio 4
//		urna();
		//Ejercicio 5
//		int [] entrada = {1,34,6,8,11,123};
//		System.out.println(posValorMax(entrada));
		//Ejercicio 6
//		int matrizSesenta [][] = new int[60][60];
//		for(int i = 0; i < matrizSesenta.length; i++) {
//			for( int j = 0; j < matrizSesenta[i].length; j++) {
//				matrizSesenta[i][j] = (int) (Math.random() * 10);
//			}
//		}
//		int matrizPrueba[][] = ejer6_1(matrizSesenta);
//		ejer6_2(matrizPrueba);
//		ejer6_3(matrizPrueba);
		//Ejercicio 7
		int matriz[][] = relleno(5,10,10);
		ejer6_2(matriz);
		System.out.println(ejer7_1plus(0,matriz));
		System.out.println(ejer7_1plus(1,matriz));
		System.out.println(ejer7_1plus(2,matriz));
		System.out.println(ejer7_1plus(3,matriz));
		System.out.println(ejer7_1plus(4,matriz));
		System.out.println(diaMasAusencias(matriz));
		scan.close();
	}
}
