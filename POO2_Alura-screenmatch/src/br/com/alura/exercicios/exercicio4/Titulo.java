package br.com.alura.exercicios.exercicio4;

public class Titulo implements Comparable<Titulo>{
	String nome;
	
	public Titulo (String nome){
		this.nome=nome;
	}

	@Override
	public int compareTo(Titulo o) {
		return this.nome.compareTo(o.nome);
	}
	
	@Override
	public String toString(){
		return nome;
		
	}

	
}
