package algoritmos.io;

public class A02_E04_Circuferencia {

	public static void main(String[] args) {
		//Faça um programa que receba o raio de uma circuferencia e calcule
		//seu cumprimento e a area
		
		int raio = 2;
		
		double comprimento = 2 * raio * Math.PI;
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println(comprimento);
		System.out.println(area);
		
	}

}
