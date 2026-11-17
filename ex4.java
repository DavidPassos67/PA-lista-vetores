package prjListaVectores;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		final int TAM = 10;
		int a[], i, j;
		a = new int [TAM];
		Scanner in = new Scanner (System.in);
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite para descobrir quantos pares existem");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			j=0;
			System.out.println(" ");
			System.out.print("A[" + a[i] + "] = ");
			while(j <= a[i]) {
				System.out.print(j + ", ");
				j+=2;
			}
		}
		
		
		in.close();
	}

}