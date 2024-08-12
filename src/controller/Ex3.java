package controller;

public class Ex3 {
	public Ex3() {
		
	}

	public int vetorpar(int[] vet, int tamanho, int par) {
		
		if(tamanho == 0) {
			return par;
		}
		if(vet[tamanho - 1] % 2 == 0) {
			par++;
		} 
		return vetorpar(vet, tamanho - 1, par);
				
	}

}
