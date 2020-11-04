import java.util.Scanner;
public class Main {


	public static String nick, pass;
	public static Scanner scan = new Scanner(System.in);
	
	//Ejercicio 8
	public static boolean registro() {
		String passRepeat;
		System.out.println("Introduzca su nickname:");
		nick = scan.next();
		System.out.println("Introduzca una contraseña:");
		pass = scan.next();
		System.out.println("Repita la contraseña:");
		passRepeat = scan.next();
		if(pass.equals(passRepeat)) {
			return true;
		}
		System.out.println("Las contraseñas no coinciden.");
		return false;
	}

	
	public static boolean registroSinVar() {
		System.out.println("Introduzca su nickname:");
		nick = scan.next();
		System.out.println("Introduzca una contraseña:");
		pass = scan.next();
		System.out.println("Repita la contraseña:");
		if(pass.equals(scan.next())) {
			return true;
		}
		System.out.println("Las contraseñas no coinciden.");
		return false;
	}
	
	public static boolean login() {
		String nickLocal, passLocal;
		System.out.println("Introduzca su username:");
		nickLocal = scan.next();
		if(!nick.equals(nickLocal)){
			System.out.println("Usuario no encontrado.");
			return false;
		}
		System.out.println("Introduzca una contraseña.");
		passLocal = scan.next();
		if(!pass.equals(passLocal)) {
			System.out.println("Contraseña incorrecta.");
			return false;
		}
		return true;
	}
	
	public static boolean loginSinVar() {
		System.out.println("Introduzca su username:");
		if(!nick.equals(scan.next())){
			System.out.println("Usuario no encontrado.");
			return false;
		}
		System.out.println("Introduzca una contraseña.");
		if(!pass.equals(scan.next())) {
			System.out.println("Contraseña incorrecta.");
			return false;
		}
		return true;
	}
	
	public static void ejer8() {
		while(!registro());
		while(!login());
	}
	
	//Ejercicio 9
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int resta(int a, int b) {
		return a - b;
	}
	public static int product(int a, int b) {
		return a * b;
	}
	public static int divide(int a, int b) {
		if(b == 0) {
			System.out.println("No se puede dividir entre 0 que dice Siri que el monstuo de las galletas se pone triste.");
			return 0;
		}
		return a / b;
	}
	public static int resto(int a, int b) {
		return a % b;
	}
	public static int parseo(String x) {
		int a;
		if(x.length() > 1) {
			x = x.toLowerCase();
			switch(x) {
			case "cero":
				x = "0";
				a = Integer.parseInt(x);
				break;
			case "uno":
				x = "1";
				a = Integer.parseInt(x);
				break;
			case "dos":
				x = "2";
				a = Integer.parseInt(x);
				break;
			case "tres":
				x = "3";
				a = Integer.parseInt(x);
				break;
			case "cuatro":
				x = "4";
				a = Integer.parseInt(x);
				break;
			case "cinco":
				x = "5";
				a = Integer.parseInt(x);
				break;
			case "seis":
				x = "6";
				a = Integer.parseInt(x);
				break;
			case "siete":
				x = "7";
				a = Integer.parseInt(x);
				break;
			case "ocho":
				x = "8";
				a = Integer.parseInt(x);
				break;
			case "nueve":
				x = "9";
				a = Integer.parseInt(x);
				break;
			default:
				System.out.println("ERROR: entrada incorrecta.");
				return -1;
			}
		} else {
			a = Integer.parseInt(x);
		}
		return a;
	}
	
