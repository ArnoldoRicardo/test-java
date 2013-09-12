package main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread hilo = new Proceso("proceso 1");
		Thread hilo2 = new Proceso("proceso 2");
		
		hilo.start();
		hilo2.start();
	}

}
