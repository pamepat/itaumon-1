package variaveis;

import javax.swing.JOptionPane;

public class Variavel {
    // Valiavel e um espaco temporario na memoria RAM onde
	// voce armazena UM dado.
	public static void main(String[] args) {
	    // Sintaxe para criar variaveis
		// <tipo dado>  <nome da variavel>
		// numerico: dado utilizado em operacao matematica (hexa tem letra) e/ou dado critico
		// para consulta pois com numero a busca e muita mais rapida (13 combinacoes apenas -
		// 0 a 9 . , -
		// alfanumerico: nao e utilizado para operacao matematica (cep: 05573-900)
		// CEP (contexto de aplicacao que nao tem CEP como pesquisa principal)
		// . casa decimal e , casa de milhares (padrao americano)
		// + em Java e a concatenacao
		// JOptionPane.Metodo - Classe com telas prontas para input/output
		String nome="";
		int idade = 0;  // tipo numerico inteiro primitivo (faz parte da JVM)
		double altura = 0; // tipo numerico real primitivo (faz parte da JVM)
		double peso = 0; // tipo numerico real primitivo (faz parte da JVM)
				
		/*
		 * Para converter (parse) uma string para um tipo primitivo, utilizamos
		 * as classes "Wrapper's" conforme o tipo primitivo
		 * Integer para int
		 * Double  para double
		 * Float para float
		 * Short para short ( e assim sucessivamente )
		 */
		
		nome = JOptionPane.showInputDialog("Nome: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
		
		double imc = peso / (altura * altura);
		System.out.print(nome);
		System.out.print(idade);
		System.out.println(altura);
		
		System.out.println("Nome..: " + nome);
		System.out.println("Idade.: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso..: " + peso);
		System.out.println("imc...: " + imc);
	}

}
