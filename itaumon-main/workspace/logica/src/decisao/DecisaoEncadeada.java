package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		// Decisao em cima de mais dados 
		String nome = JOptionPane.showInputDialog("Nome do Aluno: ");
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas: "));
		if (faltas>20) {
			System.out.println(nome + " reprovado por faltas (" + faltas + ")");
		}else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2: "));
			float media = (nota1 + nota2) / 2;
			System.out.println("Aluno: " + nome + " sua media foi " + media);

			if (media>=6) {
				System.out.println("Parabens " + nome + " voce esta aprovado");
			}else if (media<4) {
				System.out.println("Infelizmente " + nome + " voce foi reprovado");
			}else {
				System.out.println(nome + " voce ainda tem chance no exame.");
			} // fecha o ultimo else
		} // fecha o 1o else
	} // fecha o metodo main

} // fecha a classe
