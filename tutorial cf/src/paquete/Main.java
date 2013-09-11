package paquete;
import java.io.*;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hola mundo
		System.out.println("hola mundo");
		
		//lo mas sercano a tipado dinamico
		Object x[] = {1,2.5,4,3,"hola"};
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		
		//try catch
		String texto = "";
		int a = 0;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		
		try{
			texto = buffer.readLine();
			a = Integer.parseInt(texto);
		}catch(Exception e){
			System.out.println("debes escribir un numero");
		};
		
		System.out.println("tu numero por 2 es: "+a*2);
	}

}
