package algoritmos.io;

public class A01_Variaveis {

	public static void main(String[] args) {

		// Constante

		final String NOME = "Bruna";
		final String PRIMEIRO_NOME = "Bruna";

		// Variaveis

		String nome = "Bruna";
		int idade = 27;
		float altura = 1.63f;
		double peso = 65;
		boolean ehDoadorDeSangue = true;
		char tipoSanguineo = 'O';
		char fatorRh = '-';

		System.out.println("nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("altura: " + altura);
		System.out.println("peso: " + peso);
		System.out.println("doador de sangue: " + ehDoadorDeSangue);
		System.out.print("tipo sanguineo: " + tipoSanguineo);
		System.out.println(fatorRh);

		System.out.printf("nome: %s\n"
				+ "idade: %d\n"
				+ "altura: %.2f\n"
				+ "peso: %.2f\n"
				+ "doador de sangue: %b\n"
				+ "tipo sanguíneo: %c%c"
				,nome,idade,altura,peso,ehDoadorDeSangue,tipoSanguineo,fatorRh);

	}
}
