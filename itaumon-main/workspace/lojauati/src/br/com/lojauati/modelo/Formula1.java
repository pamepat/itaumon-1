package br.com.lojauati.modelo;

public class Formula1 {
	// sintaxe para criacao de metodos no java
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do param>) {...} 
	// modificadores do diagrama UML -> private sinal de menos e assim por diante
	
	private String escuderia;
	private float valor;
	private int rpm;

	public float exibirPromocao(float porc) {
		return valor - valor * (porc/100);
	}
	
	public float exibirPromocao() {
		return valor * (float) 0.9;
	}
	
	public String exibirTudo() {
		return escuderia + "\n" + valor + "\n" + rpm;
	}
	
	public void preencherTudo(String p1, float p2, int p3) {
		escuderia=p1;
		valor=p2;
		rpm=p3;
	}
		
	// criar metodo para preencher todos os atributos - preencherTudo()
	// criar metodo para exibir todos os atributos - exibirTudo()
	// criar metodo para exibir o valor com 10% de desconto - exibirPromocao()
	// criar metodo para exibir o valor com um desconto recebido por parm - exibirPromocao()

	public int exibirRpm() {
		return rpm;
	}
	public float exibirValor() {
		return valor;
	}
	public String exibirEscuderia() {
		return escuderia;
	}

	public void preencherEscuderia(String parametro) {
		escuderia = parametro.toUpperCase();
	}
	public void preencherValor(float parametro) {
		if (parametro>0); {
			valor=parametro;
		}
	}
	public void preencherRpm(int parametro) {
		rpm=parametro;
	}
}
