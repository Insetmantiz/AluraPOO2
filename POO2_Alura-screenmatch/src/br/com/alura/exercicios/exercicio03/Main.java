package br.com.alura.exercicios.exercicio03;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		
		// Crie um ArrayList de strings e utilize um loop foreach para percorrer e 
		// imprimir cada elemento da lista.
		
		ArrayList<String> strings = new ArrayList<>();
		strings.add("Oi");
		strings.add("como");
		strings.add("vai");
		strings.add("você");
		strings.add("?");
		
		for(String palavra : strings){
			System.out.println(palavra);
		}
		
		//Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, 
		//crie um objeto da classe Cachorro e faça o casting para a classe Animal.
		
		var dog = new Cachorro();
		Animal animal = (Animal)dog;
		
		// Crie uma classe Produto com propriedades como nome e preço. 
		//Em seguida, crie uma lista de produtos e utilize um loop para 
		//calcular e imprimir o preço médio dos produtos.
		
		var p1 = new Produto("Arroz",20.0);
		var p2 = new Produto("Feijão",15.0);
		var p3 = new Produto("Batata",25.0);
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		
		double soma = 0;
		double totalP = produtos.size();
		
		for (Produto p:produtos){
			soma = soma + p.getPreco();
		}
		
		double media = soma/totalP;
		
		for (Produto p:produtos){
			System.out.println(p.getNome()+"("+p.getPreco()+")");
		}
		
		System.out.println("Media de preços: " + media);
		
		
		//Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, 
		//por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface 
		//Forma) e utilize um loop para calcular e imprimir a área de cada forma.
		
		var forma1 = new Quadrado(2,2);
		var forma2 = new Circulo(20.0);
		var forma3 = new Quadrado(10,10);
		var forma4 = new Circulo (40.0);
		
		ArrayList<Forma> formas = new ArrayList<>();
		formas.add(forma1);
		formas.add(forma2);
		formas.add(forma3);
		formas.add(forma4);
		
		for(int i=0;i<formas.size();i++){
			formas.get(i).calcularArea();
		}
		
		//Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, 
		//crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e 
		//imprimir a conta com o maior saldo.
		
		var conta1 = new ContaBancaria(1,2000.0);
		var conta2 = new ContaBancaria(2,500.0);
		var conta3 = new ContaBancaria(3,1000.0);
		var conta4 = new ContaBancaria(4,4000.0);
		
		ArrayList<ContaBancaria> contas = new ArrayList<>();
		
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		
		double maior = 0;
		int nMaior;
		for (int i=0;i<contas.size();i++){
			if(contas.get(i).saldo>maior){
				maior = contas.get(i).saldo;
				nMaior = contas.get(i).numeroDaConta;
				System.out.println("No momento a conta "+nMaior+" tem o maior saldo\n com o valor de: " + maior);
			}	
		}
		
	}
}
