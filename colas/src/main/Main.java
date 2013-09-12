package main;
import java.util.LinkedList;

public class Main {

	/**
	 * offer
	 * poll
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList cola = new LinkedList();
		
		for(int i=0;i<10;i++) cola.offer(i);
		
		while(cola.peek()!=null){
			System.out.println(cola.poll());
		}
	}

}
