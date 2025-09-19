package br.com.alura.exercicios.exercicio03;

public class Quadrado implements Forma{
	int lado1;
	int lado2;
	
	public Quadrado(int lado1,int lado2){
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public void calcularArea() {
		System.out.println("Área do quadrado: " + lado1*lado2);
		
	}

}
