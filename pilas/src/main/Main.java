package main;
import java.util.Stack;
public class Main {

	/**
	 * metodos de pilas
	 * push
	 * pop
	 * peek
	 * empty
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack pila = new Stack();
		pila.push(50);
		pila.push("hola");
		
		System.out.println("el ultimo elemento es: "+pila.peek()+"\ny todos: ");
		
		while(!pila.empty()){
			System.out.println(pila.pop());
		}
	}

}
