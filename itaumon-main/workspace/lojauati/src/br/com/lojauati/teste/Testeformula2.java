package br.com.lojauati.teste;

import javax.swing.JOptionPane;

import br.com.lojauati.modelo.Formula1;

public class Testeformula2 {

	public static void main(String[] args) {
		
		Formula1 objeto = new Formula1(); // instanciando (atribuindo um valor) um objeto
		objeto.preencherTudo("mclaren", (float) 1500000.50, 6000);
		System.out.println(objeto.exibirTudo());
		System.out.println(objeto.exibirPromocao());
		System.out.println(objeto.exibirPromocao(50));
	}
}
