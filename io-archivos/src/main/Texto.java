package main;
import java.io.*;

public class Texto {

	public void leer(String nombreArchivo){
		try{
			FileReader r = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(r);
			
			String temp= "";
			while(temp!=null){
				temp = buffer.readLine();
				if(temp==null) break;
				System.out.println(temp);	
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public void escribir(String nombreArchivo){
		File f;
		f= new File(nombreArchivo);
		
		//escritura
		try{
			FileWriter w = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);		
			
			wr.write("esto es una linea de texto");
			wr.append("- esto es una concatenacion de texto");
			wr.close();
			bw.close();
		}catch(IOException e){}
	}
}
