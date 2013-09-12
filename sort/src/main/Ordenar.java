package main;

public class Ordenar {

	/**
	 * Bubble sort
	 * */
	public void burbuja(int array[]){
		int aux;
		boolean cambios = false;
		
		while(true){
			cambios = false;
			for(int i=1;i<array.length;i++){
				if(array[i]<array[i-1]){
					aux = array[i];
					array[i] = array[i-1];
					array[i-1] = aux;
					cambios = true;
				}
			}
			if(cambios==false) break;
		}
	}
	/**
	 * insertion sort
	 */
	public void insercion(int array[]){
		int aux,i,j;
		
		for(i = 1;i < array.length;i++){
			aux = array[i];
			for(j = i-1;j>=0 && array[j]>aux;j--){
				array[j+1] = array[j];
				array[j] = aux;
			}
		}
	}
	/**
	 * quick sort
	 */
	public void ordenarQuicksort(int array[]){
		array = quicksort(array,0,array.length-1);
	}
	
	private int[] quicksort(int numeros[],int izq,int der){
		if(izq>=der) return numeros;
		
		int i=izq,d=der;
		if(izq!=der){
			int pivote,aux;
			pivote = izq;
			while(izq!=der){
				while(numeros[der]>=numeros[pivote] && izq<der) der--;
				while(numeros[izq]<numeros[pivote] && izq<der) izq++;
				if (der!=izq){
					aux = numeros[der];
					numeros[der] = numeros [izq];
					numeros[izq] = aux;
				}
				if(izq==der){
					quicksort(numeros, i, izq-1);
					quicksort(numeros, izq+1, d);
				}
			}
		}else return numeros;
		return numeros;
	}
}
