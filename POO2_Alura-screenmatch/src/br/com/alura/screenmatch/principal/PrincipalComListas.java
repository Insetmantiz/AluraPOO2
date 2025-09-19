package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
	public static void main(String args[]){
		Filme meuFilme = new Filme("O poderoso chefão",1972);
		meuFilme.avalia(8);
		Serie minhaSerie = new Serie("Breaking Bad",2010);
		var filmeDoPaulo = new Filme("Dogville",2003);
		filmeDoPaulo.avalia(10);
		var filmeLegal = new Filme("Era do Gelo 3",2010);
		filmeLegal.avalia(6);
		
		ArrayList<Titulo> lista = new ArrayList<>();
		lista.add(filmeDoPaulo);
		lista.add(meuFilme);
		lista.add(filmeLegal);
		lista.add(minhaSerie);
		
		for(Titulo item:lista){
			System.out.println(item.getNome());
			if (item instanceof Filme) {
				Filme filme = (Filme)item; //Type casting para fazer o for entender que item é filme, caso estivesse fora do if daria um erro pois série não é filme.
				System.out.println("Classificação: " + filme.getClassificacao());
			}
		}
		
		ArrayList<String> buscaPorArtista = new ArrayList<>();
		buscaPorArtista.add("Jacqueline");
		buscaPorArtista.add("Adam Sandler");
		buscaPorArtista.add("Paulo");
		
		System.out.println("Antes de Ordenar:");
		System.out.println(buscaPorArtista);
		
		Collections.sort(buscaPorArtista);
		System.out.println("Depois de Ordenar");
		System.out.println(buscaPorArtista);
		
		System.out.println("Lisa de titulos ordenados: ");
		Collections.sort(lista);
		System.out.println(lista);
		
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println(lista);
		
		
		
		
		
		
		
	} 
}
