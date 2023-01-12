package multiprocesosII;

import java.io.File;
import java.io.IOException;

public class Ejecutar {
		  public static void main(String args[]) throws IOException {
		    ProcessBuilder pb = new ProcessBuilder("CMD","/C" ,"DIR");		   
		    
		    File fOut = new File("salida2.txt");
		    File fErr = new File("error.txt");
		 
		    pb.redirectOutput(fOut);
		    pb.redirectError(fErr); 
		    pb.start(); 
		  }
}
