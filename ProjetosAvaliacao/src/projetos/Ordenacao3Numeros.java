package projetos;

import java.util.Scanner;

public class Ordenacao3Numeros {

	public static void main(String[] args) {
		
		int n1, n2, n3, menor = 0, meio = 0, maior = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Algoritmo de ordenação de 3 números");
		System.out.println("Digite o primeiro número:");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro número:");
		n3 = sc.nextInt();
		
		if ((n1 < n2) && (n1 < n3)) {
			menor = n1;
			if(n2 < n3) {
				meio = n2;
		        maior = n3;
			}else {
				meio = n3;
		        maior = n2;
			}
		}
		
		if((n2 < n1) && (n2 < n3)) {
			menor = n2;
			if(n1 < n3) {
				meio = n1;
		      	maior = n3;
			}else {
				meio = n3;
		      	maior = n1;
			}
		}
		
		if((n3 < n1) && (n3 < n2)) {
			menor = n3;
			if(n1 < n2) {
				meio = n1;
		      	maior = n2;
			}else {
				meio = n2;
		      	maior = n1;
			}
		}
		
		System.out.println(menor + "," + meio + "," + maior);

	}

}
