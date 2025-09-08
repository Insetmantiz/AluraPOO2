package br.com.alura.exercicios.exercicio01;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		var pessoa1 = new Pessoa();
		var pessoa2 = new Pessoa();
		var pessoa3 = new Pessoa();
		
		pessoa1.setNome("João");
		pessoa1.setIdade(23);
		
		pessoa2.setNome("William");
		pessoa2.setIdade(10);
		
		pessoa3.setNome("Humberto");
		pessoa3.setIdade(8);
		
		ArrayList<Pessoa>  listaDePessoas = new ArrayList<>();
		listaDePessoas.add(pessoa1);
		listaDePessoas.add(pessoa2);
		listaDePessoas.add(pessoa3);
		
		System.out.println("Tamanho da lista: " + listaDePessoas.size());
		System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
		System.out.println("Lista Completa: \n" + listaDePessoas);
		
		
	}
}
