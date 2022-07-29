package projetos;

import java.util.Scanner;

public class IMCClassificado {

	public static void main(String[] args) {

		double peso, altura, resultado;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculador de IMC(índice de Massa Corpórea)");
		System.out.println("Digite o seu peso");
		peso = scanner.nextDouble();
		System.out.println("Digite a sua altura");
		altura = scanner.nextDouble();
		resultado = peso / (altura * altura);
		System.out.println("Seu IMC é: " + resultado);

		if (resultado <= 18.5) {
			System.out.println("Abaixo do peso");
		} else {
			if ((resultado > 18.5) && (resultado <= 24.9)) {
				System.out.println("peso normal");
			} else {
				if ((resultado > 25) && (resultado <= 29.9)) {
					System.out.println("sobrepeso");
				} else {
					if ((resultado > 30) && (resultado <= 34.9)) {
						System.out.println("obesidade grau 1");
					} else {
						if ((resultado >= 35) && (resultado <= 39.9)) {
							System.out.println("obesidade grau 2");
						} else {
							System.out.println("obesidade grau 3");
						}
					}
				}
			}
		}

	}

}
