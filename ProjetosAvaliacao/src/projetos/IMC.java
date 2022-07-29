package projetos;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double peso, altura, resultado;
		
		System.out.println("Calculador de IMC(índice de Massa Corpórea)");
		System.out.println("Digite o seu peso");
		peso = scanner.nextDouble();

		System.out.println("Digite a sua altura");
		altura = scanner.nextDouble();
		
		resultado = peso/(altura*altura);
		System.out.println("Seu IMC é: " + resultado);
	}

}
