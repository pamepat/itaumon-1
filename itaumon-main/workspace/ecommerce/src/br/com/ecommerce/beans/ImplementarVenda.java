package br.com.ecommerce.beans;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class ImplementarVenda {
	public static void main(String[] args) {
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		Produto produto = new Produto();

		//faz a amarra��o(liga��o)
		cliente.setEndereco(endereco);
		venda.setProduto(produto);
		venda.setCliente(cliente);
		// fim da amarra��o

		endereco.setBairro(Magica.s("Bairro"));
		endereco.setLogradouro(Magica.s("Logradouro"));
		endereco.setCep(Magica.s("CEP"));

		//preencheria todos de endereco
		cliente.setId(Magica.i("ID"));
		cliente.setNome(Magica.s("Nome"));
		produto.setDescricao("CHURROS");
		produto.setQtde(Magica.i("Qtde"));
		produto.setValorVenda(Magica.f("Valor Venda"));

		// preencheria todos de produto
		venda.setTotal(150);
		venda.setData("02/10/2020");
		venda.setNotafiscal(15);
		System.out.println(venda.getAll());

	}

}
