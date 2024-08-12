package view;
import controller.Ex3;

public class Main {

	public static void main(String[] args) {
		Ex3 m = new Ex3();
		int vet[] = {-12, -10, 3, 4, 6};
		int tamanho = vet.length;
		int par = 0;
		int resp3 = m.vetorpar(vet, tamanho, par);
		System.out.println(resp3);
		
	}

}
