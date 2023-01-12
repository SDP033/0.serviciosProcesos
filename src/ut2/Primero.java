package ut2;

import java.util.Scanner;
import java.io.*;

public class Primero {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		String web = " ";
		System.out.println("Escribe la pagina que quieres abrir");
		web = sc.nextLine();
		ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe", web);

		Process p = null;
		p = pb.start();

	}

}
