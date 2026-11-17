package prjListaVectores;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		final int TAM=15;
		int i, a[], b[], j=1, fat = 0;
		a = new int [TAM];
		b = new int [TAM];
		Scanner in = new Scanner(System.in);
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i + 1)+ "° valor para descobrir o fatorial");
			a[i] = in.nextInt();
			
			j = a[i];
			fat = 1;
			while(j>1) {
				fat = fat * j;
				j--;
			}
			
			b[i] = fat;
		}
		
		
		System.out.print("\n A = [");
		for(i = 0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
		System.out.print("\n B = [");
		for(i = 0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		
		
		in.close();
	}

}

