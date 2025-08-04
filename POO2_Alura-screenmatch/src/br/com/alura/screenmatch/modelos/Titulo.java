package br.com.alura.screenmatch.modelos;

public class Titulo {
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalAvaliacoes;
	private int duracaoEmMinutos;
	
	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}


	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}


	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}


	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}


	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}


	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	
	
	public int getTotalAvaliacoes(){
		return totalAvaliacoes;
	}

	//colocando o this. da pra fazer o exibeFichaTecnica() mostrar tudo que é relevante.
	public void exibeFichaTecnica(){
		System.out.println("Nome: "+nome);
		System.out.println("Ano de Lançamento: " + anoDeLancamento);
		System.out.println("Total de Avaliações: " + this.totalAvaliacoes);
		System.out.println("Média: " + this.pegaMedia());
	}
	
	public void avalia(double nota){
		somaDasAvaliacoes = somaDasAvaliacoes+nota;
		totalAvaliacoes++;
	}
	
	public double pegaMedia(){
		return somaDasAvaliacoes/totalAvaliacoes;
	}
}