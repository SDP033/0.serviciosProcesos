package multiprocesosII;

import java.util.Scanner; //<-- Importamos java.util.Scanner

public class Humbe {

	public static void main(String[] args) {

//Objeto scanner para introducir valores por teclado a la consola

		Scanner sc = new Scanner(System.in);

//Variables String para comparar con las cadenas validas

		System.out.println("Introduce el carater a validar --> ");
		String n = "N";
		String s = "S";
		String punto = ".";

//String que introduces por teclado

		String letra = sc.nextLine();

//Bucle if con metodos que comparan cadenas si es 0 = true

		if (letra.compareToIgnoreCase(s) == 0 || letra.compareToIgnoreCase(n) == 0
				|| letra.compareToIgnoreCase(punto) == 0) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		sc.close(); // Cerramos el Scanner
	}

}
