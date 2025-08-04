package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
	public static void main(String args[]){
		Filme meuFilme = new Filme();
		meuFilme.setNome("O poderoso chefão");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		meuFilme.exibeFichaTecnica();
		//System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
		//System.out.println("Média: "+ meuFilme.pegaMedia());
		System.out.println(" ");
		System.out.println(" ");
		
		
		Serie minhaSerie = new Serie();
		minhaSerie.setNome("Breaking Bad");	
		minhaSerie.setAnoDeLancamento(2013);
		minhaSerie.setAtiva(false);
		minhaSerie.setEpisodiosPorTemporada(6);
		minhaSerie.setTemporadas(5);
		minhaSerie.setMinutosPorEpisodio(90);
		minhaSerie.avalia(10);
		minhaSerie.avalia(10);
		minhaSerie.avalia(10);
		minhaSerie.avalia(10);
		minhaSerie.avalia(9);
		minhaSerie.avalia(9);
		minhaSerie.avalia(10);
		minhaSerie.exibeFichaTecnica();
		System.out.println("Duração em minutos: " + minhaSerie.getDuracaoEmMinutos());
		
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(minhaSerie);
		System.out.println(calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(minhaSerie);
		episodio.setTotalVisualizacoes(500);
		filtro.filtra(episodio);
	}
}
