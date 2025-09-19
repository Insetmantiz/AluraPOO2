package br.com.alura.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String args[]){
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(24);
		numeros.add(12);
		numeros.add(50);
		numeros.add(45);
		numeros.add(33);
		
		System.out.println("Pré sort: "+ numeros);
		
		Collections.sort(numeros);
		System.out.println("Pós sort: "+numeros);
		
		var titulo2 = new Titulo("Revolução dos bichos");
		var titulo3 = new Titulo("Marvel: Guerra Civil");
		var titulo1 = new Titulo("A menina que roubava livros");
		
		ArrayList<Titulo> titulos = new ArrayList<>();
		
		titulos.add(titulo2);
		titulos.add(titulo3);
		titulos.add(titulo1);
		
		System.out.println("Pré sort: "+ titulos);
		Collections.sort(titulos);
		System.out.println("Pós sort: "+titulos);
		
		List<String> listaPolimorfica;
		//List<String> listaLinked = new LinkedList<>();
		
		listaPolimorfica = new ArrayList<>();
		listaPolimorfica.add("Array1");
		listaPolimorfica.add("Array2");
		listaPolimorfica.add("Array3");
		System.out.println("Elementos da lista Array: "+listaPolimorfica);
		
		listaPolimorfica = new LinkedList<>();
		
		listaPolimorfica.add("Linked1");
		listaPolimorfica.add("Linked2");
		listaPolimorfica.add("Linked3");
		
		
		System.out.println("Elementos da lista Linked: "+listaPolimorfica);
	}

}
