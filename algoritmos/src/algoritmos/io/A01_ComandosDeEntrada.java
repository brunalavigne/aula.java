package algoritmos.io;

import java.util.Scanner;

public class A01_ComandosDeEntrada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("digite seu nome");
		String nome = leitor.next();

		System.out.println("digite sua idade");
		int idade = leitor.nextInt();

		System.out.println("digite sua altura");
		double altura = leitor.nextDouble();

		System.out.println("digite seu peso");
		double peso = leitor.nextDouble();

		System.out.println("é doador?");
		boolean ehDoadorDeSangue = leitor.nextBoolean();

		System.out.println("digite seu tipo sanguineo");
		char tipoSanguineo = leitor.next().charAt(0);

		System.out.println("digite seu tipo fatorRh");
		char fatorRh = leitor.next().charAt(0);

		System.out.println("O nome digitado foi:" + nome);
		System.out.println("O nome digitado foi:" + idade);
		System.out.println("O nome digitado foi:" + altura);
		System.out.println("O nome digitado foi:" + peso);
		System.out.println("O nome digitado foi:" + ehDoadorDeSangue);
		System.out.print("O nome digitado foi:" + tipoSanguineo);
		System.out.println(fatorRh);

		leitor.close();
	}

}
