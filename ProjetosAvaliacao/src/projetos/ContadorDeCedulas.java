package projetos;

import java.util.Scanner;

public class ContadorDeCedulas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valorSaque = 0;
		
	   // Quantidade de Notas = qn
	   int qn200, qn100, qn50, qn20, qn10 = 0, qn5 = 0, qn2, qn1;
	   
	   // Resto para dividir nas próximas Notas = rn
	   int rn200, rn100, rn50, rn20, rn10 = 0, rn5, rn2;
	   
	   System.out.println("Digite o valor para saque");
	   valorSaque = sc.nextInt();
	   
	   qn200 = (int) valorSaque / 200;
	   rn200 = valorSaque % 200;

	   qn100 = (int) rn200 / 100;
	   rn100 = rn200 % 100;

	   qn50 = (int) rn100 / 50;
	   rn50 = rn100 % 50;

	   qn20 = (int) rn50 / 20;
	   rn20 = rn50 % 20;

	   qn10 = (int) rn20 / 10;
	   rn10 = rn20 % 10;

	   qn5 = (int) rn10 / 5;
	   rn5 = rn10 % 5;
	   
	   qn2 = (int) rn5 / 2;
	   rn2 = rn5 % 2;
	   
	   qn1 = (int) rn2 / 1;
	   

	   System.out.println(qn200 + " x Cédulas de 200");
	   System.out.println(qn100 + " x Cédulas de 100");
	   System.out.println(qn50 + " x Cédulas de 50");
	   System.out.println(qn20 + " x Cédulas de 20");
	   System.out.println(qn10 + " x Cédulas de 10");
	   System.out.println(qn5 + " x Cédulas de 5");
	   System.out.println(qn2 + " x Cédulas de 2");
	   System.out.println(qn1 + " x Cédulas de 1");
		
	}

}
