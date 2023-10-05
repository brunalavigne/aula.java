package algoritmos.io;

import javax.swing.JOptionPane;

public class A02_Entrada_GUI {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura"));
		char tipoSanguineo = JOptionPane.showInputDialog(null, "Digite seu tipo sanguineo").charAt(0);
		char fatorRH = JOptionPane.showInputDialog(null, "Digite seu fator RH").charAt(0);

		JOptionPane.showInputDialog(null, "Olá " + name + "\nidade: " + idade + " anos" + "\naltura: " + altura
				+ "\npeso" + peso + "\ntipo sanguíneo: " + tipoSanguineo + fatorRH);

	}

}