	public static boolean ejer9() {
		System.out.println("Introduzca el primer número: ");
		String x = scan.next();
		System.out.println("Introduzca el segundo número: ");
		String y = scan.next();
		String op;
		int a  = parseo(x);
		if(a == -1) return false;
		int b  = parseo(y);
		if(b == -1) return false;
		System.out.println("Introduzca la operacion a realizar: \n"
				+ "(+, -, *, /, %.)");
		op = scan.next();
		
		switch(op) {
		case "+":
			System.out.println("El resultado de la suma de " + a + 
					" y " + b + " es: " + sum(a,b));
			break;
		case "-":
			System.out.println("El resultado de la resta de " + a + 
					" y " + b + " es: " + resta(a,b));
			break;
		case "*":
			System.out.println("El resultado de la multiplicación de " + a + 
					" y " + b + " es: " + product(a,b));
			break;
		case "/":
			System.out.println("El resultado de la división de " + a + 
					" y " + b + " es: " + divide(a,b));
			break;
		case "%":
			System.out.println("El resultado del resto de " + a + 
					" y " + b + " es: " + resto(a,b));
			break;
		default:
			System.out.println("ERROR: Entrada incorrecta.");
			return false;
		}		
		return true;
	}
	
	public static boolean ejer9Param(String x, String y) {
		String op;
		int a  = parseo(x);
		if(a == -1) return false;
		int b  = parseo(y);
		if(b == -1) return false;
		System.out.println("Introduzca la operacion a realizar: \n"
				+ "(+, -, *, /, %.");
		op = scan.next();
		
		switch(op) {
		case "+":
			System.out.println("El resultado de la suma de " + a + 
					" y " + b + " es: " + sum(a,b));
			break;
		case "-":
			System.out.println("El resultado de la resta de " + a + 
					" y " + b + " es: " + resta(a,b));
			break;
		case "*":
			System.out.println("El resultado de la multiplicación de " + a + 
					" y " + b + " es: " + product(a,b));
			break;
		case "/":
			System.out.println("El resultado de la división de " + a + 
					" y " + b + " es: " + divide(a,b));
			break;
		case "%":
			System.out.println("El resultado del resto de " + a + 
					" y " + b + " es: " + resto(a,b));
			break;
		default:
			System.out.println("ERROR: Entrada incorrecta.");
			return false;
		}		
		return true;
	}
	
	//Ejercicio 10
	public static double cuadradoPer(double lado) {
		return lado*4.0;
	}
	
	public static double cuadradoArea(double lado) {
		return lado*lado;
	}
	
	public static double rectanguloPer(double base, double alt) {
		return (2.0 * base) + (2.0 * alt);
	}
	
	public static double rectanguloArea(double base, double alt) {
		return base * alt;
	}
	
	public static double circunferenciaPer(double radio) {
		return 2 * Math.PI * radio;
	}
	
	public static double circunferenciaArea(double radio) {
		return Math.PI * radio * radio; //return Math.PI * Math.pow(radio, 2);
	}
	
	public static double trianguloEqPer(double lado) {
		return lado * 3;
	}
	
	public static double trianguloEqArea(double base, double alt) {
		return (base * alt) / 2;
	}
	
	public static void main(String[] args) {
		//Ejercicio 8
//		ejer8();
		//Ejercicio 9
//		while(!ejer9());
//		boolean toret = false;
//		do {
//			System.out.println("Introduzca el primer número: ");
//			String x = scan.next();
//			System.out.println("Introduzca el segundo número: ");
//			String y = scan.next();
//			toret = ejer9Param(x,y);
//		} while(!toret);
		
		//Ejercicio 10
		System.out.println("Perimetro cuadrado: " + cuadradoPer(3.0));
		System.out.println("Area cuadrado: " + cuadradoArea(3.0));
		System.out.println("Perimetro rectangulo: " + rectanguloPer(2.5, 3.0));
		System.out.println("Area rectangulo: " + rectanguloArea(2.5,3.0));
		System.out.println("Perimetro circunferencia: " + circunferenciaPer(3.0));
		System.out.println("Area circunferencia: " + circunferenciaArea(3.0));
		System.out.println("Perimetro triangulo Eq: " + trianguloEqPer(3.0));
		System.out.println("Area triangulo Eq: " + trianguloEqArea(2.5,3.0));
	
	}
}
