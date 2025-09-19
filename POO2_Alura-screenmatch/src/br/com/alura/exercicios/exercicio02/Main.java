package br.com.alura.exercicios.exercicio02;

import java.util.ArrayList;

public class Main {
	public static void main (String args[]){
		ArrayList<Produto> listaDeProdutos = new ArrayList<>(); 
		var prod1 = new Produto("Controle de Videogame",210.00,2);
		var prod2 = new Produto("Headset",200.00,1);
		var prod3 = new Produto("Cadeira de Escritório",450.00,1);
		
		listaDeProdutos.add(prod1);
		listaDeProdutos.add(prod2);
		listaDeProdutos.add(prod3);
		
		System.out.println(listaDeProdutos);
		System.out.println("Primeiro produto: "+listaDeProdutos.get(0));
		
		var prodP1 = new ProdutoPerecivel("Lasanha",20.00,1);
		prodP1.setDataValidade("10/09/2025");
		System.out.println(prodP1);
		
		listaDeProdutos.add(prodP1);
		
		for(Produto produto:listaDeProdutos){
			if(produto instanceof ProdutoPerecivel) {
				ProdutoPerecivel pp = (ProdutoPerecivel) produto;
				System.out.println(produto + " é perecivel");
			}else {
				System.out.println(produto + " não é perecível");
			}
		}
	}
}
