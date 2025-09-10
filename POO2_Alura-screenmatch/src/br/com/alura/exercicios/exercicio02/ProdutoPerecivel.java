package br.com.alura.exercicios.exercicio02;

public class ProdutoPerecivel extends Produto {
	String dataValidade;
	
	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	
	
	public ProdutoPerecivel(String nome, double preco, int quantidade) {
		super(nome, preco, quantidade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		return "Produto: " + getNome() + " Preço: " + getPreco() + " Quantidade: " + getQuantidade() + " Data de Validade: " + dataValidade + "\n";
	}
	
}
