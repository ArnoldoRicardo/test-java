package main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo[] = {5,3,4,2,5,7,4,6,44,4,6,5,6,7,4,3,4,6,3};
		
		Ordenar o = new Ordenar();
		o.ordenarQuicksort(arreglo);
		
		for(int i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);
		}
	}

}
