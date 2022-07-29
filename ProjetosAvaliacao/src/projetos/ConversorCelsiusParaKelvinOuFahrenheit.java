package projetos;

import java.util.Scanner;

public class ConversorCelsiusParaKelvinOuFahrenheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcaoSelecionada;
		double grausCelsius, resultado;
		
		System.out.println("Programa conversor de temperaturas");
		System.out.println("Digite:");
		System.out.println("1 - Celsius para Kelvin");
		System.out.println("2 - Celsius para Fahrenheit");
		opcaoSelecionada = scanner.nextInt();
		
		System.out.println("Digite a temperatura para converter:");
		grausCelsius = scanner.nextDouble();
		
		if(opcaoSelecionada == 1) {
			resultado = grausCelsius + 273.15;
			System.out.println(resultado + " em graus Kelvin");
		}else {
			if(opcaoSelecionada == 2) {
				resultado = (grausCelsius * 9/5) + 32;
				System.out.println(resultado + " em graus Fahrenheit");
			}else {
				System.out.println("Digite 1 ou 2");
			}
		}
	}

}
