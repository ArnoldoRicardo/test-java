package main;
import java.util.LinkedList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lista = new LinkedList();
		
		lista.add("hola");
		lista.add(5);
		lista.add(1,17);
		lista.addLast("palabra");
		
		lista.removeFirst();
		
		System.out.println("el tamaño de la lista es: "+ lista.size());
		for(int i=0;i<lista.size();i++){
			System.out.println(lista.get(i));
		}
	}

}
