package prjListaVectores;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, pa = -1, npa = -1;
		a = new int [TAM];
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i+1) + "° valor:");
			a[i] = in.nextInt();
		}
		
		for (i = 0; i < TAM / 2; i++) {
		    if (a[i] != a[TAM - 1 - i]) {
		    	npa++;
		    }
		    else {
		    	pa++;
		    }
		}
		
		if (pa == -1) {
			System.out.println("O vetor A, não é um palíndromo");
		}
		else {
			System.out.println("O vetor A, é um palíndromo");
		}
		in.close();
	}
}



